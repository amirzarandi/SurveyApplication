package edu.lawrence.survey_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class VoteRowMapper implements RowMapper<Vote> {
    @Override
    public Vote mapRow(ResultSet row, int rowNum) throws SQLException {
        Vote v = new Vote();
        v.setResponse(row.getString("response"));
        v.setVotes(row.getInt("votes"));
        return v;
    }
}
