package program;

import java.util.Scanner;

public class Menu {

	private static String choice;
	private static Scanner scan = new Scanner(System.in);


	public static void startMenu() {




		do {
			//Scanner scan = new Scanner(System.in);
			System.out.println("YATZY");
			System.out.println("(1) Starta spelet");
			System.out.println("(2) Settings");
			System.out.println("(3) Avsluta");            
			System.out.print("\nSkriv in ditt val: ");
			choice = scan.nextLine();



			switch(choice) {   //tar in användarens input
			case("1"):                
				System.out.println("Starta spelet"); 
			interactionMenu();
			break;
			case("2"):                
				System.out.println("Settings");        //tillfälligt alternativ, kommer ändra efterhand
			break;
			case("3"):
				System.out.println("Stänger ner");
			break;
			default:
				System.out.println("Fel värde (tips 1-3)");    
			}
		}
		while(!choice.equals("3"));
	}



	public static void interactionMenu() {		
		GamePlay play = new GamePlay(); 


		//Scanner scan = new Scanner(System.in);            
		System.out.println("Tryck enter för att börja omgången");
		scan.nextLine();
		play.game();

	}
	
	public static String roundMenu() {
		System.out.println("Vilka tärningar vill du spara?");
		System.out.println("(Använd siffrorna på tärningarna och space för att seperera dem)");
		String input = scan.nextLine();		
	
		
		return input;
		
	}
	
//	public static void errorRoundMenu(String error) {
//		System.out.println(error);
//		roundMenu();
//		
//	}

	public static void roundMenu(String error) {
		System.out.println(error);
		System.out.println("Vilka tärningar vill du spara?");
		System.out.println("(Använd siffrorna på tärningarna och space för att seperera dem)");
		
				
		HoldDices hold = new HoldDices();
		hold.split(scan.nextLine()); // får det ej att fungera, errorhandling blir en loop
	
		
	}



}
