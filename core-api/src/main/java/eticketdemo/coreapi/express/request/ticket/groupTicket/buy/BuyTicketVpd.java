package eticketdemo.coreapi.express.request.ticket.groupTicket.buy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyTicketVpd {

    @XmlAttribute(name = "CarType")
    private String CarType;

    @XmlAttribute(name = "Date")
    private String Date;

    @XmlElement(name = "Doc")
    private String Doc;

}
