package eticketdemo.coreapi.order.api.vObject;

import eticketdemo.coreapi.discount.api.enums.DiscountType;
import eticketdemo.coreapi.order.component.enums.PassengerRole;
import eticketdemo.coreapi.users.api.id.FriendsId;
import eticketdemo.coreapi.users.api.id.UserId;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserFriends implements Serializable {
    private static final long serialVersionUID = 2L;

    private FriendsId friendsId = new FriendsId();
    private UserId userId;
    private String firstName;
    private String lastName;
    private String midName;
    private String sex;
    private String birthday;
    private String citizenship;
    private String docType;
    private String doc;
    private String regionId;
    private boolean child5From10 = false;
    private String pnfl;
    private String studentId;
    private DiscountType discountType;
    private UserFriends children;
    private PassengerRole role = PassengerRole.PASSENGER;
}
