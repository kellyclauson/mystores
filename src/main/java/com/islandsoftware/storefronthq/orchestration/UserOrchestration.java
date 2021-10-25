package com.islandsoftware.storefronthq.orchestration;

import com.islandsoftware.storefronthq.data.UserDataService;
import com.islandsoftware.storefronthq.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@AllArgsConstructor
public class UserOrchestration {

    private final UserDataService userDataService;

    public User addUser(final String userName, final String email, final String dob) {
        final User user = new User();
        user.setUsername(userName);
        user.setEmail(email);
        user.setDob(dob);
        userDataService.addUser(user);
        return user;
    }

    public Collection<User> getUsers() {
        return userDataService.getUsers();
    }
}
