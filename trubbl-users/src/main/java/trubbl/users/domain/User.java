package trubbl.users.domain;

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
}
