package br.com.jsn.jsnprototype.model;

import br.com.jsn.jsnprototype.prototype.Prototype;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Objects;

@XmlRootElement
public class Product extends Prototype {

    private String valor ;
    private String marca ;


    public Product(){

    }
    public Product(Product p){
        super(p);
        if(p != null){
            this.valor = p.valor ;
            this.marca = p.marca ;
        }
    }


    @Override
    public Prototype clone() {
        return new Product(this);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product produto = (Product) o;
        return Objects.equals(valor, produto.valor) && Objects.equals(marca, produto.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), valor, marca);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "valor='" + valor + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
