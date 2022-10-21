package by.sekrotse.logging.configuration;

import by.sekrotse.logging.properties.LoggingProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("by.sekrotse.logging.configuration")
@EnableConfigurationProperties({LoggingProperties.class})
public class LoggingAutoConfiguration {
}
