package thegreatmarksman.noterighter.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

@Controller
public class MainController{
    @GetMapping("/")
    public String getPage(Model model, HttpSession session) {
        return "page";
    }
}
