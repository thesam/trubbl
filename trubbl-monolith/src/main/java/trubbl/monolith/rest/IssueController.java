package trubbl.monolith.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import trubbl.monolith.domain.Issue;
import trubbl.monolith.domain.IssueRepository;

import javax.inject.Inject;
import java.util.Collection;

@RestController
@RequestMapping("/issues")
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