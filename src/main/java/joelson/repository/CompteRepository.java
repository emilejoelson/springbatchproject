package joelson.repositories;

import joelson.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
interface CompteRepository extends JpaRepository<Compte, Long> {
}
