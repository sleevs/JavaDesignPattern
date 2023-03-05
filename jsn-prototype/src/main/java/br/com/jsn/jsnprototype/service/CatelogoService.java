package br.com.jsn.jsnprototype.service;


import br.com.jsn.jsnprototype.prototype.Prototype;
import br.com.jsn.jsnprototype.prototype.PrototypeCache;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



/*

SECURITY IN BDD ANALISYS

give : some context , setup data such hardware data
when : some action is carried out or event that initiates the scenario
then : defines the result or outcome of particular set of
observable consequences should obtain
=============================================
WEB APPLICATION
=============================================
broken access control
cryptographic failures
injection
insecure design
security misconfiguration
vulnerable and outdated components
indentification and authentication failures
software and data integrity failure
security loggin and monitoring failures
server-side request forgery

=============================================
Mobile Risks / List
=============================================
M1: Improper Platform Usage
M2: Insecure Data Storage
M3: Insecure Communication
M4: Insecure Authentication
M5: Insufficient Cryptography
M6: Insecure Authorization
M7: Client Code Quality
M8: Code Tampering
M9: Reverse Engineering
M10: Extraneous Functionality
M1: Weak Server Side Controls
M2: Insecure Data Storage
M3: Insufficient Transport Layer Protection
M4: Unintended Data Leakage
M5: Poor Authorization and Authentication
M6: Broken Cryptography
M7: Client Side Injection
M8: Security Decisions Via Untrusted Inputs
M9: Improper Session Handling
M10: Lack of Binary Protections
=============================================
MIDDLEWARE
=============================================
Vulnerability Assessment and Penetration Testing
Incident Response and Data Breach
Data Encryption in Transit and at Rest
Backup and Disaster Recovery
Data Collection e Disposal


*/


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
