package com.example.Ecommerce.Service;

import com.example.Ecommerce.Model.User;
import com.example.Ecommerce.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public User save(User user){
       return userRepo.save(user);
    }

    public Optional<User> updateuser(User user){
        Optional<User>updateuser=userRepo.saveAndFlush(user);
        return updateuser;
    }



}
