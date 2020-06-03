package com.patkadevelopment.Controller;


import com.patkadevelopment.Model.User;
import com.patkadevelopment.Service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    // TODO: 29/05/2020 Change import, delete commented out code
    private UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getUsers() {

        return userService.getUsers();
    }

    @PostMapping
    public User craeteUser(@RequestBody User user) {

        return userService.createUser(user);
    }

    @PutMapping
    public User editUser(@RequestBody User user) {

        return userService.updateUser(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable(value = "id") Long userId) {

        userService.deleteUser(userId);
    }

    @GetMapping (value = "/{userId}")
    public User getUser(@PathVariable (value = "userId") Long userId) {

        return userService.getUser(userId);
    }

}
