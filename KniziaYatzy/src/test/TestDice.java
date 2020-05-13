package test;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import program.RollDices;

class TestDice {

	@Test
	void test() {
		RollDices dices = new RollDices();
		
		dices.rollAllDices();
		dices.rollSpecificDice(1);
		int[] test = dices.getDice();
		System.out.println(Arrays.toString(test));
		
		
	}

}
