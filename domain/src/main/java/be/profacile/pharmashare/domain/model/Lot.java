package be.profacile.pharmashare.domain.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "lot")
/** Idriss — compléter les annotations JPA, les champs et les accesseurs selon docs/sprint-2.md. */
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_lot", nullable = false)
    private String numeroLot;

    @Column(name = "date_peremption", nullable = false)
    private LocalDate datePeremption;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

    @Column(name = "prix_normal", nullable = false)
    private BigDecimal prixNormal;

    @Column(name = "prix_reduit")
    private BigDecimal prixReduit;

    @Enumerated(EnumType.STRING)
    @Column(name = "statut", nullable = false)
    private EtatLot statut;

    @ManyToOne(optional = false)
    @JoinColumn(name = "medicament_id", nullable = false)
    private Medicament medicament;

    @ManyToOne(optional = false)
    @JoinColumn(name = "pharmacie_id", nullable = false)
    private Pharmacie pharmacie;

    public Lot() {
    }

    public Long getId() {
        return id;
    }

    public String getNumeroLot() {
        return numeroLot;
    }

    public void setNumeroLot(String numeroLot) {
        this.numeroLot = numeroLot;
    }

    public LocalDate getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getPrixNormal() {
        return prixNormal;
    }

    public void setPrixNormal(BigDecimal prixNormal) {
        this.prixNormal = prixNormal;
    }

    public BigDecimal getPrixReduit() {
        return prixReduit;
    }

    public void setPrixReduit(BigDecimal prixReduit) {
        this.prixReduit = prixReduit;
    }

    public EtatLot getStatut() {
        return statut;
    }

    public void setStatut(EtatLot statut) {
        this.statut = statut;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }
}

