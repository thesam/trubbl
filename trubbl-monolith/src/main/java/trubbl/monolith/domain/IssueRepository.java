package trubbl.monolith.domain;

import trubbl.sharedkernel.persistence.GenericRepository;

import javax.inject.Named;

@Named
public class IssueRepository extends GenericRepository<Issue> {

	public IssueRepository() {
		// Demo data
		create(new Issue("Foo", "Bar"));
	}
}
