package program;

import java.util.Scanner;

public class GameFlowPlayerList {

// ---------- SKAPA ETT TOMT PROTOKOLL
// ---------- FÖR VARJE SPELARE: FRÅGA NAMNET, SPARA NAMNET

// ---------- return number of players

    public static int createProtocol(Protocol[] p, Scanner input) throws Exception {
        int number_of_players;
        for (number_of_players=0; number_of_players<p.length; ) {
            if (number_of_players == 0) {
                System.out.print("Namnet på spelaren: ");
            } else {
                System.out.print("Namnet på nästa spelare, annars bara Enter: ");
            }
            String s = input.nextLine();
            if (s.equals("")) {
                if (number_of_players == 0) {
                    s = "Yatzy-älskare";
                } else {
                    break;
                }
            }
            if (s.length() > 14) {
                System.out.println("--Vänligen ange ett kortare namn--");
        	continue;
            }
            p[number_of_players++] = new Protocol(s); // initialiseras respektive kolumn i protokollet
        }
        return number_of_players;
    }
}