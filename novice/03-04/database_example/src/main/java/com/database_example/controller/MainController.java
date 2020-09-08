package com.database_example.controller;



import java.util.Optional;

import com.database_example.model.User;
import com.database_example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PutMapping;


@RestController 
@RequestMapping(path="/demo") 
public class MainController {
  @Autowired 
  private UserRepository userRepository;

  @PostMapping(path="/add") 
  public @ResponseBody String addNewUser (@RequestParam String name
      , @RequestParam String email) {

    User n = new User();
    n.setName(name);
    n.setEmail(email);
    userRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {

    return userRepository.findAll();
  }

  @DeleteMapping("/delete/{id}")
  public void deleteUser(@PathVariable Long id){
    userRepository.deleteById(id);
  }

  // @PutMapping("/update/{id}")
  // public  User updateUser(@RequestBody User newUser, @PathVariable Long userId){
  //   return userRepository.findById(userId).map(
  //     user -> {
  //     user.setName(newUser.getName());
  //     user.setEmail(newUser.getEmail());
  //     return userRepository.save(user);
  //     }).orElseGet(() -> {
  //       newUser.setId(userId);
  //       return userRepository.save(newUser);
  //     });

  // @PutMapping("/update/{id}")
  // public User updateUser(@RequestBody User newUser, @PathVariable Long userId){

  //   User user = userRepository.findById(userId);
    
  //   user.setEmail(newUser.getEmail());
  //   user.setName(newUser.getName());

  //   return userRepository.save(user);

    // final User updatedUser = userRepository.save(user);
    // return ResponseEntity.ok(updatedUser);
  // }


  
}