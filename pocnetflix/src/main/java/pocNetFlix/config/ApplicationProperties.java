package pocNetFlix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pocNetFlix.service.MensagemNetFlix;

@Configuration
public class ApplicationProperties {

    @Bean
    public MensagemNetFlix mensagemNetFlix(){
        return new MensagemNetFlix();
    }
}
