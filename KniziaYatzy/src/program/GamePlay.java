package program;


public class GamePlay {
	
	static RollDices dice = new RollDices();
	static boolean[] holdingDices = {false, false, false, false, false};
	
	public static void game() {
		roundOne();
		roundTwo(holdingDices);
		roundThree(holdingDices);
	}
	
	public static void roundOne() {
		dice.rollAllDices();
		Show.dices(dice);
		HoldDices.split("1 2 ");
		holdingDices = HoldDices.getHolded();
		
	}
	
	public static void roundTwo(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
			
		Show.dices(dice);
		//TODO: hold dices
	}
	
	public static void roundThree(boolean[] saves) {
		
		dice.rollSpecificDice(saves);
		Show.dices(dice);
		//TODO: show possible results
		//TODO: choose result
	}

}
