//package com.sandbox.backendsandbox.security.services;
//
//
//import com.sandbox.backendsandbox.models.User;
//import com.sandbox.backendsandbox.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//
//@Service
//public class UserDetailsServiceImpl {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    @Transactional
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
//        User user= userRepository.findByUsername(username)
//                .orElseThrow(()-> new UsernameNotFoundException("User Not Found with username: "+username));
//        return UserDetailsImpl.build(user);
//    }
//}
