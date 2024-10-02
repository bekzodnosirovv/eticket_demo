package org.example.ordermenejment.command;

import eticketdemo.coreapi.coreapi.api.ValidatorError;
import eticketdemo.coreapi.order.component.exception.DoOrderValidationException;
import eticketdemo.coreapi.orderMenegment.api.CreateOrderCommand;
import eticketdemo.coreapi.orderMenegment.api.id.OrderId;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.example.ordermenejment.component.OrderValidation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.UUID;


@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/orders")
public class OrderCommandController {


    private final CommandGateway commandGateway;

    private final OrderValidation orderValidation;

    @PostMapping(value = "create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<OrderId> createOrder(
            @RequestHeader(value = "client-api-address0", defaultValue = "") String ipAddress,
            @RequestHeader(value = "User-Agent") String userAgent,
            @RequestHeader(value = "userId") String userId,
            @RequestHeader(value = "username") String username,
            @RequestBody CreateOrderCommand command) throws Exception {

        log.info("--------------------------------------------------CreateOrderCommand  [ " + command.getOrderId() + " ]------------------------------------------------------");

        command.setIpAddress(UUID.randomUUID().toString());
        command.setUserAgent(userAgent);
        command.setIpAddress(ipAddress);

        command.setUserName(username);
        command.setUserId(userId);

        ValidatorError validatorError = orderValidation.isValid(command);

        if (!validatorError.getErrors().isEmpty()) {
            throw new DoOrderValidationException(validatorError);
        }

        return Mono.fromFuture(commandGateway.send(command));
    }

}
