package com.learning.mobileappws.ui.controller;

import com.learning.mobileappws.ui.model.request.UserRequestModel;
import com.learning.mobileappws.ui.model.response.UserRest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping(value = "/{userId}",produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
})
    public ResponseEntity<UserRest> getUser(@PathVariable String userId){
        UserRest userRest = new UserRest();
        userRest.setUserId(userId);
        userRest.setFirstName("shivam");
        userRest.setLastName("Rai");
        userRest.setMail("shivam@mail.com");
        return new ResponseEntity<UserRest>(userRest,HttpStatus.OK);
    }
    @GetMapping
    public String getUsers(@RequestParam(value = "page",defaultValue = "1")int page,
                           @RequestParam(value = "limit",defaultValue = "50")int limit,
                           @RequestParam(value = "sort",defaultValue = "desc",required = false)String sort){
        return "getUsersCalled";

    }
    @PostMapping(consumes = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    },produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity<UserRest> createUser(@Valid @RequestBody UserRequestModel userRequestModel){
        UserRest userRest = new UserRest();
        userRest.setFirstName(userRequestModel.getFirstName());
        userRest.setLastName(userRequestModel.getLastName());
        userRest.setMail(userRequestModel.getMail());
        return new ResponseEntity<>(userRest,HttpStatus.CREATED);
    }
    @PutMapping()
    public String updateUser(){
        return "x";
    }
    @DeleteMapping()
    public String deleteUser(@RequestParam(value="userId") Long userId){
        return "x";
    }
}
