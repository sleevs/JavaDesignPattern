package br.com.jsn.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MacModel {


    private String menu;
    private String window ;
    private String location ;

    public MacModel(){}

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
