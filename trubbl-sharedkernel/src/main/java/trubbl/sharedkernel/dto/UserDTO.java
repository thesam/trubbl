package trubbl.sharedkernel.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

    @JsonProperty
    private String id;
    @JsonProperty
    private String nick;
    @JsonProperty
    private String motto;

    public UserDTO(String id, String nick, String motto) {
        this.id = id;
        this.nick = nick;
        this.motto = motto;
    }

    public String getNick() {
        return nick;
    }

    public String getMotto() {
        return motto;
    }

    // REST
    public UserDTO() {
    }
}