package eticketdemo.coreapi.express.request.ticket.groupTicket.buy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyTicketPassengers {

    @XmlElement(name = "Blank")
    private List<BuyTicketBlank> Blank;
}
