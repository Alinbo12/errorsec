package security.com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController { //destinado a ingresar a las vistas y a las APIS. Da o no acceso a html
     
    @GetMapping ({"/", "/login"})
    public String index(){
        //el retorno se debe llamar igual que nuestro html
        return "index";
    }

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("/user")
    public String user () {
        return "user";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
