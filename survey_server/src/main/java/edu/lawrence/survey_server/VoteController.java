package edu.lawrence.survey_server;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/votes")
@CrossOrigin(origins="*")
public class VoteController {
    private ResponseDAO responseDAO;
    
    public VoteController(ResponseDAO dao) {
        this.responseDAO = dao;
    }
    
    @GetMapping(params={"question"})
    public List<Vote> votesByQuestion(@RequestParam String question) {
        return responseDAO.findByQuestion(question);
    }
}
