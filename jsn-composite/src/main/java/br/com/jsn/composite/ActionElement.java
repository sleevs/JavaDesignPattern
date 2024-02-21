package br.com.jsn.composite;

import br.com.jsn.dto.ActionDTO;


public class ActionElement extends ManagerComponent{

    private ActionDTO actionDTO;

    

    public ActionElement(ActionDTO actionDTO) {
        this.actionDTO = actionDTO;
    }



    @Override
    public Object display() {
       

        return actionDTO;
    }

    
}
