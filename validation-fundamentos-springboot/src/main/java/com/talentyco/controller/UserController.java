package com.talentyco.controller;

import com.talentyco.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

@RestController
public class UserController {

    @PostMapping("/users")
    ResponseEntity<String > addUser(@Valid @ResponseBody User user) {


        return ResponseEntity.ok("User is Valid");
    }

}
