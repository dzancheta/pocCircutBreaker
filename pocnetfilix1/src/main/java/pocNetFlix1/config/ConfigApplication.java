package pocNetFlix1.config;

import org.springframework.context.annotation.Configuration;
import pocNetFlix1.service.MensagemNetFlix;

@Configuration
public class ConfigApplication {

    @org.springframework.context.annotation.Bean
    public MensagemNetFlix mensagemNetFlix(){
        return new MensagemNetFlix();
    }

}
