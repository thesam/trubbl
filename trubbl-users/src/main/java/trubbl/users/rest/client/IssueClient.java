package trubbl.users.rest.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import trubbl.sharedkernel.event.UserEvent;

@FeignClient("issues")
public interface IssueClient {
    @RequestMapping(method = RequestMethod.POST, value = "/users", consumes="application/json")
    void createUser(UserEvent user);
}
