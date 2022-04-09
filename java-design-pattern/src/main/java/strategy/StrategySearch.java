package strategy;

public abstract class StrategySearch implements Strategy{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		while(true){

			preProcess();
			if(search()){
				break;
			}
			posProcess();

		}
		
	}


	abstract void preProcess();
	abstract boolean search();
	abstract void posProcess();

}
