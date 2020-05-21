package program;

public class Show {

	public static void dices(RollDices dice, boolean[] hold) {
		
		int[] dices = dice.getDice();
		int iSerialNo = 1;
		System.out.println("Dina tärningar visar: ");
		for (int i = 0; i < dices.length; i++) {
			System.out.print("Tärning " + iSerialNo +": " + dices[i]);
			iSerialNo++;
			if (hold[i]) {
				System.out.println(" <-Sparat");
			}
			else {
				System.out.println("");
			}
		}
		System.out.println("");
	}
}
