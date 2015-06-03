package trubbl.issues.domain;

import trubbl.sharedkernel.persistence.GenericRepository;

import javax.inject.Named;

@Named
public class UserRepository extends GenericRepository<User> {

	public UserRepository() {
	}
}
