package Repository;

import com.shalomigreja.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
    // Você pode adicionar consultas personalizadas aqui se quiser
}
