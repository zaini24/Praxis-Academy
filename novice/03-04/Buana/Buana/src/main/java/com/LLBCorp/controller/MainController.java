package com.LLBCorp.controller;

// import java.util.optional;
import com.LLBCorp.model.User;
import com.LLBCorp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path="/zaini")
public class MainController {
    @Autowired
    public UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody User addNewUser (@RequestBody User user){
        return userRepository.save(user);
    }
    
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/zaini/{id}")
    User userById(@PathVariable Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    // @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    // public User getUserById(@PathVariable("id") Long id){
    //     User user = userService.getUsers(id);
    //     System.out.println(user);
    //     return user;
    // }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        userRepository.deleteById(id);
    }

    @PutMapping("/update/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Integer id){
        return userRepository.findById(id)
        .map(user ->{
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            return userRepository.save(newUser);
        }).orElseGet(() -> {
            newUser.setId(id);
            return userRepository.save(newUser);
        });
    }
}