package pocNetFlix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class ServiceMsgNetFlix {

    private final RestTemplate restTemplate;

    public ServiceMsgNetFlix(RestTemplate rest) {
        this.restTemplate = rest;
    }

    @HystrixCommand(fallbackMethod = "reconction")
    public String readingList() {
        URI uri = URI.create("http://localhost:8090/test/netflix");
        return this.restTemplate.getForObject(uri, String.class);
    }

    public String reconction() {
        URI uri = URI.create("http://localhost:8091/test/netflix");
        return this.restTemplate.getForObject(uri, String.class);
    }

}
