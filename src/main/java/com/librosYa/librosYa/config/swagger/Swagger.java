package com.librosYa.librosYa.config.swagger;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

public class Swagger {
    
    @Configuration
@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Daniel Parra",
                        url = "https://github.com/TradeDanielP",
                        email = "tradedanielp@gmail.com"
                ),
                title = "Documentation: LibrosYa Api",
                version = "1.0"
        ),
        servers = {
                @Server(
                        description = "Local",
                        url = "http://localhost:8080/api/v1")
        }
)
public class SwaggerConfig {
}

}
