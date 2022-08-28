package it.univr.applicazioniweb.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "Domanda")
public class Domanda implements Serializable {
    @Id
    @NotNull
    private String nome;

    @NotNull
    private String testo;
    @Column(precision = 7, scale = 2)
    private BigDecimal punti;

    private Boolean ordineCasuale = false;
    private Boolean risposteConNumero = false;

    public Domanda(){
    }

    public Domanda(String nome, String testo, BigDecimal punti, Boolean ordineCasuale, Boolean risposteConNumero){
        this.nome = nome;
        this.testo = testo;
        this.punti = punti;
        this.ordineCasuale = ordineCasuale;
        this.risposteConNumero = risposteConNumero;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 7;
        result = prime * result + nome.hashCode();
        result = prime * result + testo.hashCode();
        result = prime * result + ((punti == null) ? 0 : punti.hashCode());
        result = prime * result + ((ordineCasuale == null) ? 0 : ordineCasuale.hashCode());
        result = prime * result + ((risposteConNumero == null) ? 0 : risposteConNumero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Domanda
                && Objects.equals(this.nome, ((Domanda) obj).nome)
                && Objects.equals(this.testo, ((Domanda) obj).testo)
                && Objects.equals(this.punti, ((Domanda) obj).punti)
                && Objects.equals(this.ordineCasuale, ((Domanda) obj).ordineCasuale)
                && Objects.equals(this.risposteConNumero, ((Domanda) obj).risposteConNumero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public BigDecimal getPunti() {
        return punti;
    }

    public void setPunti(BigDecimal punti) {
        this.punti = punti;
    }

    public Boolean getOrdineCasuale() {
        return ordineCasuale;
    }

    public void setOrdineCasuale(Boolean ordineCasuale) {
        this.ordineCasuale = ordineCasuale;
    }

    public Boolean getRisposteConNumero() {
        return risposteConNumero;
    }

    public void setRisposteConNumero(Boolean risposteConNumero) {
        this.risposteConNumero = risposteConNumero;
    }
}
