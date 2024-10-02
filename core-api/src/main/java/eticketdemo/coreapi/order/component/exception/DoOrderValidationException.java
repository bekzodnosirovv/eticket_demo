package eticketdemo.coreapi.order.component.exception;

import eticketdemo.coreapi.coreapi.api.ValidatorError;
import lombok.Data;


public class DoOrderValidationException extends RuntimeException {

    private ValidatorError validatorError;

    public DoOrderValidationException(ValidatorError validatorError) {
        super("Order data validation error");
        this.validatorError = validatorError;
    }

    public ValidatorError getValidatorError() {
        return validatorError;
    }

    public void setValidatorError(ValidatorError validatorError) {
        this.validatorError = validatorError;
    }
}
