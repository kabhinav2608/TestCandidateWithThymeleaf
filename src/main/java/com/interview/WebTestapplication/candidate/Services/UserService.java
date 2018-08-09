package com.interview.WebTestapplication.candidate.Services;

import com.interview.WebTestapplication.candidate.Entity.User;
import com.interview.WebTestapplication.candidate.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findByUserName(String userName)  {
       return this.userRepository.findByUserName(userName);
    }
}
