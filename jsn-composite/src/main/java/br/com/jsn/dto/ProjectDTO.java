package br.com.jsn.dto;

public class ProjectDTO  { 


    private Long account ;
    private String scope ;
    private String description;
    private String type ;
    private Long Id ;
    private String date;


    
    public ProjectDTO(){}

  
    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }


    public String getScope() {
        return scope;
    }


    public void setScope(String scope) {
        this.scope = scope;
    }



    public String getDescription() {
        return description;
    }





    public void setDescription(String description) {
        this.description = description;
    }





    public String getType() {
        return type;
    }





    public void setType(String type) {
        this.type = type;
    }





    public Long getId() {
        return Id;
    }





    public void setId(Long id) {
        Id = id;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


 

}
