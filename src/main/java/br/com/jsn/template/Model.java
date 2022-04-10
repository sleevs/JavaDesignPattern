package br.com.jsn.template;

public class Model extends Framework {
    @Override
    void inicializar() {
        System.out.println("MODELAR OBJETO");
    }

    @Override
    void processar() {
        System.out.println("CARREGAR MODELO");
    }

    @Override
    void encerrar() {
        System.out.println("REMOVER MODELO");
    }
}
