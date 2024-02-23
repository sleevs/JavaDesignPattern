package br.com.jsn.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsn.dto.ActionDTO;
import br.com.jsn.entity.ActionEntity;
import br.com.jsn.repository.ActionRepository;

@Service
public class ActionService {

    @Autowired
    private ActionRepository actionRepository;

    public ActionDTO build(ActionEntity e){
        var action = new ActionDTO();
        action.setId(e.getActionId());
        action.setStatus(e.getStatus());
        action.setStart(e.getStart());
        action.setEnd(e.getEnd());
        action.setResource(e.getResource());
        action.setTask(e.getTaskId());
        action.setEmployee(e.getEmployee());
        return action;
    }
    

    public ActionEntity build(ActionDTO dto){
        var action = new ActionEntity();
        
        action.setStart(dto.getStart());
        action.setEnd(dto.getEnd());
        action.setStatus(dto.getStatus());
        action.setResource(dto.getResource());
        action.setTaskId(dto.getTask());
        action.setEmployee(dto.getEmployee());
        return action;
        
    }
    

    public ActionDTO createAction(ActionDTO actionDTO){
       var result = actionRepository.save(build(actionDTO));
        return build(result) ;
    }
}
