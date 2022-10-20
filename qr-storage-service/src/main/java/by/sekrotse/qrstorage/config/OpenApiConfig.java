package by.sekrotse.qrstorage.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {
    @Value("${openapi.server.url}")
    private String openApiServerUrl;

    @Bean
    public OpenAPI openAPI() {
        OpenAPI openAPI = new OpenAPI()
                .info(new Info()
                        .title("Qr code generator service.")
                        .description("Generating qr code by personal information")
                )
                .servers(
                        List.of(new Server()
                                .url(openApiServerUrl)
                                .description("Open api server url")
                        )
                );
//                .components(
//                        new Components()
//                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
//                                .scheme("bearer")
//                                .type(SecurityScheme.Type.HTTP)
//                                .in(SecurityScheme.In.HEADER))
//                );
        return openAPI;
    }
}
