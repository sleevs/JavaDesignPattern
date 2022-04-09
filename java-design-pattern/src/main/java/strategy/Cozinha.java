package strategy;


public class Cozinha extends StrategySolution {

    private int status = 1 ;


    protected void start(){
        System.out.println("start");

    }

    protected void stop(){
        System.out.println("stop");

    }


        protected boolean nexTry(){
        System.out.println("nexTry");
        return true;
        }


    protected boolean isSolution(){
        System.out.println("isSolution " + (status == 3));
        return (status == 3);
    }

}
