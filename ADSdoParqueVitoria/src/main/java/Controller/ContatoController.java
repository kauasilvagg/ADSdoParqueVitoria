package Controller;

import com.shalomigreja.model.MensagemContato;
import com.shalomigreja.service.MensagemContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContatoController {

    @Autowired
    private MensagemContatoService mensagemContatoService;

    @GetMapping("/contato")
    public String contatoForm(Model model) {
        model.addAttribute("mensagemContato", new MensagemContato());
        return "contato"; // View: templates/contato.html
    }

    @PostMapping("/contato")
    public String enviarMensagem(@ModelAttribute MensagemContato mensagemContato, Model model) {
        mensagemContatoService.salvar(mensagemContato);
        model.addAttribute("mensagemSucesso", "Mensagem enviada com sucesso!");
        return "contato";
    }
}
