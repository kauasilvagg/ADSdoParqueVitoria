package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Bem-vindo à Assembleia de Deus Shalom do Parque Vitória");
        return "index"; // View: templates/index.html
    }
}
