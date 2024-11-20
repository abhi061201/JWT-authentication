package com.authJWT.JWT_Auth.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JWTResponse {

    private String JwtToken;
    private String userName;

}
