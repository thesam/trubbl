package trubbl.issues.domain;

import java.util.UUID;

public class Issue {

    public final UUID id;
    public final String title;
    public final String description;

    public Issue(String title, String description) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
    }
}
