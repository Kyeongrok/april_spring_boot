package com.aprilskin.service;

import com.aprilskin.entities.Manager;
import com.aprilskin.entities.User;
import com.aprilskin.repositories.ManagerRepository;
import com.aprilskin.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class SpringDataJpaUserDetailsService implements UserDetailsService{
    private final ManagerRepository managerRepository;

    @Autowired
    public SpringDataJpaUserDetailsService(ManagerRepository managerRepository){
        this.managerRepository = managerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Manager manager = this.managerRepository.findByName(name);
        return new org.springframework.security.core.userdetails.User(manager.getName(), manager.getPassword(),
                AuthorityUtils.createAuthorityList(manager.getRoles()));
    }
}
