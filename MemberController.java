package com.adalitek.mph.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.adalitek.mph.model.PatientRegistration;
import com.adalitek.mph.model.User;
import com.adalitek.mph.service.PatientRegistrationService;
import com.adalitek.mph.service.UserService;

@Controller
@RequestMapping("/adalitek/member-provider-hub")
public class MemberController {

 @Autowired
 private PatientRegistrationService patientService;
 
 @Autowired
 private UserService userService;
 
 private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
 
 
 @RequestMapping(value= {"/member/home"}, method=RequestMethod.GET)
 public ModelAndView memberHome() {
  ModelAndView model = new ModelAndView();
  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
  User user = userService.findUserByEmail(auth.getName());
  model.addObject("userName", user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
  model.addObject("memberName", user.getName() + " " + user.getLastName());
  logger.info("User "+user.getName() + "Login successfully to Member Home");
  model.setViewName("member/memberHome");
  return model;
 }
 
 @RequestMapping(value= {"/member/patientRegistrationSystem"}, method=RequestMethod.GET)
 public ModelAndView patientRegistrationSystem() {
  ModelAndView model = new ModelAndView();
  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
  User user = userService.findUserByEmail(auth.getName());
  model.addObject("userName", user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
  model.addObject("memberName", user.getName() + " " + user.getLastName());
  logger.info("User "+user.getName() + "Login successfully to Member Home");
  model.setViewName("member/patientRegistrationSystem");
  return model;
 }
 

 
 @RequestMapping(value= {"/member/patientRegistration"}, method=RequestMethod.GET)
 public ModelAndView patientRegistration() {
  ModelAndView model = new ModelAndView();
  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
  PatientRegistration patient = patientService.findUserByEmail(auth.getName());
  model.addObject("userName", patient.getFirstName() + " " + patient.getLastName() + " (" + patient.getEmail() + ")");
  model.addObject("memberName", patient.getFirstName() + " " + patient.getLastName());
  logger.info("User "+patient.getFirstName() + "Login successfully to Member Home");
  model.setViewName("member/patientRegistration");
  return model;
 }
 
 
 @RequestMapping(value= {"/member/patientRegistration"}, method=RequestMethod.POST)
 public ModelAndView createUser(@Valid PatientRegistration patient, BindingResult bindingResult) {
  ModelAndView model = new ModelAndView();
  /* PatientRegistration patientExists = patientService.findUserByEmail(patient.getEmail());
  
  if(patientExists != null) {
   bindingResult.rejectValue("email", "error.user", "This email already exists!");
   logger.error("User Signup Error: This email already exists! Email id :" +patient.getEmail());
  } */
  if(bindingResult.hasErrors()) {
   model.setViewName("/member/patientRegistration");
  } else {
	patientService.savePatientRegistration(patient);
   model.addObject("msg", "Patient registered successfully!");
   //model.addObject("user", new User());
   model.setViewName("/member/patientRegistration");
  }
  logger.info("User has been Registered Successfully!");
  return model;
 }
 
 @RequestMapping(value= {"/member/createAppointment"}, method=RequestMethod.GET)
 public ModelAndView createAppointment() {
  ModelAndView model = new ModelAndView();
  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
  PatientRegistration patient = patientService.findUserByEmail(auth.getName());
  model.addObject("userName", patient.getFirstName() + " " + patient.getLastName() + " (" + patient.getEmail() + ")");
  model.addObject("memberName", patient.getFirstName() + " " + patient.getLastName());
  logger.info("User "+patient.getFirstName() + "Login successfully to Member Home");
  model.setViewName("member/createAppointment");
  return model;
 }
 
}

