package com.authJWT.JWT_Auth.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private String userId;
    private String userName;
    private String userEmail;

}
