package cg.ncn.SpringMVCResource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping( "/hello" )
    public String home( Model model ) {
        model.addAttribute( "message", "Hello wolrd spring mvc with maven by clerc is comming" );
        return "hello";
    }

}
