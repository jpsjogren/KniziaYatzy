package program;

import java.util.Scanner;

public class GameFlow {
    public static void main(String[] args) throws Exception {
        gameflow();
    }
    public static void gameflow() throws Exception {
// ---------- START
// ---------- VISA HÄLSNING
        System.out.println("Välkommen till Yatzy!");
        final int max_number_of_players = 4; // 99999 would work as well :-)
        int number_of_players;
        Scanner input = new Scanner(System.in);
//// ---------- FRÅGA HUR MÅNGA SPELARE SKA SPELA
//// -- överflödigt: gör både spelar-gränsnittet och koden
//// -- mer komplicerade, helt i onödan
//        do {
//            System.out.print("Number of players: ");
//            try {
//                number_of_players = Integer.parseInt(input.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("This does not look like a number");
//                continue;
//            }
//            if (number_of_players < 1 || number_of_players > max_number_of_players) {
//                System.out.println("Inappropriate number of players");
//                continue;
//            }
//            break;
//        } while (true);
// ---------- SKAPA ETT TOMT PROTOKOLL
        Protocol[] p = new Protocol[max_number_of_players];
// ---------- FÖR VARJE SPELARE: FRÅGA NAMNET, SPARA NAMNET
// ---------- räknar samtidigt antal spelare
        for (number_of_players=0; number_of_players<max_number_of_players; ) {
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
            p[number_of_players++] = new Protocol(s); // initialiseras respektive kolumn i protokollet
        }
// ---------- SÅ LÄNGE DET FINNS TOMMA PLATSER I PROTOKOLLET
// (detta villkor ger samma utslag oberoende på vilken
// spelare man kollar, vi kollar på den första)
        while (true) {
            boolean found_empty_slot = false;
            for (Rule rule=p[0].first_rule(); rule != null; rule=p[0].next_rule(rule)) {
                if (!rule.cast_is_needed()) { // Sum and Bonus shall be skipped here
                    continue;
                }
                if (rule.empty()) {
                    found_empty_slot = true;
                    break;
                }
            }
            if (!found_empty_slot) { // game is OVER
                break;
            }
// ---------- CYKEL FÖR VARJE SPELARE
            for (int player_number=0; player_number<number_of_players; ++player_number) {
                System.out.println("=======================================");
                System.out.println("Dags att spela för "+p[player_number].player_name());
                GameFlowRelevantRules rr = new GameFlowRelevantRules(p[player_number]);
                System.out.println("Du har följande oanvända regler:");
                for (int i=0; i<rr.rule_names.length; ++i) {
                    System.out.println(rr.rule_names[i]);
                }
// ---------- MARKERA ALLA TÄRNINGAR SOM FRIA
                GameFlowDiceCasting dices = new GameFlowDiceCasting();
                do {
// ---------- GENERERA SLUPMÄSSIGT INNEHÅLL 1 till 6 FÖR ALLA FRIA TÄRNINGAR
                    dices.cast();
// ---------- VISA TÄRNINGARNAS INNEHÅLL
                    dices.show();
// ---------- VISA MENY FÖR ATT MARKERA OM VILKA TÄRNINGAR SKA HÅLLAS alt. ACCEPTERA LÄGET
// ---------- ÄR OMGÅNGEN MINDRE ÄN TRE OCH LÄGET INTE ACCEPTERAT?
                } while (dices.pick_hold(input)); // this has to implement the dialogue
// ---------- VISA MENY SOM GENERERAS FRÅN TOMMA PLATSER
// ---------- I ANVÄNDARENS KOLUMN I PROTOKOLLET
                System.out.println("Vilken regel ska resultatet andvändas med:");
                int[] rule_choice = GameFlowMenu.menu(rr.rule_names);
                if (rule_choice.length == 0) {
                    System.out.println("Beklagligt att du "+p[player_number].player_name()+" inte ville fortsätta...");
                    return;
                }
                int rule_index_to_store_into = rule_choice[0] - 1; // indexing is off-by-one compared to the return values from the menu
// ---------- BERÄKNA RESULTATET ENLIGT DEN VALDA REGELN
                int score = rr.rules[rule_index_to_store_into].calculate(null, dices.data());
                System.out.println(p[player_number].player_name()+" får "+score+" poäng i "+rr.rules[rule_index_to_store_into].rule_name());
// ---------- OCH SPARA DET I PROTOKOLLET
                rr.rules[rule_index_to_store_into].store(score);
            }
        }
// ---------- SKRIVA UT RESULTATET
// rules Sum and Bonus are to be applied explicitly, for each player of course
        for (int player_number=0; player_number<number_of_players; ++player_number) {
          p[player_number].store(6, p[player_number].calculate(6, null)); // Sum
          p[player_number].store(7, p[player_number].calculate(7, null)); // Bonus
        }
        GameFlowFinalPrintout.final_printout(p, number_of_players);
    }
}