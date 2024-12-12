package thegreatmarksman.noterighter.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import thegreatmarksman.noterighter.Model.Input;
import thegreatmarksman.noterighter.Repository.InputRepository;

import org.springframework.beans.factory.annotation.Autowired;


import javax.servlet.http.HttpSession;

@Controller
public class MainController{
    @Autowired
    private InputRepository inputRepository;
    @GetMapping("/")
    public String getPage(Model model, HttpSession session) {
        return "page";
    }
    @PostMapping("/submit")
    public String savePage(@RequestParam("textArea") String textContent, Model model) {
        // Save the input data to the database
        Input input = new Input();
        input.setTextContent(textContent);
        inputRepository.save(input);

        model.addAttribute("message", "Data saved successfully!");
        return "page";
    }
}
