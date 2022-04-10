package br.com.jsn.template;

public class View extends Framework {
    @Override
    void inicializar() {
        System.out.println("CARREGAR RENDER");
    }

    @Override
    void processar() {
        System.out.println("RENDERIZAR");
    }

    @Override
    void encerrar() {
        System.out.println("REMOVER RENDER");
    }
}
