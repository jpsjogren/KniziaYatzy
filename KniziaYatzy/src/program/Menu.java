package program;

import java.util.Scanner;

public class Menu {
	
	private static String choice;
    private static Scanner scan = new Scanner(System.in);
    
    public static void startMenu() {
        

 

        do {
            //Scanner scan = new Scanner(System.in);
            System.out.println("YATZY");
            System.out.println("(1) Start Game");
            System.out.println("(2) Settings");
            System.out.println("(3) Quit");            
            System.out.print("\nEnter Your Choice: ");
            choice = scan.nextLine();

 

            switch(choice) {   //tar in användarens input
            case("1"):                
                System.out.println("Start Game"); 
                //interactionMenu();
            break;
            case("2"):                
                System.out.println("Settings");        //tillfälligt alternativ, kommer ändra efterhand
            break;
            case("3"):
                System.out.println("Shutting Down");
            break;
            default:
                System.out.println("Wrong value (tip 1-3)");    
            }
        }
        while(!choice.equals("3"));
    }

 

    public static void interactionMenu() {

 

        do {
            //Scanner scan = new Scanner(System.in);            
            System.out.println("(1) Roll dice");  
            System.out.println("(2) Save dice");
            System.out.println("(3) Quit");            
            System.out.print("\nEnter Your Choice: ");
            choice = scan.nextLine();

 

            switch(choice) {
            case("1"):                
                System.out.println("Rolls dice");        //tillfälliga alternativ        
            break;
            case("2"):                
                System.out.println("Saves dice");                
            break;
            case("3"):
                System.out.println("Shutting Down");
            break;
            default:
                System.out.println("Wrong value (tip 1-3)");    
            }
        }
        while(!choice.equals("3"));
    }

}
