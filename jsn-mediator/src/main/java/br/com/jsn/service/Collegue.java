package br.com.jsn.service;

public class Collegue {

    private Mediator mediator1;
    private String status = "FALSO";

    public Collegue(Mediator mediator1){
        this.mediator1 = mediator1;
        this.mediator1.addCollegue(this);

    }

    public void setStatus(String s){
        this.status = s;
    }

    public void mudarStatus(){
      //  this.status = "VERDADEIRO" ;
        mediator1.changeStateCollegue();
    }

    public String getStatus(){
        return this.status;
    }
    
}
