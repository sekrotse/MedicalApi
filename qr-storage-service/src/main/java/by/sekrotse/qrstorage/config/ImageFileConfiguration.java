package by.sekrotse.qrstorage.config;

import by.sekrotse.qrstorage.service.codegen.PngFileInformation;
import by.sekrotse.qrstorage.service.codegen.api.CodeFileInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImageFileConfiguration {
    @Bean
    CodeFileInformation codeFileInformation() {
        return new PngFileInformation();
    }
}
