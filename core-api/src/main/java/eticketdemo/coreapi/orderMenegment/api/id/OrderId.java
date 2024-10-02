package eticketdemo.coreapi.orderMenegment.api.id;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class OrderId implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String identifier;

    public OrderId() {
        this(UUID.randomUUID().toString());
    }

    @JsonCreator
    public OrderId(String identifier) {
        Assert.notNull(identifier, "Identifier parameter must not be null!");
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
        OrderId orderId = (OrderId) o;
        return Objects.equals(identifier, orderId.identifier);
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
