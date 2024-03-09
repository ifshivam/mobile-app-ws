package com.learning.mobileappws.ui.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestModel {
    @NotBlank(message = "first name can not be empty or null")
    @Size(min=2,message = "provide valid first name")
    private String firstName;
    @Size(min=2,message = "provide valid last name")
    private String lastName;
    @Email
    private String mail;
    @NotNull(message = "password can not be null")
    @Size(min=7,max = 16,message = "password must be equal or greater than 7 and less than or equal to 16 character")
    private String password;
}
