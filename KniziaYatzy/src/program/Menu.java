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
			System.out.println("(2) Regler");
			System.out.println("(3) Avsluta");            
			System.out.print("\nSkriv in ditt val: ");
			choice = scan.nextLine();



			switch(choice) {   //tar in användarens input
			case("1"): 
				interactionMenu();
			break;
			case("2"):                
				ruleMenu();        
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

	public static String roundMenu(String error) {
		System.out.println(error);
		System.out.println("Vilka tärningar vill du spara?");
		System.out.println("(Använd siffrorna på tärningarna och space för att seperera dem)");

		String input = scan.nextLine();			
		return input;

	}

	public static void ruleMenu() {

		do {


			System.out.println("SpelRegler:");
			System.out.println("(1) Hur spelar man?");
			System.out.println("(2) Protokollets övre del");
			System.out.println("(3) Bonus");  
			System.out.println("(4) Protokollets undre del");
			System.out.println("(5) Tretal och fyrtal");
			System.out.println("(6) Stegar, eller stor samt liten straight");
			System.out.println("(7) Kåk");
			System.out.println("(8) Chans");
			System.out.println("(9) Yatzy");
			System.out.println("(10) Gå tillbaka till Start Menyn");
			System.out.print("\nSkriv in ditt val: ");
			choice = scan.nextLine();



			switch(choice) {   //tar in användarens input
			case("1"):                
				GameRules.howToPLay();
			break;
			case("2"):                
				GameRules.protocolUpperPart();
			break;
			case("3"):
				GameRules.bonus();
			break;
			case("4"):
				GameRules.protocolDownPart();
			break;
			case("5"):
				GameRules.threesAndFoursome();
			break;
			case("6"):
				GameRules.laddersOrStraightFlush();
			break;
			case("7"):
				GameRules.fullHouse();
			break;
			case("8"):
				GameRules.chance();
			break;
			case("9"):
				GameRules.yatzy();
			break;
			case("10"):
				startMenu();
			break;
			default:
				System.out.println("Fel värde (tips 1-10)");    
			}
		}
		while(!choice.equals("10"));

	}



}
