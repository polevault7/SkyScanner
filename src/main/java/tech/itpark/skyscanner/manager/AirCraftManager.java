package tech.itpark.skyscanner.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tech.itpark.skyscanner.exception.DataAccessException;
import tech.itpark.skyscanner.exception.NotFoundException;
import tech.itpark.skyscanner.model.AirCraft;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AirCraftManager {
    private final DataSource dataSource;

    public List<AirCraft> getAll() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(
                        "select id, airline, model, capacity from airCrafts order by id limit 50");
        ) {

            List<AirCraft> items = new ArrayList<>();
            while (rs.next()) {
                items.add(new AirCraft(
                        rs.getLong("id"),
                        rs.getString("airline"),
                        rs.getString("model"),
                        rs.getInt("capacity")
                ));
            }
            return items;
        } catch (SQLException e) {
            throw new DataAccessException();
        }
    }

    public AirCraft getById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select id, airline, model, capacity from airCrafts where id = ?");
        ) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new AirCraft(
                        rs.getLong("id"),
                        rs.getString("airline"),
                        rs.getString("model"),
                        rs.getInt("capacity")
                );
            }
            throw new NotFoundException();
        } catch (SQLException e) {
            throw new DataAccessException();
        }

    }

    public AirCraft save(AirCraft item) {
        if (item.getId() == 0) {
            try (
                    Connection connection = dataSource.getConnection();
                    PreparedStatement stmt = connection.prepareStatement(
                            "insert into airCrafts(airline, model, capacity) VALUES (?, ?, ?)",
                            Statement.RETURN_GENERATED_KEYS
                    );
            ) {
                int index = 0;
                stmt.setString(++index, item.getAirline());
                stmt.setString(++index, item.getModel());
                stmt.setInt(++index, item.getCapacity());

                stmt.execute();

                try(ResultSet keys = stmt.getGeneratedKeys();){
                    if (keys.next()){
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
                PreparedStatement stmt = connection.prepareStatement("update airCrafts set airline = ?, model = ?, capacity= ? where id = ?");
        ) {
            int index = 0;
            stmt.setString(++index, item.getAirline());
            stmt.setString(++index, item.getModel());
            stmt.setInt(++index, item.getCapacity());
            stmt.setLong(++index, item.getId());

            stmt.execute();
            return getById(item.getId());
        } catch (SQLException e) {
            throw new DataAccessException(e);
        }
    }

    public AirCraft removeById(long id) {
        AirCraft item = getById(id);

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement stmt = connection.prepareStatement("delete from airCrafts where id = ?");
        ) {
            stmt.setLong(1, id);
            stmt.execute();

        } catch (SQLException e) {
            throw new DataAccessException(e);
        }
        return item;
    }


}

