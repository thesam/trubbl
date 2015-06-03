package trubbl.issues.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import trubbl.issues.domain.Issue;
import trubbl.issues.domain.IssueRepository;

import javax.inject.Inject;
import java.util.Collection;

@RestController
@RequestMapping("/")
public class IssueController {

    @Inject
    private IssueRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Issue> searchIssues() {
        return repository.search();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createIssue(@RequestBody Issue issue) {
        repository.create(issue);
    }

}