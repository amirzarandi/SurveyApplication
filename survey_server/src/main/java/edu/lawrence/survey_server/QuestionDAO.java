package edu.lawrence.survey_server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Question> findByDate(String date) {
	String sql = "SELECT id, question, choices, date FROM survey.questions WHERE date=?";
        RowMapper<Question> rowMapper = new QuestionRowMapper();
        return jdbcTemplate.query(sql, rowMapper, date);
    }

}
