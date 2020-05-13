package test;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import program.Dices;

class TestDice {

	@Test
	void test() {
		Dices dices = new Dices();
		
		dices.rollAllDices();
		dices.rollSpecificDice(1);
		int[] test = dices.getDice();
		System.out.println(Arrays.toString(test));
		
		
	}

}
