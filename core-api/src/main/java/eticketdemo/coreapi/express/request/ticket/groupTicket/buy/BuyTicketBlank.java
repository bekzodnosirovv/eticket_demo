package eticketdemo.coreapi.express.request.ticket.groupTicket.buy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyTicketBlank {

    @XmlElement(name = "Vpd")
    private BuyTicketVpd Vpd;

    @XmlElement(name = "ReturnDate")
    private String ReturnDate;

    @XmlElement(name = "Passenger")
    private List<BuyTicketPassenger> Passenger;

    @XmlElement(name = "SeatsCount")
    private String SeatsCount;

    @XmlElement(name = "Tariff")
    private String Tariff;

    @XmlElement(name = "TariffCode")
    private String TariffCode;
}

