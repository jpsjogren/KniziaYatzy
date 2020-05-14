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

		do {
			//Scanner scan = new Scanner(System.in);            
			System.out.println("(1) Börja omgång, kasta tärningar");  
			System.out.println("(2) Spara tärningar");
			System.out.println("(3) Avsluta");            
			System.out.print("\nSkriv in ditt val: ");
			choice = scan.nextLine();



			switch(choice) {
			case("1"):                
				//System.out.println("Kasta tärningar");        //tillfälliga alternativ  				
				play.game();
			break;
			case("2"):                
				System.out.println("Spara tärningar");                
			break;
			case("3"):
				System.out.println("Stänger ner");
				System.exit(0);
			break;
			default:
				System.out.println("Fel värde (tips 1-3)");    
			}
		}
		while(!choice.equals("3"));
	}



	

}
