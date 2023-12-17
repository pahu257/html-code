package web_anwendung.benutzeroberflaeche;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @RequestMapping("/benutzeroberflaeche")
    public String showWebsite() {
        return "Benutzeroberflaeche"; 
    }
}
