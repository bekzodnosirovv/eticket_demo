package eticketdemo.coreapi.discount.api.enums;

import java.util.Arrays;

public enum DiscountType {
    STUDENT, PENSIONER, DISABLED;

    public DiscountType find(String val) {
        return Arrays.stream(DiscountType.values())
                .filter(x -> x.name().equalsIgnoreCase(val))
                .findAny().orElse(null);
    }


}
