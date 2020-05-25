package program;

import java.util.Scanner;

public class GameFlow {
    public static void main(String[] args) throws Exception {
        gameflow();
    }
    final static int max_number_of_players = 4; // 99999 would work as well :-)
    static int number_of_players;
    static Scanner input = new Scanner(System.in);
    static Protocol[] p = new Protocol[max_number_of_players];

    public static void gameflow() throws Exception {
// ---------- START
// ---------- VISA HÄLSNING
        System.out.println("Välkommen till Yatzy!");
// ---------- SKAPA ETT TOMT PROTOKOLL
// ---------- FÖR VARJE SPELARE: FRÅGA NAMNET, SPARA NAMNET
// ---------- räknar samtidigt antal spelare
        number_of_players = GameFlowPlayerList.createProtocol(p, input);
// ---------- SÅ LÄNGE DET FINNS TOMMA PLATSER I PROTOKOLLET
        GameFlowRelevantRules rr = null;
        do {
// ---------- CYKEL FÖR VARJE SPELARE
            for (int player_number=0; player_number<number_of_players; ++player_number) {
                System.out.println("=======================================");
                System.out.println("Dags att spela för "+p[player_number].player_name());
                rr = new GameFlowRelevantRules(p[player_number]);
                if (rr.rules.length == 0) {
                    break; // game is OVER
                }
                System.out.println("Du har följande oanvända regler:");
                for (int i=0; i<rr.rule_names.length; ++i) {
                    System.out.println(rr.rule_names[i]);
                }
// ---------- MARKERA ALLA TÄRNINGAR SOM FRIA
// ---------- GENERERA SLUPMÄSSIGT INNEHÅLL 1 till 6 FÖR ALLA FRIA TÄRNINGAR
// ---------- VISA TÄRNINGARNAS INNEHÅLL
// ---------- VISA MENY FÖR ATT MARKERA OM VILKA TÄRNINGAR SKA HÅLLAS alt. ACCEPTERA LÄGET
// ---------- SÅ LÄNGE OMGÅNGEN ÄR MINDRE ÄN TRE OCH LÄGET INTE ÄR ACCEPTERAT
                GameFlowDiceCasting dices = new GameFlowDiceCasting(input);
// ---------- VISA MENY SOM GENERERAS FRÅN TOMMA PLATSER
// ---------- I ANVÄNDARENS KOLUMN I PROTOKOLLET
                System.out.println("Vilken regel ska resultatet andvändas med:");
                int rule_choice = GameFlowMenu.menu(rr.rule_names);
                if (rule_choice == 0) {
                    System.out.println("Beklagligt att du "+p[player_number].player_name()+" inte ville fortsätta...");
                    return;
                }
                int rule_index_to_store_into = rule_choice - 1; // indexing is off-by-one compared to the return values from the menu
// ---------- BERÄKNA RESULTATET ENLIGT DEN VALDA REGELN
                int score = rr.rules[rule_index_to_store_into].calculate(null, dices.data());
                System.out.println(p[player_number].player_name()+" får "+score+" poäng i "+rr.rules[rule_index_to_store_into].rule_name());
// ---------- OCH SPARA DET I PROTOKOLLET
                rr.rules[rule_index_to_store_into].store(score);
            }
        } while (rr.rules.length != 0); // game over?
// ---------- SKRIVA UT RESULTATET
// rules Sum and Bonus are to be applied explicitly
        GameFlowCalculateSumBonus.calculate(p, number_of_players);
        GameFlowFinalPrintout.final_printout(p, number_of_players);
    }
}
