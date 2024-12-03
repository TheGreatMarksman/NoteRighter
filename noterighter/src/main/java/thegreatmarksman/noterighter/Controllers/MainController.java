package thegreatmarksman.noterighter.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;

public class MainController{
    @GetMapping("/")
    public String getPage(Model model, HttpSession session) {
        return "page";
    }
}
