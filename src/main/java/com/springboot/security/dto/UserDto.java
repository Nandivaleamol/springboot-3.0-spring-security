package com.springboot.security.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.util.List;

@Data
public class UserDto {

    private int id;
    private String name;
    private String email;
    private String about;

    @JsonIgnore
    private String password;
    private List<String> roles;
}
