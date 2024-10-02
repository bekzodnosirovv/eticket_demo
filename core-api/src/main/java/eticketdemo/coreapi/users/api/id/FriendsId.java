package eticketdemo.coreapi.users.api.id;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;


public class FriendsId implements Serializable {
    private static final long serialVersionUID = 3L;

    private final String identifier;

    public FriendsId() {
        this(UUID.randomUUID().toString());
    }

    public FriendsId(String identifier) {
        Assert.notNull(identifier, "identifier must not be null");
        this.identifier = identifier;
    }

    @JsonValue
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendsId friendsId = (FriendsId) o;
        return Objects.equals(identifier, friendsId.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identifier);
    }

    @Override
    public String toString() {
        return getIdentifier();
    }
}
