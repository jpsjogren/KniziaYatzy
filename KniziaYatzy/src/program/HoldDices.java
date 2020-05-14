package program;

public class HoldDices {
	
	static boolean[] toHold = new boolean[5];
	
	public static void split(String input) {
		input = input.trim();
		if (input.length() > 10) {
			errorHandling("Du har skrivit för många tecken");
		}
		String[] splitted = input.split(" ");
		parsing(splitted);
	}
	
	
	
	
	private static void parsing(String[] splitted) {
		
		int[] parsed = {0,0,0,0,0};
		for (int i = 0; i < splitted.length; i++) {
			try {
				parsed[i] = Integer.parseInt(splitted[i]);
				
			} catch (Exception e) {
				errorHandling("Du angav inte en korrekt siffra.\n Använd siffrorna 1-6 och mellanslag mellan varje tärning du vill spara");
			}
			if (parsed[i] < 1 && parsed[i] > 6) {
				errorHandling("Du angav inte en korrekt siffra.\n Använd siffrorna 1-6 och mellanslag mellan varje tärning du vill spara");
			}
		}
		toBool(parsed);
	}
	
	
	
	private static void toBool(int[] parsed) {
		for (int i = 0; i < parsed.length; i++) {
			if (parsed[i] != 0) {
				toHold[parsed[i]-1] = true; 
			}
		}
		
	}
	
	private static void errorHandling(String string) {
		// TODO Visa meddelande och skicka tillbaka till nytt menyMetod.
		
	}
	
	public static boolean[] getHolded() {
		return toHold;
	}
}
