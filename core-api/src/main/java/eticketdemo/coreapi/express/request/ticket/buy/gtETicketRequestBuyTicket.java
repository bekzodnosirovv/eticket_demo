package eticketdemo.coreapi.express.request.ticket.buy;

import eticketdemo.coreapi.express.request.ticket.groupTicket.buy.BuyTicketPassengers;
import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
@XmlRootElement(name = "gtETicket_Request")
@XmlAccessorType(XmlAccessType.FIELD)
public class gtETicketRequestBuyTicket implements Serializable {

    @XmlAttribute(name = "Type")
    private String Type = "BuyTicket";

    @XmlElement(name = "StationFrom")
    private String StationFrom;

    @XmlElement(name = "StationTo")
    private String StationTo;

    @XmlElement(name = "DepDate")
    private String DepDate;

    @XmlElement(name = "DepTime")
    private String DepTime;

    @XmlElement(name = "Train")
    private BuyTicketTrain Train;

    @XmlElement(name = "Car")
    private BuyTicketCar Car;

    @XmlElement(name = "Requirements")
    private BuyTicketRequirements Requirements;

    @XmlElement(name = "CreditCard")
    private String CreditCard;

    @XmlElement(name = "WoSeats")
    private String WoSeats;

    @XmlElement(name = "SubAgent")
    private String SubAgent;

    @XmlElement(name = "WoCom")
    private String WoCom;

    @XmlElement(name = "Passengers")
    private BuyTicketPassengers Passengers;

}
