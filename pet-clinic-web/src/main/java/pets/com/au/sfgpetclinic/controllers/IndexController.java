package pets.com.au.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "home", "/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
