package entidades;

import java.util.UUID;

public abstract class Entity {
    private UUID _id;

    public UUID getId() {
        return _id;
    }

    public void setId(UUID _id) {
        this._id = _id;
    }
}
