package eticketdemo.coreapi.orderMenegment.api

import eticketdemo.coreapi.express.request.ticket.buy.gtETicketRequestBuyTicket
import eticketdemo.coreapi.order.api.vObject.UserFriends
import eticketdemo.coreapi.orderMenegment.api.id.OrderId
import org.axonframework.modelling.command.TargetAggregateIdentifier
import javax.management.Notification

abstract class OrderCommand(@TargetAggregateIdentifier open val orderId: OrderId)

data class CreateOrderCommand(
    override val orderId: OrderId = OrderId(),
    var selfDepartureAgreed: Boolean? = false,
    val backward: Boolean = false,
    val withInsurance: Boolean? = false,
    val withSmsNotification: Boolean? = false,
    val passengers: List<UserFriends>,
    val orderRequest: List<gtETicketRequestBuyTicket>,
    var passengersCount: Int? = 0,
    var adultPassCount: Int? = 0,
    var phone: String? = "",

    ) : OrderCommand(orderId) {
    var newReservationId: String = ""
    var userId: String = ""
    var userName: String = ""
    var userAgent: String = ""
    var ipAddress: String = ""
    var additionalCustomEmail: String = ""
}