package strategy;


public abstract class StrategySolution implements Strategy{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		start();
		while(nexTry() && !isSolution()){
		}
		stop();
		
	}
	

	abstract void start();
	abstract boolean nexTry();
	abstract boolean isSolution();
	abstract void stop();
}
