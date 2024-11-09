package com.bharat.book.auth;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "First name is needed")
    @NotBlank(message = "First name needed")
    private String firstname;
    @NotEmpty(message = "Last name is needed")
    @NotBlank(message = "Last name needed")
    private String lastname;
    @NotEmpty(message = "Email is needed")
    @NotBlank(message = "Email needed")
    @Email(message = "Email is not in correct format")
    private  String email;
    @NotEmpty(message = "password is needed")
    @NotBlank(message = "password needed")
    @Size(min = 6,message = "Length should be minimum 6 characters")
    private String password;
}
