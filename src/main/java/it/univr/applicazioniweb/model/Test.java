package it.univr.applicazioniweb.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Test")
@IdClass(TestKey.class)
public class Test implements Serializable {
    @Id
    @NotNull
    private OffsetDateTime data;
    @Id
    @NotNull
    private String nome;

    private Boolean ordineCasuale = false;
    private Boolean domandeConNumero = false;

    public Test(){
    }

    public Test(OffsetDateTime data, String nome, Boolean ordineCasuale, Boolean domandeConNumero){
        this.data = data;
        this.nome = nome;
        this.ordineCasuale = ordineCasuale;
        this.domandeConNumero = domandeConNumero;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 7;
        result = prime * result + data.hashCode();
        result = prime * result + nome.hashCode();
        result = prime * result + ((ordineCasuale == null) ? 0 : ordineCasuale.hashCode());
        result = prime * result + ((domandeConNumero == null) ? 0 : domandeConNumero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof Test
                && Objects.equals(this.data, ((Test) obj).data)
                && Objects.equals(this.nome, ((Test) obj).nome)
                && Objects.equals(this.ordineCasuale, ((Test) obj).ordineCasuale)
                && Objects.equals(this.domandeConNumero, ((Test) obj).domandeConNumero);
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getOrdineCasuale() {
        return ordineCasuale;
    }

    public void setOrdineCasuale(Boolean ordineCasuale) {
        this.ordineCasuale = ordineCasuale;
    }

    public Boolean getDomandeConNumero() {
        return domandeConNumero;
    }

    public void setDomandeConNumero(Boolean domandeConNumero) {
        this.domandeConNumero = domandeConNumero;
    }
}
