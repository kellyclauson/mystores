package com.islandsoftware.storefronthq.controllers;

import com.islandsoftware.storefronthq.domain.Shop;
import com.islandsoftware.storefronthq.domain.User;
import com.islandsoftware.storefronthq.orchestration.UserOrchestration;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserOrchestration userOrchestration;

    @PostMapping("/user/{userId}")
    public User addUser(@PathVariable("userId") final String userId,
                        @RequestParam(name = "dob", required = false) final String dob) {
        return userOrchestration.addUser(userId, dob);
    }

    @GetMapping("/users")
    public Collection<User> getUsers() {
        return userOrchestration.getUsers();
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable("userId") final String userId) {
        return userOrchestration.getUser(userId);
    }

    @PostMapping("/user/{userId}/shop/{shopId}/{shopEmail}/{shopAccessKey}")
    public Shop addShop(@PathVariable("userId") final String userId,
                        @PathVariable("shopId") final String shopId,
                        @PathVariable("shopEmail") final String shopEmail,
                        @PathVariable("shopAccessKey") final String shopAccessKey) throws Exception {
        return userOrchestration.addShop(userId, shopId, shopEmail, shopAccessKey);
    }
}
