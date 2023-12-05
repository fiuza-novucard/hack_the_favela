package com.aulas.spring.controllers;

import com.aulas.spring.models.User;
import com.aulas.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        if (user.getName() == null || user.getEmail() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        User savedUser = userRepository.save(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/busca/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User userFound = user.get();
            return new ResponseEntity<>(user.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User updatedUser, @PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            User userBusca = user.get();
            userBusca.setName(updatedUser.getName());
            userBusca.setEmail(updatedUser.getEmail());

            User userSalvar = userRepository.save(userBusca);
            return new ResponseEntity<>(userSalvar, HttpStatus.OK);

        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/busca/todos")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userRepository.findAll();

        return new ResponseEntity<>(userList, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



}
