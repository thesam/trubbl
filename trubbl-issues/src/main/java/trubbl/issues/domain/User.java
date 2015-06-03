package trubbl.issues.domain;

import trubbl.sharedkernel.domain.Key;
import trubbl.sharedkernel.domain.Keyable;

public class User implements Keyable {
    private Key key;
    private String nick;

    public User(Key key, String nick) {
        this.key = key;
        this.nick = nick;
    }

    @Override
    public Key key() {
        return this.key;
    }

    public String nick() {
        return this.nick;
    }
}
