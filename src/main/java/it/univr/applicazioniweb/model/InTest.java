package it.univr.applicazioniweb.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "InTest")
@IdClass(InTestKey.class)
public class InTest {
    /*
    @Id
    @ManyToOne
    @JoinColumn(name = "domanda", referencedColumnName = "id")
    @NotNull
    private List<Domanda> domanda;*/

    @Id
    @NotNull
    @MapsId
    @OneToOne
    @JoinColumns({
            @JoinColumn(name="dataTest", referencedColumnName = "data"),
            @JoinColumn(name="nomeTest", referencedColumnName = "nome")
    })
    private Test test;

    public InTest(){
    }

    public InTest(List<Domanda> domanda, Test test){
        //this.domanda = domanda;
        this.test = test;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 7;

        /*
        for (Object obj : domanda) {
            result = prime * result + (obj == null ? 0 : obj.hashCode());
        }*/

        result = prime * result + (test == null ? 0 : test.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj){
        return obj instanceof InTest
                //&& Objects.equals(this.domanda, ((InTest) obj).domanda)
                && Objects.equals(this.test, ((InTest) obj).test);
    }

    /*
    public List<Domanda> getDomanda() {
        return domanda;
    }

    public void setDomanda(List<Domanda> domanda) {
        this.domanda = domanda;
    }*/

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
