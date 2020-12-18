package tech.itpark.skyscanner.mapper;



import org.springframework.jdbc.core.RowMapper;
import tech.itpark.skyscanner.model.Flight;
import tech.itpark.skyscanner.model.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketRowMapper implements RowMapper<Ticket> {
    @Override
    public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Ticket(
                rs.getLong("id"),
                new Flight(
                        rs.getLong("flight_id"),
                        rs.getLong("aircraft_id"),
                        rs.getString("source_city"),
                        rs.getString("destination_city"),
                        rs.getLong("arrival_time"),
                        rs.getLong("departure_time"),
                        rs.getLong("journey_duration"),
                        rs.getInt("price")
                ),
                        rs.getString("passenger_name")
        );
    }
}
