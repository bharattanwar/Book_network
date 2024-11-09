package com.bharat.book.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public enum BusinessErrorCodes {

    NO_CODE(0,HttpStatus.NOT_IMPLEMENTED,"No code"),
    ACCOUNT_LOCKED(302,HttpStatus.FORBIDDEN,"User account is locked"),
    ACCOUNT_DISABLED(303,HttpStatus.FORBIDDEN,"User account is disabled"),
    INCORRECT_CURRENT_PASSWORD(300,HttpStatus.BAD_REQUEST,"Current password is incorrect"),
    INCORRECT_NEW_PASSWORD(301,HttpStatus.BAD_REQUEST,"New password is incorrect"),
    INVALID_CREDENTIALS(304,HttpStatus.FORBIDDEN,"Login password is incorrect")
    ;

    @Getter
    private final int code;
    @Getter
    private final String description;
    @Getter
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code,HttpStatus httpStatus, String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }
}
