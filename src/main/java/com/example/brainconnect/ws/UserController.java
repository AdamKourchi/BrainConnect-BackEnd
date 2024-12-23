package com.example.brainconnect.ws;

import com.example.brainconnect.entity.LoginRequest;
import com.example.brainconnect.entity.Room;
import com.example.brainconnect.entity.User;
import com.example.brainconnect.service.RoomService;
import com.example.brainconnect.service.UserService;
import jakarta.transaction.Transactional;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user/")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("signup")
    public User signup(@RequestBody User user) {
        return userService.signup(user);
    }

    @PostMapping("login")
    public User login(@RequestBody LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }

    @PostMapping("save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @Transactional
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
