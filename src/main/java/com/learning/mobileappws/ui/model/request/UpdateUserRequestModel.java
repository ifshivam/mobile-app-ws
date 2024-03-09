package com.learning.mobileappws.ui.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserRequestModel {
    @NotBlank(message = "first name can not be empty or null")
    @Size(min=2,message = "provide valid first name")
    private String firstName;
    @Size(min=2,message = "provide valid last name")
    private String lastName;
}
