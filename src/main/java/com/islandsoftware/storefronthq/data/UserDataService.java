package com.islandsoftware.storefronthq.data;

import com.islandsoftware.storefronthq.domain.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserDataService {

    private final Map<String, User> users = new HashMap<>();

    public void addUser(final User user) {
        users.put(user.getUserId(), user);
    }

    public User getUser(final String userId) {
        return users.get(userId);
    }

    public Collection<User> getUsers() {
        return users.values();
    }
}
