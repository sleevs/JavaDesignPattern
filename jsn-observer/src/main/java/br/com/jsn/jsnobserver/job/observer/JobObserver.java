package br.com.jsn.jsnobserver.job.observer;

import br.com.jsn.jsnobserver.dto.ProfessionalDTO;

public  class JobObserver {

    private  ProfessionalDTO professionalDTO;

    public JobObserver(ProfessionalDTO professionalDTO){
        this.professionalDTO = professionalDTO;
    }

    public  void update(JobSubject jobSubject){

        jobSubject.getJobDTO();

     }
    
}
