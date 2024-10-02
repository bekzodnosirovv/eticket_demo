package eticketdemo.coreapi.express.request.ticket.buy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.Data;
import lombok.ToString;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyTicketTrain {

    @XmlAttribute(name = "Number")
    private String Number;


}
