package com.authJWT.JWT_Auth.services;

import com.authJWT.JWT_Auth.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    UserService(){
        userList.add(new User("1", "radha", "radha@gmail.com"));
        userList.add(new User("2", "krishna", "krishna@gmail.com"));
        userList.add(new User("3", "ram", "ram@gmail.com"));
        userList.add(new User("4", "sita", "sita@gmail.com"));
    }

    public ResponseEntity<?> getAllUser (){
        return new ResponseEntity<>(this.userList, HttpStatus.OK);
    }

    public ResponseEntity<?> getCurrentUser(Principal principal){
        return new ResponseEntity<>(principal.getName(), HttpStatus.OK);
    }
}
