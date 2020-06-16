package program;

import java.util.Scanner;

public class Menu {

	private static String choice;
	private static Scanner scan = new Scanner(System.in);

	public void startMenu() throws Exception {

		do {
			//Scanner scan = new Scanner(System.in);
			System.out.println("Välj ett alternativ:");
			System.out.println("(1) Starta spelet");
			System.out.println("(2) Regler");
			System.out.println("(3) Avsluta");            
			System.out.print("Ditt val: ");
			choice = scan.nextLine();

			switch(choice) {   //tar in användarens input
			case("1"): 
				GameFlow.gameflow();
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

	public void ruleMenu() {

		do {
			System.out.println("Spelregler:");
			System.out.println("===========");
			System.out.println("(1) Hur spelar man?");
			System.out.println("(2) Protokollets övre del");
			System.out.println("(3) Bonus");  
			System.out.println("(4) Protokollets undre del");
			System.out.println("(5) Tretal och fyrtal");
			System.out.println("(6) Stegar, eller stor samt liten straight");
			System.out.println("(7) Kåk");
			System.out.println("(8) Hus");
			System.out.println("(9) Torn");
			System.out.println("(10) Chans");
			System.out.println("(11) Maxiyatzy");
			System.out.println("(12) Gå tillbaka till huvudmenyn");
			System.out.print("Ditt val: ");
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
				GameRules.house();
			break;
			case("9"):
				GameRules.tower();
			break;
			case("10"):
				GameRules.chance();
			break;
			case("11"):
				GameRules.yatzy();
			break;
			case("12"):
                                return;
			default:
				System.out.println("Fel värde (tips 1-12)");    
			}
		}
		while(true);
	}
}
