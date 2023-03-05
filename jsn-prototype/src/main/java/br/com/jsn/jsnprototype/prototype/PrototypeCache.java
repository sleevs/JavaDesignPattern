package br.com.jsn.jsnprototype.prototype;

import br.com.jsn.jsnprototype.model.Professional;
import br.com.jsn.jsnprototype.model.Product;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCache {


    private Map<String , Prototype> cache = new HashMap<>();

    public void load(){

        Product produto = new Product();
        produto.setMarca("NINTENDO");
        produto.setValor("RS 100,00");
        produto.setId("13");
        produto.setType("GAME");
        produto.setName("DUKE-NUKEM");
        produto.setDescription("GAME ACTION : PRIMEIRA PESSOA");

        Professional curriculo = new Professional();
        curriculo.setDiploma("ANALISE E DESNVOLVIMENTO DE SISTEMAS");
        curriculo.setEspecialidade("ENGENHARIA DE SOFTWARE");
        curriculo.setId("51");
        curriculo.setType("PROFISSIONAL");
        curriculo.setName("JEISON TIAGO MUNIZ SOARES");
        curriculo.setDescription("DESENVOLVIMENTO DE SOFTWARE");

        cache.put("JOGO" , produto);
        cache.put("PROFISSIONAL" , curriculo);

    }

    public Prototype add(String key, Prototype prototype){
        cache.put(key,prototype);
        return prototype ;
    }

    public Prototype get(String key){
        return cache.get(key).clone();
    }
}
