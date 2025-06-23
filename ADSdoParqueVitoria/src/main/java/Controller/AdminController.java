package Controller;

import com.shalomigreja.model.Evento;
import com.shalomigreja.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/eventos")
    public String listarEventos(Model model) {
        model.addAttribute("evento", new Evento());
        model.addAttribute("eventos", eventoService.listarTodos());
        return "admin_eventos"; // View: templates/admin_eventos.html
    }

    @PostMapping("/eventos")
    public String salvarEvento(@ModelAttribute Evento evento) {
        eventoService.salvar(evento);
        return "redirect:/admin/eventos";
    }
}
