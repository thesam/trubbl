package trubbl.issues.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IssueController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}