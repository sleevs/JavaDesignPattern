package br.com.jsn.template;

public class TemplateMethodDemo {

    public static void main(String [] args){


        Framework framework = new Model() ;
        framework.templateMethod();
        System.out.println();
        framework = new Controller();
        framework.templateMethod();
        System.out.println();
        framework = new View();
        framework.templateMethod();

    }
}
