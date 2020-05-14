package program;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hallå!");
		

		// story ID#5 starts
		RollDices dicesObj = new RollDices();
		dicesObj.rollAllDices();
		int iSerialNo = 1;
		System.out.println("Result from all five dices rolled are as below:");
		for (int i = 0; i < dicesObj.dices.length; i++) {
			
			System.out.println("Value of Dice " + iSerialNo + " : " + dicesObj.dices[i]);
			iSerialNo++;
		}
		// story ID#5 ends

	}

}
