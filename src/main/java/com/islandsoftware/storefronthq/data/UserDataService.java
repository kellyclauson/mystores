package com.islandsoftware.storefronthq.data;

import com.islandsoftware.storefronthq.domain.User;
import com.islandsoftware.storefronthq.mappers.BaseUserUser;
import com.islandsoftware.storefronthq.model.BaseUser;
import com.islandsoftware.storefronthq.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
@AllArgsConstructor
public class UserDataService {

    private final BaseUserUser baseUserUser;
    private final UserRepository userRepository;

    private final Map<String, User> users = new HashMap<>();

//    public void addUser(final User user) {
//        users.put(user.getUserId(), user);
//    }
    public User addUser(BaseUser baseUser) {
        User user = baseUserUser.BaseUserToUser(baseUser);
//        return userRepository.addUser(user);
        userRepository.save(user);
        return user;
    }


//    public User getUser(final String userId) {
//        return users.get(userId);
//    }
    public User getUser(final Integer userId) {
//        return users.get(userId);
//        return userRepository.getById(userId);
        return userRepository.findById(userId).get();
    }


    public Collection<User> getUsers() {
        return users.values();
    }
}
