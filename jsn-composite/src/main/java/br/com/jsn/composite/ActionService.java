package br.com.jsn.composite;

import br.com.jsn.dto.ActionDTO;

public class ActionService extends ProjectElement{

    private ActionDTO actionDTO;

    

    public ActionService(ActionDTO actionDTO) {
        this.actionDTO = actionDTO;
    }



    @Override
    public Object display() {
        System.out.println(" Action " + actionDTO);

        return actionDTO;
    }

    
}
