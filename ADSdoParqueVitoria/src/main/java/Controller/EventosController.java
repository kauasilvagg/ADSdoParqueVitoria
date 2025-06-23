package Controller;

import com.shalomigreja.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventosController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/eventos")
    public String listarEventos(Model model) {
        model.addAttribute("titulo", "Eventos da Igreja");
        model.addAttribute("eventos", eventoService.listarTodos());
        return "eventos"; // View: templates/eventos.html
    }
}
