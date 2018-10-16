package com.itm.mybatis2.controller;

import com.itm.mybatis2.model.User;
import com.itm.mybatis2.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
* @description UserController
* @author hao.yang
* @create 2018-07-31 
*/
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "hello";
    }


    @GetMapping("/getUserById")
    public User getUserById(@RequestParam Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        userService.save(user);
    }
}
