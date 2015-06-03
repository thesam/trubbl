package trubbl.issues.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import trubbl.issues.domain.User;
import trubbl.issues.domain.UserRepository;
import trubbl.sharedkernel.domain.Key;
import trubbl.sharedkernel.dto.UserDTO;
import trubbl.sharedkernel.event.UserEvent;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserConsumer {

    @Inject
    private UserRepository repository;

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody UserEvent userEvent) {
        repository.create(new User(new Key(userEvent.id()), userEvent.nick()));
    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<UserDTO> listUsers() {
        Collection<User> users = repository.search();
        List<UserDTO> dtos = new ArrayList<>();
        for (User user : users) {
            dtos.add(new UserDTO(user.key().toString(), user.nick(), null));
        }
        return dtos;
    }

}