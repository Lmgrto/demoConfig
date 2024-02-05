import org.example.ExempleConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConditionalOnProperty(name = "conf.active", havingValue = "true")
public class ConfigurationExemple {

    private static final Logger LOG = LoggerFactory.getLogger(ConfigurationExemple.class);

    @Bean
    @ConfigurationProperties(prefix = "conf.exemple")
    ExempleConfig exConfigProperties(){
    LOG.info("& Activate ExempleConfig");
    return new ExempleConfig();
    }


}
