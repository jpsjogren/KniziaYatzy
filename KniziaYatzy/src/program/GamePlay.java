package program;


public class GamePlay {
	
	RollDices dice = new RollDices();
	boolean[] holdingDices = {false, false, false, false, false};
	HoldDices holding = new HoldDices();
	
	public void game() {
		roundOne();
		roundTwo(holdingDices);
		roundThree(holdingDices);
	}
	
	public void roundOne() {
		dice.rollAllDices();
		Show.dices(dice);
		holding.split("1 2");
		holdingDices = holding.getHolded();
		
	}
	
	public void roundTwo(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
			
		Show.dices(dice);
		//TODO: hold dices
	}
	
	public void roundThree(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
		Show.dices(dice);
		//TODO: show possible results
		//TODO: choose result
	}

}
