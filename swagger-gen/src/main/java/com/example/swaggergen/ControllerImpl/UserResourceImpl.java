package com.example.swaggergen.ControllerImpl;

import com.example.swaggergen.Controllers.UserResource;
import com.example.swaggergen.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

public class UserResourceImpl implements UserResource {

    @Override
    public ResponseEntity<Void> createUser(User user) {
        return ResponseEntity.ok().build();
    }
}
