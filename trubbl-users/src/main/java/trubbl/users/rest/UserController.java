package trubbl.users.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trubbl.sharedkernel.UserDTO;

@RestController
public class UserController {

    @RequestMapping("/")
    public UserDTO index() {
        return new UserDTO("uid", "nick");
    }

}