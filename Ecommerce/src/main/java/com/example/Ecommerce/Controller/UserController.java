package com.example.Ecommerce.Controller;

import com.example.Ecommerce.Model.User;
import com.example.Ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")

public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.OK)
    public User save(@RequestBody User user){
        return userService.save(user);
    }
//    @DeleteMapping("/deleted")
//    @ResponseStatus(HttpStatus.OK)
//    public void deleteduser(@RequestBody User user){
//        userService.deleteduser(user);
//
//    }
    @PutMapping("/update")
    public User updateuser (@RequestBody User user){
  return  userService.updateuser(user);
    }



}
