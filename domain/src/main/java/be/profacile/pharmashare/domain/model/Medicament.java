package be.profacile.pharmashare.domain.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/** Cynthia — compléter les annotations JPA, les champs et les accesseurs selon docs/sprint-2.md. */
@Entity
@Table(name = "medicament")

public class Medicament {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "code_cnk", nullable = false, unique = true, length = 7)
        private String codeCnk;

        @Column(name = "nom", nullable = false)
        private String nom;

        @Column(name = "principe_actif", nullable = false)
        private String principeActif;


        /** Constructeur sans argument exigé par JPA. */
        public Medicament() {
        }

        public Long getId() {
                return id;
        }

        public String getCodeCnk() {
                return codeCnk;
        }

        public void setCodeCnk(String codeCnk) {
                this.codeCnk = codeCnk;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public String getPrincipeActif() {
                return principeActif;
        }

        public void setPrincipeActif(String principeActif) {
                this.principeActif = principeActif;
        }
    }




