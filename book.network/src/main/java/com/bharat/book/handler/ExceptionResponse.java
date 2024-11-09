package com.bharat.book.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.jsonwebtoken.impl.crypto.MacProvider;
import lombok.*;

import java.util.Map;
import java.util.Set;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ExceptionResponse {
    private Integer businessErrorCode;
    private String businessErrorDescription;
    private String error;
    private Set<String> validateErrors;
    private Map<String,String> errors;
}
