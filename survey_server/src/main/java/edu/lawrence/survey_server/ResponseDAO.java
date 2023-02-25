package edu.lawrence.survey_server;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ResponseDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public String save(Response response) {
        String insertSQL = "INSERT INTO survey.responses (question,response) values (?, ?)";
        jdbcTemplate.update(insertSQL,response.getQuestion(),response.getResponse());
        return "success";
    }
    
    public List<Vote> findByQuestion(String question) {
	String sql = "SELECT response, count(response) as votes FROM survey.responses where question = ? group by response";
        RowMapper<Vote> rowMapper = new VoteRowMapper();
        return jdbcTemplate.query(sql, rowMapper, question);
    }
}
