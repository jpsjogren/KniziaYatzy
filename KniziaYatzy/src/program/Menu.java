package program;

import java.util.Scanner;

public class Menu {

	private static String choice;
	private static Scanner scan = new Scanner(System.in);
	static GamePlay play = new GamePlay();


	public void startMenu() {

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
				playerMenu();
			break;
			case("2"):                
				ruleMenu();        
			break;
			case("3"):
				System.out.println("St�nger ner");
			break;
			default:
				System.out.println("Fel v�rde (tips 1-3)");    
			}
		}
		while(!choice.equals("3"));
	}



	public void interactionMenu() {		
		//GamePlay play = new GamePlay(); 


		//Scanner scan = new Scanner(System.in);            
		System.out.println("Tryck enter f�r att b�rja omg�ngen");
		scan.nextLine();
		play.game();

	}

	public String roundMenu() {
		System.out.println("Vilka t�rningar vill du spara?");
		System.out.println("(Anv�nd siffrorna p� t�rningarna och space f�r att seperera dem)");
		String input = scan.nextLine();		

		return input;

	}

	//	public static void errorRoundMenu(String error) {
	//		System.out.println(error);
	//		roundMenu();
	//		
	//	}

	public String roundMenu(String error) {
		System.out.println(error);
		System.out.println("Vilka t�rningar vill du spara?");
		System.out.println("(Anv�nd siffrorna p� t�rningarna och space f�r att seperera dem)");

		String input = scan.nextLine();			
		return input;

	}

	public void playerMenu() {
		boolean correct = true;
		do {
			System.out.println("Hur m�nga spelare �r ni? ");
			
			System.out.println("(1) Flera spelare");
			System.out.println("(2) G� tillbaka"); 
			System.out.print("\nSkriv in ditt val: ");
			choice = scan.nextLine();
			
			switch(choice) {   //tar in anv�ndarens input
			case("1"): 
				play.setNumberOfPlayers(1);
				interactionMenu();
			break;
			case("2"):                
				play.setNumberOfPlayers(2);				
				interactionMenu();
			break;
			case("3"):                
				play.setNumberOfPlayers(3);				
				interactionMenu();
			break;
			case("4"):                
				play.setNumberOfPlayers(4);				
				interactionMenu();
			break;			
			default:
				correct = false;
				System.out.println("Fel v�rde (tips 1-4)");    
			}
		}
		while(!correct);
	}

	public void ruleMenu() {

		do {


			System.out.println("Spelregler:");
			System.out.println("(1) Hur spelar man?");
			System.out.println("(2) Protokollets �vre del");
			System.out.println("(3) Bonus");  
			System.out.println("(4) Protokollets undre del");
			System.out.println("(5) Tretal och fyrtal");
			System.out.println("(6) Stegar, eller stor samt liten straight");
			System.out.println("(7) K�k");
			System.out.println("(8) Chans");
			System.out.println("(9) Yatzy");
			System.out.println("(10) G� tillbaka");
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
				System.out.println("Fel v�rde (tips 1-10)");    
			}
		}
		while(!choice.equals("10"));

	}



}
