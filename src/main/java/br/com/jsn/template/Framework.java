package br.com.jsn.template;

public abstract class Framework {

    public void templateMethod(){

         inicializar();
         processar();
         encerrar();
    }

    abstract void inicializar();
    abstract void processar();
    abstract void encerrar();

}
