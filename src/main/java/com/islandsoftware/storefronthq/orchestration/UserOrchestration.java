package com.islandsoftware.storefronthq.orchestration;

import com.islandsoftware.storefronthq.data.UserDataService;
import com.islandsoftware.storefronthq.domain.Shop;
import com.islandsoftware.storefronthq.domain.User;
import com.islandsoftware.storefronthq.model.BaseUser;
import com.islandsoftware.storefronthq.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Collection;
import java.util.List;

@Component
@AllArgsConstructor
public class UserOrchestration {

    private final UserDataService userDataService;
    private final  UserRepository userRepository;

//    public User addUser(final String userId, final String dob) {
//        final User user = new User();
//        user.setUserId(userId);
//        user.setDob(dob);
////        userDataService.addUser(user);
//        userRepository.save(user);
//
//        return user;
//    }
    public User addUser(BaseUser baseUser) {
        return userDataService.addUser(baseUser);
    }

    public Collection<User> getUsers() {
        return userRepository.findAll();
    }

//    public Collection<User> getUsers() {
//        return userDataService.getUsers();
//    }

    public User getUser(final Integer userId) {
        return userDataService.getUser(userId);
    }

//    public Shop addShop(final String userId, final String shopId, final String shopEmail, final String shopPassword) throws Exception{
//        final User user = userDataService.getUser(userId);
//        if (user == null)  {
//            throw new Exception("User Not Found: userId=" + userId);
//        }
//        Shop newShop = new Shop();
//
//        newShop.setId(shopId);
//        newShop.setShopEmail(shopEmail);
//        newShop.setShopPassword(shopPassword);
//        user.getShops().add(newShop);
//        return newShop;
//    }

}
