package com.islandsoftware.storefronthq.controllers;

import com.islandsoftware.storefronthq.domain.User;
import com.islandsoftware.storefronthq.orchestration.UserOrchestration;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserOrchestration userOrchestration;

    @PostMapping("/user/{userName}/{email}")
    public User addUser(@PathVariable("userName") final String userName,
                        @PathVariable("email") final String email,
                        @RequestParam(name = "dob", required = false) final String dob) {
        return userOrchestration.addUser(userName, email, dob);
    }

    @GetMapping("/user")
    public Collection<User> getUsers() {
        return userOrchestration.getUsers();
    }
}
