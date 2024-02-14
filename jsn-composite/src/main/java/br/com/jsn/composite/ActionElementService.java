package br.com.jsn.composite;

import br.com.jsn.dto.ActionDTO;

public class ActionElementService extends ProjectComponent{

    private ActionDTO actionDTO;

    

    public ActionElementService(ActionDTO actionDTO) {
        this.actionDTO = actionDTO;
    }



    @Override
    public Object display() {
        System.out.println(" Action " + actionDTO);

        return actionDTO;
    }

    
}
