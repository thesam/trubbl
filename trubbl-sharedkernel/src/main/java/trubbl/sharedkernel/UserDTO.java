package trubbl.sharedkernel;

public class UserDTO {

    private final String id;
    private final String nick;

    public UserDTO(String id, String nick) {
        this.id = id;
        this.nick = nick;
    }

    public String getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }
}