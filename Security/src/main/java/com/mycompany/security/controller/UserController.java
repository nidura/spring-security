/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.security.controller;

import com.mycompany.security.model.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public ResponseEntity listUser() {
        return new ResponseEntity(getUsers(), HttpStatus.OK);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity listUser(@PathVariable(value = "id") String id) {
        return new ResponseEntity(getUsers().stream().filter(user -> user.getIndexNo().equals(id)).findFirst().orElse(null), HttpStatus.OK);

    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public ResponseEntity listUser(@RequestBody User user) {
        return new ResponseEntity("18", HttpStatus.OK);
    }

    private List<User> getUsers() {
        return userRepository.findAll();

    }

}
