package program;

import java.util.Random;

public class Dices {

	Random random = new Random();
	private int[] dices= new int[5];
	
	public void rollAllDices() {
		for (int i = 0; i < dices.length; i++) {
			rollOneDice(i);
		}
	}
	public void rollSpecificDice(int dice) {
		rollOneDice(dice);
	}
	
	private void rollOneDice(int i) {
		dices[i] = random.nextInt(6) + 1;
	}

	public int[] getDice() {
		return dices;
	}
}
