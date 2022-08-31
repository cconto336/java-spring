package firstweb.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping(value = "test")
    public String index() {
        return "Hola desde Spring";
    }
}
