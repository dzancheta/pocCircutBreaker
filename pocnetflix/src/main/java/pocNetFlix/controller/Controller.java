package pocNetFlix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pocNetFlix.service.MensagemNetFlix;

@RestController
public class Controller {
    @Autowired
    private MensagemNetFlix mensagemNetFlix;

    @GetMapping("/test/netflix")
    public String msg(){
        return mensagemNetFlix.msg();
    }
}
