package dio.web.api.doc;

import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    private Contact contato() {
        return new Contact(
                "Seu nome",
                "http://www.seusite.com.br",
                "voce@seusite.com.br");
    }
    
    private ApiInfoBuilder informacoesApi() {
        ApiInfoBuilder apiInfobuilder = new ApiInfoBuilder();
        
        apiInfobuilder.title("Title - Rest API");
        apiInfobuilder.description("API exemplo de uso de Springboot REST API");
        apiInfobuilder.version("1.0");
        apiInfobuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInfobuilder.license("Licensa - Sua Empresa");
        apiInfobuilder.licenseUrl("http://www.seusite.com.br");
        apiInfobuilder.contact(this.contato());
        
        return apiInfobuilder;
    }
    
    @Bean
    public Docket detalheApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(this.informacoesApi().build())
        .consumes(Set.of("application/json"))
        .produces(Set.of("application/json"));
    }
}



