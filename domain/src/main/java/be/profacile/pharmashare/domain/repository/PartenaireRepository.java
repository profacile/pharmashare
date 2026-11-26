package be.profacile.pharmashare.domain.repository;

import be.profacile.pharmashare.domain.model.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {
    List<Partenaire> findByHabiliteTrue();
}