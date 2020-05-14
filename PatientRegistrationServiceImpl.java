package com.adalitek.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.adalitek.mph.model.Role;
import com.adalitek.mph.model.User;
import com.adalitek.mph.repository.RoleRepository;
import com.adalitek.mph.repository.UserRepository;

import java.util.Arrays;
import java.util.HashSet;

@Service("patientRegistrationService")
public class PatientRegistrationServiceImpl implements UserService {
 
 @Autowired
 private UserRepository userRepository;
 
 @Autowired
 private RoleRepository roleRepository;
 
 @Autowired
 private BCryptPasswordEncoder bCryptPasswordEncoder;

 @Override
 public User findUserByEmail(String email) {
  return userRepository.findByEmail(email);
 }

 @Override
 public void saveUser(User user) {
  userRepository.save(user);
 }

}
