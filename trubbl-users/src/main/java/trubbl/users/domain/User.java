package trubbl.users.domain;

import trubbl.sharedkernel.dto.UserDTO;
import trubbl.sharedkernel.event.UserEvent;

import java.util.UUID;

public class User {

    public final UUID id;
    public final String nick;
    public final String motto;

    public User(String nick, String motto) {
        this.id = UUID.randomUUID();
        this.nick = nick;
        this.motto = motto;
    }

    public UserDTO asDTO() {
        return new UserDTO(id.toString(), nick, motto);
    }

    public UserEvent asEvent() {
        return new UserEvent(id.toString(), nick);
    }
}
