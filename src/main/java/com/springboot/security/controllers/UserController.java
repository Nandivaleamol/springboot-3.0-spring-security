package com.springboot.security.controllers;

import com.springboot.security.dto.UserDto;
import com.springboot.security.entities.User;
import com.springboot.security.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    // Go to Registration Page
    @GetMapping("/register")
    public String register() {
        return "registerUser";
    }

    // Read Form data to save into DB
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute User user, Model model)
    {
        var userDto = this.modelMapper.map(user, UserDto.class);
        Integer id = userService.saveUser(userDto);
        String message = "User '"+id+"' saved successfully !";
        model.addAttribute("msg", message);
        return "registerUser";
    }
}
