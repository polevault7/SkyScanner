package tech.itpark.skyscanner.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tech.itpark.skyscanner.exception.DataAccessException;
import tech.itpark.skyscanner.exception.NotFoundException;
import tech.itpark.skyscanner.model.Flight;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public class FlightManager {
    private final DataSource dataSource;

    public List<Flight> getAll() {
        try {
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "select id, aircraft_id, source_city, destination_city, departure_time, arrival_time," +
                            " journey_duration, price  from flights order by id limit 50");

            List<Flight> items = new ArrayList<>();

            while (rs.next()) {
                items.add(mapRow(rs));
            }
            return items;
        } catch (SQLException e) {
            throw new DataAccessException();
        }
    }


    public Flight getById(long id) {

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select id, aircraft_id, source_city," +
                        " destination_city, departure_time, arrival_time,journey_duration, price" +
                        " from flights where id = ?")
        ) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapRow(rs);
            }
            throw new NotFoundException();
        } catch (SQLException e) {
            throw new DataAccessException();
        }
    }

    public List<Flight> getByAircraftId(long aircraftId) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select id, aircraft_id, source_city," +
                        " destination_city, departure_time, arrival_time,journey_duration, price" +
                        " from flights where aircraft_id = ?")
        ) {
            stmt.setLong(1, aircraftId);
            List<Flight> items = new ArrayList<>();
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                items.add(mapRow(rs));

            }
            return items;
        } catch (SQLException e) {
            throw new DataAccessException();
        }
    }

    public Flight save(Flight item) {
        if (item.getId() == 0) {
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement stmt = connection.prepareStatement(
                            "insert into flights(aircraft_id, source_city, destination_city," +
                                    " departure_time, arrival_time, journey_duration, price) VALUES (?, ?, ?, ?, ?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS
                    )
            ) {
                int index = 0;
                stmt.setLong(++index, item.getAircraftId());
                stmt.setString(++index, item.getSourceCity());
                stmt.setString(++index, item.getDestCity());
                stmt.setLong(++index, item.getDepartureTime());
                stmt.setLong(++index, item.getArrivalTime());
                stmt.setLong(++index, item.getJourneyDuration());
                stmt.setInt(++index, item.getPrice());

                stmt.execute();

                try (ResultSet keys = stmt.getGeneratedKeys()) {
                    if (keys.next()) {
                        long id = keys.getLong(1);
                        return getById(id);
                    }

                    throw new DataAccessException("No keys generated");
                }

            } catch (SQLException e) {
                throw new DataAccessException(e);
            }

        }

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement("update flights set aircraft_id = ?," +
                        " source_city = ?, destination_city= ?, departure_time = ?, arrival_time = ?," +
                        " journey_duration = ?, price = ? where id = ?")
        ) {
            int index = 0;
            stmt.setLong(++index, item.getAircraftId());
            stmt.setString(++index, item.getSourceCity());
            stmt.setString(++index, item.getDestCity());
            stmt.setLong(++index, item.getDepartureTime());
            stmt.setLong(++index, item.getArrivalTime());
            stmt.setLong(++index, item.getJourneyDuration());
            stmt.setInt(++index, item.getPrice());

            stmt.execute();
            return getById(item.getId());
        } catch (SQLException e) {
            throw new DataAccessException(e);
        }
    }

    public Flight removeById(long id) {
        Flight item = getById(id);

        try (Connection con = dataSource.getConnection();
             PreparedStatement stmt = con.prepareStatement("delete from flights where id = ?")
        ) {
            stmt.setLong(1, id);
            stmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    public List<Flight> search(String sourceCity, String destCity, long departureTime) {
        if (sourceCity.isEmpty()){
            return null;
        }

        if (destCity.isEmpty()){
            return null;
        }
        sourceCity = sourceCity.toUpperCase();
        destCity = destCity.toUpperCase();

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select id, aircraft_id, source_city," +
                        " destination_city, departure_time, arrival_time,journey_duration, price" +
                        " from flights where source_city = ? and destination_city = ?" +
                        " and departure_time >= ?")
        ) {
            stmt.setString(1, sourceCity);
            stmt.setString(2, destCity);
            stmt.setLong(3, departureTime);
            ResultSet rs = stmt.executeQuery();
            List<Flight> items = new ArrayList<>();
            while (rs.next()) {
                items.add(mapRow(rs));
            }
            return items;

        } catch (SQLException e) {
            throw new DataAccessException();
        }
    }

    private Flight mapRow(ResultSet rs) throws SQLException {
        return new Flight(
                rs.getLong("id"),
                rs.getLong("aircraft_id"),
                rs.getString("source_city"),
                rs.getString("destination_city"),
                rs.getLong("departure_time"),
                rs.getLong("arrival_time"),
                rs.getLong("journey_duration"),
                rs.getInt("price")
        );
    }
}
