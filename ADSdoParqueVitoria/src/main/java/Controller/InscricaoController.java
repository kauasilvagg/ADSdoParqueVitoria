
package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InscricaoController {

    @Autowired
    private InscricaoService inscricaoService;

    // Página pública
    @GetMapping("/inscricoes")
    public String formularioInscricao(Model model) {
        model.addAttribute("inscricao", new Inscricao());
        return "inscricoes";
    }

    @PostMapping("/inscricoes")
    public String salvarInscricao(@ModelAttribute Inscricao inscricao, Model model) {
        inscricaoService.salvar(inscricao);
        model.addAttribute("mensagem", "Inscrição realizada com sucesso!");
        return "inscricoes";
    }

    // Página administrativa
    @GetMapping("/admin/inscricoes")
    public String listarInscricoes(Model model) {
        model.addAttribute("inscricoes", inscricaoService.listarTodas());
        return "admin_inscricoes";
    }

    private class InscricaoService {

        public Object listarTodas() {
            return null;
        }

        public void salvar(Inscricao inscricao) {
        }
    }

    private class Inscricao {
    }
}
