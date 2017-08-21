package com.aprilskin.service;

import com.aprilskin.entities.User;
import com.aprilskin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public org.springframework.security.core.userdetails.User loadUserByUsername(String userId) {
        User user = userRepository.findByUserId(userId);
        if(user == null) {
            throw new UsernameNotFoundException(userId);
        }

        return new org.springframework.security.core.userdetails.User(user.getUserId(), user.getPassword(), AuthorityUtils.createAuthorityList("USER"));
    }
}
