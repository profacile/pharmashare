package be.profacile.pharmashare.domain.repository;
import be.profacile.pharmashare.domain.model.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/** Idriss — compléter le contrat Spring Data indiqué dans docs/sprint-2.md. */
public interface LotRepository extends JpaRepository<Lot, Long> {
    List<Lot> findByPharmacieId(Long pharmacieId);
}
