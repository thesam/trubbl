package trubbl.sharedkernel.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserEvent {
    @JsonProperty
    private String id;
    @JsonProperty
    private String nick;

    public UserEvent(String id, String nick) {
        this.id = id;
        this.nick = nick;
    }

    public String id() {
        return this.id;
    }

    public String nick() {
        return this.nick;
    }

    // REST
    public UserEvent() {
    }
}
