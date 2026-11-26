package be.profacile.pharmashare.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "partenaire")
public class Partenaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "pays", nullable = false)
    private String pays;

    @Column(name = "adresse", nullable = false)
    private String adresse;

    @Column(name = "habilite", nullable = false)
    private Boolean habilite;

    public Partenaire() {
    }

    public Long getId() { return id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getPays() { return pays; }
    public void setPays(String pays) { this.pays = pays; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public Boolean getHabilite() { return habilite; }
    public void setHabilite(Boolean habilite) { this.habilite = habilite; }
}