package javag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
public class javagController {

    //private final UserService userService;


    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("user", new User());
        return "sign-up";

    }

    @PostMapping("/submitItem")
    public String handleSubmit(@ModelAttribute @Valid User user, BindingResult result, RedirectAttributes attributes){
        if (result.hasErrors()) return "sign-up";
           return  "login";
        }

    @GetMapping("/submitUser")
    public String handleSubmit() {
        return ":redirect/sign-up";
    }


    @PostMapping("/submitUser")
    public String handleSubmit(@Valid User user,BindingResult result) {
        /* if (result.hasErrors()) return "login"; */
        return "index";
}






}





