package br.com.jsn.jsnobserver.job.observer;

import java.util.ArrayList;
import java.util.List;

import br.com.jsn.jsnobserver.dto.JobDTO;

public class JobSubject {

    private JobDTO jobDTO;

    private List<JobObserver> list = new ArrayList<>();

    

    public JobSubject(JobDTO jobDTO) {
        this.jobDTO= jobDTO;
    }


    public void add(JobObserver o){
        list.add(o);

    }
    public void remove(JobObserver o){
        list.remove(0);
    }

    public  void notifyObserver(){

        for(JobObserver job : list){
            job.update(this);
        }

    }

    public void isClose(){
        this.jobDTO.setOpen(false);
        notifyObserver();
    }


    public JobDTO getJobDTO() {
        return jobDTO;
    }


    


    
    
}
