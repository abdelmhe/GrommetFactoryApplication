package sheridancollege.ca.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sheridancollege.ca.demo.model.Student;

@Controller
public class MainController {

    // have a method that is going to invoke the html page


    @RequestMapping("/")
    public String returnInput() {
        return "input";
    }

    @RequestMapping("/processInput")
    public String process(Model model, @RequestParam int id, @RequestParam String fullName) {
        Student student = new Student();
        student.setId(id);
        student.setName(fullName);
        model.addAttribute("myStudent", student);

        return "output";
    }
}
