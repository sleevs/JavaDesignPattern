package br.com.jsn.composite;

import br.com.jsn.dto.AnalyzeDTO;

public class AnalyzeService extends ProjectElement{

    private AnalyzeDTO analyzeDTO;

    public AnalyzeService(AnalyzeDTO analyzeDTO){
        this.analyzeDTO =analyzeDTO;
    }
     @Override
    public Object display() {
        System.out.println(" Analyze " + analyzeDTO);
        return analyzeDTO;
    }
    
    
}
