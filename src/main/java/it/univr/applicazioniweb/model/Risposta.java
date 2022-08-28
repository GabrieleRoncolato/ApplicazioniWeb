package it.univr.applicazioniweb.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "Risposta")
public class Risposta implements Serializable {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String testo;

    @Column(precision = 9, scale = 4, columnDefinition = "bigint check(PUNTI <= 1.0)")
    private BigDecimal punti;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "domanda")
    private Domanda domanda;

    public Risposta(){
    }

    public Risposta(String testo, BigDecimal punti, Domanda domanda){
        this.testo = testo;
        this.punti = punti;
        this.domanda = domanda;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 7;
        result = prime * result + Long.hashCode(id);
        result = prime * result + testo.hashCode();
        result = prime * result + ((punti == null) ? 0 : punti.hashCode());
        result = prime * result + ((domanda == null) ? 0 : domanda.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Risposta
                && Objects.equals(this.id, ((Risposta) obj).id)
                && Objects.equals(this.testo, ((Risposta) obj).testo)
                && Objects.equals(this.punti, ((Risposta) obj).punti)
                && Objects.equals(this.domanda, ((Risposta) obj).domanda);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Domanda getDomanda() {
        return domanda;
    }

    public void setDomanda(Domanda domanda) {
        this.domanda = domanda;
    }
}
