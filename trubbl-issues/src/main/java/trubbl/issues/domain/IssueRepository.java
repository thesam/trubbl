package trubbl.issues.domain;

import javax.inject.Named;

import trubbl.sharedkernel.persistence.GenericRepository;

@Named
public class IssueRepository extends GenericRepository<Issue> {

	public IssueRepository() {
		// Demo data
		create(new Issue("Foo", "Bar"));
	}
}
