package trubbl.issues.rest;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import trubbl.issues.domain.Issue;
import trubbl.issues.domain.IssueRepository;

@RestController
public class IssueController {

	@Inject
	private IssueRepository repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Collection<Issue> searchIssues() {
		return repository.search();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void createIssue(@RequestBody Issue issue) {
		repository.create(issue);
	}

}