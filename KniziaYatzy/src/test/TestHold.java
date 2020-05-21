package test;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.Arrays;
import program.HoldDices;

public class TestHold {

	@Test
	public void test() {
		
		HoldDices holdDices = new HoldDices();
		boolean[] expected = {true, false, true, false, true};

		boolean[] actual = {false, false, false, false, false};
		String testString = "5 3 1";
		
		holdDices.split(testString);
		actual = holdDices.getHolded();

		Assert.assertTrue(Arrays.equals(expected, actual));
	}

}
