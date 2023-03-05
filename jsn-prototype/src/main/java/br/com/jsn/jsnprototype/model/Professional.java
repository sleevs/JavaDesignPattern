package br.com.jsn.jsnprototype.model;

import br.com.jsn.jsnprototype.prototype.Prototype;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Objects;

@XmlRootElement
public class Professional extends Prototype {

    private String diploma ;
    private String especialidade ;


    public Professional(){}

    public Professional(Professional c){
        super(c);
            if(c != null){
                this.diploma = c.diploma ;
                this.especialidade = c.especialidade ;
            }
    }
    @Override
    public Prototype clone() {
        return new Professional(this);
    }


    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professional curriculo = (Professional) o;
        return Objects.equals(diploma, curriculo.diploma) && Objects.equals(especialidade, curriculo.especialidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diploma, especialidade);
    }


    @Override
    public String toString() {
        return "Curriculo{" +
                "diploma='" + diploma + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
