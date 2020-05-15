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
		
		
		holding.split(Menu.roundMenu());
		holdingDices = holding.getHolded();
		
	}
	
	public void roundTwo(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
			
		Show.dices(dice, holdingDices);
		Arrays.fill(holdingDices, false);
		holding.split(Menu.roundMenu());
		holdingDices = holding.getHolded();
	}
	
	public void roundThree(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
		Show.dices(dice, holdingDices);
		//TODO: show possible results
		//TODO: choose result
	}

}
