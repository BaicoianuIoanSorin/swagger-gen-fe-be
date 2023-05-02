package com.example.swaggergen.Controllers;

import com.example.swaggergen.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Path("/users")
@Tag(name = "Users")
@Produces(MediaType.APPLICATION_JSON)
public interface UserResource {
    @POST
    @Path("/create")
    @Operation(summary = "Create a new user")
    ResponseEntity<Void> createUser(@RequestBody User user);
}
