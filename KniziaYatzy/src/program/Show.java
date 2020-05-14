package program;

public class Show {

	public static void dices(RollDices dice) {
		
		int iSerialNo = 1;
		System.out.println("Dina tärningar visar: ");
		for (int i = 0; i < dice.dices.length; i++) {
			System.out.println("Tärning " + iSerialNo +" : " + dice.dices[i]);
			iSerialNo++;
		}
		System.out.println("");
	}
}
