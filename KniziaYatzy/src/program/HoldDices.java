package program;

public class HoldDices {
	
	boolean[] toHold = new boolean[5];
	
	/*
	 * This class takes a String input and converts it to a boolean array.
	 * So that the Gameplay Class knows what to hold.
	 * In case that the String is in the wrong format, it will return an error message and go back to the menu.
	 * 
	 */
	
	
	//For triming away spacec and check the lenght is not over 5 dices
	//It will also split the string into seperate string in an array
	public void split(String input) {
		input = input.trim();
		if (input.length() > 10) {
			errorHandling("Du har skrivit f�r m�nga tecken");
		}
		String[] splitted = input.split(" ");
		parsing(splitted);
	}
	
	
	
	//For converting String to int
	//If its not an int, then pass on to error handling.
	private void parsing(String[] splitted) {
		
		int[] parsed = {0,0,0,0,0};
		for (int i = 0; i < splitted.length; i++) {
			try {
				parsed[i] = Integer.parseInt(splitted[i]);
				
			} catch (Exception e) {
				errorHandling("Du angav inte en korrekt siffra.\n Anv�nd siffrorna 1-6 och mellanslag mellan varje t�rning du vill spara");
			}
			if (parsed[i] < 1 && parsed[i] > 6) {
				errorHandling("Du angav inte en korrekt siffra.\n Anv�nd siffrorna 1-6 och mellanslag mellan varje t�rning du vill spara");
			}
		}
		toBool(parsed);
	}
	
	
	//Converts the nuber into to true in the right place in the array
	private void toBool(int[] parsed) {
		for (int i = 0; i < parsed.length; i++) {
			if (parsed[i] != 0) {
				toHold[parsed[i]-1] = true; 
			}
		}
	}
	
	//Will show an error message to the user and send you back to the menu.
	private void errorHandling(String string) {
		System.out.println(string);
		//TODO Send back to menu
		
	}
	
	//Will return the boolean array
	public boolean[] getHolded() {
		return toHold;
	}
}
