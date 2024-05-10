package cn.charlie.strong.controller;

import cn.charlie.strong.entity.user.AuthUser;
import cn.charlie.strong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author charlie
 * @date 2024/4/25 16:27
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<AuthUser> getUserList() {
        return userService.list();
    }

    @PostMapping("")
    public AuthUser createUser(@RequestBody AuthUser authUser) {
        return userService.createUser(authUser);
    }
}
