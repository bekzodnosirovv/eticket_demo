package eticketdemo.coreapi.express.request.ticket.buy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyTicketCar {

    @XmlAttribute(name = "Type")
    private String Type;

    @XmlAttribute(name = "Number")
    private String Number;

    @XmlAttribute(name = "ClassService")
    private String ClassService;

    @XmlAttribute(name = "ClassServiceInt")
    private String ClassServiceInt;

}
