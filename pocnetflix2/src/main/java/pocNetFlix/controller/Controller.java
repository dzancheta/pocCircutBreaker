package pocNetFlix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pocNetFlix.service.ServiceMsgNetFlix;

@RestController
public class Controller {
    @Autowired
    ServiceMsgNetFlix serviceMsgNetFlix;

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }


    @GetMapping("/test/netflix")
    public String servicoNetFlix(){
        return serviceMsgNetFlix.readingList();
    }
}
