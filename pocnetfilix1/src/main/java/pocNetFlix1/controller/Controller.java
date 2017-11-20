package pocNetFlix1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pocNetFlix1.service.MensagemNetFlix;

@RestController
public class Controller {
    @Autowired
    MensagemNetFlix mensagemNetFlix;

    @GetMapping("/test/netflix")
    public String mensagemNetFlix(){
        return mensagemNetFlix.msg();
    }
}
