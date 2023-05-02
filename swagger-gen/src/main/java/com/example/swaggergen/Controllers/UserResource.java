package com.example.swaggergen.Controllers;

import com.example.swaggergen.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Path("/users")
@Tag(name = "Users")
@Produces(MediaType.APPLICATION_JSON)
//TODO make it so it generates automatically --> @Info(title = "User services", version = "1.0.0", description = "Controller used for CRUD operation for user")
public interface UserResource {
    @POST
    @Path("/create")
    @Operation(summary = "Create a new user")
    ResponseEntity<Void> createUser(@RequestBody User user);

    @GET
    @Path("/{userid}")
    @Operation(summary = "Get an user by ID")
    ResponseEntity<User> getUser(@PathParam("userid") String userid);
}
