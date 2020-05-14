package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import program.RollDices;

class TestDice {

	@Test
	void testRollAllDices() {
		
		RollDices dices = new RollDices();
		dices.rollAllDices();
		int[] test = new int[5];
		
		for (int j = 0; j < 100; j++) {
			test = dices.getDice();
			for (int i = 0; i < test.length; i++) {
				if (test[i] < 1 && test[i] > 6) {
					fail("Dice not between 1-6");
				}
			}
		}
	}
	
	@Test
	void getDices() {
		RollDices dices = new RollDices();
		int[] testDices = dices.getDice();
		
		assertArrayEquals(new int[]{0,0,0,0,0},testDices);
	}
}
