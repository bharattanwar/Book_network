package com.bharat.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {
    @NotEmpty(message = "Email is needed")
    @NotBlank(message = "Email needed")
    @Email(message = "Email is not in correct format")
    private  String email;
    @NotEmpty(message = "password is needed")
    @NotBlank(message = "password needed")
    @Size(min = 6,message = "Length should be minimum 6 characters")
    private String password;
}
