package com.islandsoftware.storefronthq.data;

import com.islandsoftware.storefronthq.domain.User;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class UserDataService {

    private final Map<String, User> users = new HashMap<>();

    public void addUser(final User user) {
        UUID uuid = UUID.randomUUID();
        user.setId(uuid.toString());
        users.put(uuid.toString(), user);
    }

    public Collection<User> getUsers() {
        return users.values();
    }
}
