package br.com.jsn.jsnprototype.prototype;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Objects;

@XmlRootElement
public abstract class Prototype {

    private String id ;
    private String name ;
    private String type ;
    private String description ;

    public Prototype(Prototype prototype) {

        if(prototype != null){
            this.id = prototype.id;
            this.name = prototype.name;
            this.type = prototype.type;
            this.description = prototype.description;
        }
    }

    public Prototype(){}

    public abstract Prototype clone();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prototype prototype = (Prototype) o;
        return Objects.equals(id, prototype.id) && Objects.equals(name, prototype.name) && Objects.equals(type, prototype.type) && Objects.equals(description, prototype.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, description);
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
