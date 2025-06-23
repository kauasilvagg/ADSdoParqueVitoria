package Service;

import com.shalomigreja.model.MensagemContato;
import com.shalomigreja.repository.MensagemContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemContatoService {

    @Autowired
    private MensagemContatoRepository mensagemContatoRepository;

    public void salvar(MensagemContato mensagem) {
        mensagemContatoRepository.save(mensagem);
    }

    public List<MensagemContato> listarTodas() {
        return mensagemContatoRepository.findAll();
    }

    public void deletar(Long id) {
        mensagemContatoRepository.deleteById(id);
    }
}
