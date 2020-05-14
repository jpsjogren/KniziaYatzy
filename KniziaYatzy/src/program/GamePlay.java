package program;

import java.util.Arrays;

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
		Show.dices(dice, holdingDices);
		//TODO Menu choice on what to hold.
		//To be inserted into holding.split();
		
		holding.split("5 1 2 ");
		holdingDices = holding.getHolded();
		
	}
	
	public void roundTwo(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
			
		Show.dices(dice, holdingDices);
		Arrays.fill(holdingDices, false);
		holding.split("3 1 2 ");
		holdingDices = holding.getHolded();
	}
	
	public void roundThree(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
		Show.dices(dice, holdingDices);
		//TODO: show possible results
		//TODO: choose result
	}

}
