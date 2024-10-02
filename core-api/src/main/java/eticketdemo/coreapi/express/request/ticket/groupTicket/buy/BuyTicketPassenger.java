package eticketdemo.coreapi.express.request.ticket.groupTicket.buy;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class BuyTicketPassenger {

    @XmlElement(name = "Prefix")
    private String Prefix;

    @XmlElement(name = "TCar")
    private String TCar;

    @XmlElement(name = "ChildBirthday")
    private String ChildBirthday;

    @XmlElement(name = "DocType")
    private String DocType;

    @XmlElement(name = "Doc")
    private String Doc;

    @XmlElement(name = "Name")
    private String Name;

    @XmlElement(name = "BirtDay")
    private String BirthDay;

    @XmlElement(name = "Citizenship")
    private String Citizenship;

    @XmlElement(name = "Birthplace")
    private String Birthplace;

    @XmlElement(name = "Sex")
    private String Sex;

    @XmlElement(name = "Det5")
    private String Det5;

}
