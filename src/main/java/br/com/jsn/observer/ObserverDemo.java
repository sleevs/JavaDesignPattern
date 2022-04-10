package br.com.jsn.observer;


/*
*  Subject represents the core (or independent or common or engine) abstraction.
*  Observer represents the variable (or dependent or optional or user interface) abstraction.
*  The Subject prompts the Observer objects to do their thing. Each Observer can call back
*  to the Subject as needed.
 */
public class ObserverDemo {

    public static void main (String [] args){

        Subject subject = new Subject();
        Real real = new Real(subject);
        Dollar dollar = new Dollar(subject);

        for(int i = 0 ; i < 5 ; i++){

            subject.setStatus(i);
            System.out.println("=========");
            dollar.update();
            System.out.println("=========");
            real.update();

        }

    }
}
