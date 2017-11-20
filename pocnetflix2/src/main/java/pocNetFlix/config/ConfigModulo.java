package pocNetFlix.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import pocNetFlix.service.ServiceMsgNetFlix;

@Configuration
public class ConfigModulo {

//    @Bean
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }


    @Bean
    public ServiceMsgNetFlix serviceMsgNetFlix(RestTemplate restTemplate){
       return new ServiceMsgNetFlix(restTemplate);
    }
}
