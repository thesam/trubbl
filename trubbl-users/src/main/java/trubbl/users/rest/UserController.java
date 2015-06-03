package trubbl.users.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import trubbl.sharedkernel.dto.UserDTO;
import trubbl.users.domain.User;
import trubbl.users.rest.client.IssueClient;

import javax.inject.Inject;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/")
public class UserController {

    @Inject
    IssueClient issueClient;

    @RequestMapping(method = RequestMethod.GET)
    public UserDTO index() {
        return new UserDTO("uid", "iggy", "blah blah blah");
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserDTO create(@RequestBody UserDTO user) {
        User aUser = new User(user.getNick(), user.getMotto());
        issueClient.createUser(aUser.asEvent());
        return aUser.asDTO();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@PathParam("id") String id) {

    }

}