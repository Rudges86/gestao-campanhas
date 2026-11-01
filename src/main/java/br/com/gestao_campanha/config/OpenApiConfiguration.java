package br.com.gestao_campanha.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info (
                title = "Microserviço de gestão de campanhas",
                version = "V1",
                description = "Documentação do serviço de gestão."
        )
)
public class OpenApiConfiguration {

    @Bean
    public OpenAPI cusOpenApi() {
        return new OpenAPI()
                .components(new Components())
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Gestão de campanhas service api")
                        .version("V1")
                        .license(new License()
                                .name("")
                                .url("")
                ));

    }

}
