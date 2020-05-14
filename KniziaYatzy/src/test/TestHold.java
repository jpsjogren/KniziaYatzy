package test;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import program.HoldDices;

class TestHold {

	@Test
	void test() {
		
		HoldDices holdDices = new HoldDices();
		boolean[] expected = {true, false, true, false, true};

		boolean[] actual = {false, false, false, false, false};
		String testString = "5 3 1";
		
		holdDices.split(testString);
		actual = holdDices.getHolded();

		Assert.assertTrue(Arrays.equals(expected, actual));
	}

}
