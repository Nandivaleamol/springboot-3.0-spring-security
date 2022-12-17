package com.springboot.security.services;

import com.springboot.security.dto.UserDto;
import com.springboot.security.entities.User;

public interface UserService {

     Integer saveUser(UserDto userDto);
}
