package dev.yawkar.eternity.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Eternity forums API")
                                .version("1.0.0")
                                .contact(
                                        new Contact()
                                                .name("Karpov Vadim")
                                                .url("https://github.com/YawKar")
                                )
                );
    }
}
