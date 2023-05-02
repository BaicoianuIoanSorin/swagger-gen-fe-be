package com.example.swaggergen;

import com.example.swaggergen.ControllerImpl.UserResourceImpl;
import com.example.swaggergen.Controllers.UserResource;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerGenSpringBootConfiguration {

    @Bean
    public UserResource userResource() {
        return new UserResourceImpl();
    }
}
