package eticketdemo.coreapi.express.request.ticket.buy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyTicketRequirements {

    @XmlElement(name = "SeatsTop")
    private String SeatsTop;

    @XmlElement(name = "SeatsBottom")
    private String SeatsBottom;

    @XmlElement(name = "SeatsRange")
    private String SeatsRange;

    @XmlElement(name = "SeatsComp")
    private String SeatsComp;

    @XmlElement(name = "WeBedding")
    private String WeBedding;

    @XmlElement(name = "CompType")
    private String CompType;

    @XmlElement(name = "SeatsArea")
    private String SeatsArea;

    @XmlElement(name = "PayFood")
    private String PayFood;

}
