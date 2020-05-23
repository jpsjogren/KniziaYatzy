package program;

import java.util.Arrays;

public class GamePlay {
	static Menu menu = new Menu();
	RollDices dice = new RollDices();
	boolean[] holdingDices = {false, false, false, false, false};
	HoldDices holding = new HoldDices();
	Player[] player;
	int score;
	//Protocol protocol = new Protocol();
	
	public void game() {
		roundOne();
		roundTwo(holdingDices);
		roundThree(holdingDices);
	}
	
	public void roundOne() {
		dice.rollAllDices();
		Show.dices(dice, holdingDices);
		
		
		holding.split(menu.roundMenu());
		holdingDices = holding.getHolded();
		
	}
	
	public void roundTwo(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
			
		Show.dices(dice, holdingDices);
		Arrays.fill(holdingDices, false);
		holding.split(menu.roundMenu());
		holdingDices = holding.getHolded();
	}
	
	public void roundThree(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
		Show.dices(dice, holdingDices);
		
	    //score = protocol.calculate(0, dice.getDice());
	    //System.out.println(score);
	    
		//TODO: show possible results
		//TODO: choose result
	}
	
	public void setNumberOfPlayers(int i) {
		
		player = new Player[i];
	}

}
