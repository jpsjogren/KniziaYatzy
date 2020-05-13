package program;

import java.util.Random;

public class Dices {
	Random random = new Random();
	private int[] dices= new int[5];
	
	public void rollDice(int i) {
			dices[i] = random.nextInt(6) + 1;
			System.out.println(dices[i]);
		
	}
}
