package br.com.jsn.template;

public class Controller extends Framework {
    @Override
    void inicializar() {
        System.out.println("CARREGAR CONTROLLER");
    }

    @Override
    void processar() {
        System.out.println("EXECUTAR CONTROLLER");
    }

    @Override
    void encerrar() {
        System.out.println("FINALIZAR CONTROLLER");
    }
}
