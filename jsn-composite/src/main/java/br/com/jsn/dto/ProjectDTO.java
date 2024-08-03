package br.com.jsn.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.jsn.composite.Component;

public class ProjectDTO  extends Component{ 

    List<Component> list = new ArrayList<>();

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

    
    @Override
    public String toString() {
        return "ProjectDTO [list=" + list + ", account=" + account + ", scope=" + scope + ", description=" + description
                + ", type=" + type + ", Id=" + Id +  ", date=" + date + "]";
    }


    @Override
    public void display() {
        for(Component c : list){
			c.display();
		}
   
    }

	public void add(Component c){
		list.add(c);
	}

	public void remove(Component c){
		list.remove(c);
	}

	public Component getFilhos(int param){
		Component c ;
		c = (Component) list.get(param);
		return c ;

	}

}
