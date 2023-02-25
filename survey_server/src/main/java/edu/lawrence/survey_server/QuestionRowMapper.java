package edu.lawrence.survey_server;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class QuestionRowMapper implements RowMapper<Question> {
    @Override
    public Question mapRow(ResultSet row, int rowNum) throws SQLException {
        Question q = new Question();
        q.setId(row.getInt("id"));
        q.setQuestion(row.getString("question"));
        q.setChoices(row.getString("choices"));
        q.setDate(row.getDate("date"));
        return q;
    }
}

