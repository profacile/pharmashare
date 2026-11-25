package be.profacile.pharmashare.domain.repository;



import be.profacile.pharmashare.domain.model.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/** Cynthia — compléter le contrat Spring Data indiqué dans docs/sprint-2.md. */
public interface MedicamentRepository extends JpaRepository<Medicament, Long> {

    Optional<Medicament> findByCodeCnk(String codeCnk);
}


