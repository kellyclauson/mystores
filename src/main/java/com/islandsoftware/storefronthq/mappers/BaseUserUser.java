package com.islandsoftware.storefronthq.mappers;

import com.islandsoftware.storefronthq.domain.User;
import com.islandsoftware.storefronthq.model.BaseUser;
import org.springframework.stereotype.Component;

@Component
public class BaseUserUser {

    public User BaseUserToUser(BaseUser baseUser){
        User user = new User();
        user.setUsername(baseUser.getUsername());
        user.setEmail(baseUser.getEmail());

        return user;
    }


}
