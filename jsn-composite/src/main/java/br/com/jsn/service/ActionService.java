package br.com.jsn.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.jsn.dto.ActionDTO;
import br.com.jsn.dto.TaskDTO;
import br.com.jsn.entity.ActionEntity;
import br.com.jsn.repository.ActionRepository;
import br.com.jsn.util.DtoMapper;

@Service
public class ActionService {
    
    @Autowired
    private ActionRepository actionRepository;

    @Autowired
    private DtoMapper dtoMapper;

    public ActionDTO createAction(ActionDTO dto){
        ActionEntity action = dtoMapper.buildActionEntity(dto);
       
       var result = actionRepository.save(action);
        return dtoMapper.buildActionDTO(result) ;
    }



    public List<ActionDTO> findActionsByTask(Long taskId){
       
        List<ActionDTO> list = new ArrayList<>();
        var result = actionRepository.findActionsByTaskId(taskId);
        for(ActionEntity a : result){

            ActionDTO action = dtoMapper.buildActionDTO(a);
            list.add(action);
        }
        return list;
    }


    public ActionDTO updateAction(ActionDTO actionDTO){
        ActionEntity action =  actionRepository.findActionById(actionDTO.getId());
        action.setTaskId(actionDTO.getTask());
        action.setEmployee(actionDTO.getEmployee());
        action.setStart(actionDTO.getStart());
        action.setEnd(actionDTO.getEnd());
        action.setStatus(actionDTO.getStatus());
        action.setResource(actionDTO.getResource());
       var result = actionRepository.saveAndFlush(action);
        return dtoMapper.buildActionDTO(result) ;
    }
}
