package program;

import java.util.Random;

public class RollDices {

	Random random = new Random();
	private int[] dices = {0,0,0,0,0};
	
	
	//When you want to roll all five dices at once
	public void rollAllDices() {
		for (int i = 0; i < dices.length; i++) {
			rollOneDice(i);
		}
	}
	
	//When you want to roll a specific dice. Ex. when you are holding dice x and want to roll the other ones.
	//Takes a Bool[] and if its false it will throw the dice again.
	public void rollSpecificDice(boolean[] saves) {
		
		for (int i = 0; i < saves.length; i++) {
			if (!saves[i]) {
				rollOneDice(i);
			}
		}
	}
	
	//A private class to protect the dices
	private void rollOneDice(int i) {
		dices[i] = random.nextInt(6) + 1;
	}

	
	//When you want the diceses ex. for calculating the result. Use this method
	public int[] getDice() {
		return dices;
	}
}