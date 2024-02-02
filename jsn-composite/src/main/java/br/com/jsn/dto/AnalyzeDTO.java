package br.com.jsn.dto;

public class AnalyzeDTO {

    private String objective;
    private String value ;
    private String cost;
    private String time;
    private String complexity;
    private String priority;

    public AnalyzeDTO(){}

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "AnalyzeDTO [objective=" + objective + ", value=" + value + ", cost=" + cost + ", time=" + time
                + ", complexity=" + complexity + ", priority=" + priority + "]";
    }

    
    
    
}
