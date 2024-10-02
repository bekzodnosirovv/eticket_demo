package org.example.ordermenejment.component;

import eticketdemo.coreapi.coreapi.api.ConstraintError;
import eticketdemo.coreapi.coreapi.api.ValidatorError;
import eticketdemo.coreapi.order.api.vObject.UserFriends;
import eticketdemo.coreapi.orderMenegment.api.CreateOrderCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class OrderValidation {


    public ValidatorError isValid(CreateOrderCommand command) {
        if (command.getBackward()) {
            List<ConstraintError> constraintErrors = new ArrayList<>();
            constraintErrors.add(new ConstraintError("Заказ", "",
                    "Сделайте дополнительный заказ на обратный билета!",
                    "Qaytish chiptasiga qo'shimcha buyurtma so'rovini yuboring!",
                    "Request an additional order for a return ticket!"));
            return new ValidatorError("Order data validation error", constraintErrors);
        }

        List<ConstraintError> constraintErrors = new ArrayList<>();

        boolean hasDifferentDoc = command.getPassengers().stream()
                .map(UserFriends::getDoc).distinct().count() != command.getPassengers().size();

        var isLuxCarType = command.getOrderRequest().stream().allMatch(it -> it.getCar().getType()
                .equals("Мягкий") && it.getCar().getClassService().equals("1А"));

        return null;
    }
}
