package com.saber.spring_consul_demo.controllers;

import com.saber.spring_consul_demo.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services/users",produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@RefreshScope
public class UserController {

    @Value(value = "${service.api.username}")
    private String username;
    @Value(value = "${service.api.password}")
    private String password;

    @GetMapping(value = "/default")
    public ResponseEntity<UserDto> defaultUser(){

        UserDto userDto = new UserDto();
        userDto.setUsername(username);
        userDto.setPassword(password);

        log.info("User ===> "+userDto);
        return ResponseEntity.ok(userDto);
    }

}
