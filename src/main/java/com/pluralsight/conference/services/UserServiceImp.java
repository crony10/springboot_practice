package com.pluralsight.conference.services;

import com.pluralsight.conference.model.User;
import com.pluralsight.conference.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImp implements UserService {

//    private final UserRepository userRepository;
//
//    public UserServiceImp(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }
}
