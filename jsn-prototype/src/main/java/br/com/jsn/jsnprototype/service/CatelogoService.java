package br.com.jsn.jsnprototype.service;


import br.com.jsn.jsnprototype.prototype.Prototype;
import br.com.jsn.jsnprototype.prototype.PrototypeCache;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;





@Service
public class CatelogoService {



    PrototypeCache prototypeCache = new PrototypeCache();


    /*
    give : some context , setup data such hardware data
    when : some action is carried out or event that initiates the scenario
    then : defines the result or outcome of particular set of
    observable consequences should obtain
    */
    public List<Prototype> list(){



        prototypeCache.load();
        Prototype professional = prototypeCache.get("PROFISSIONAL");
        Prototype gameNintendo = prototypeCache.get("JOGO");

        List<Prototype> list  = new ArrayList<>();
            list.add(professional);
            list.add(gameNintendo);

        return list ;
    }

}
