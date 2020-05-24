package program;

public class GameFlowFinalPrintout {
// here we use the knowledge that there are max 4 players
// and also assume max line length to be 80 characters

// -------------------------------------------------------------- //
    public static void final_printout(Protocol[] p, int number_of_players) throws Exception {
        // the data is there in p[player_number].peek(rule_number)
// title
        System.out.format("\n%15s%s\n", "", "Yatzy protocol");
// names
        System.out.format("%15s", "");
        for (int player_number=0; player_number<number_of_players; ++player_number) {
            System.out.format("%15s", p[player_number].player_name());
        }
        System.out.println();
// rules
        for (int rule_number=0; rule_number<p[0].number_of_rules(); ++rule_number) {
            System.out.format("%15s", p[0].rule_name(rule_number));
            for (int player_number=0; player_number<number_of_players; ++player_number) {
                System.out.format("%15d", p[player_number].peek(rule_number));
            }
            System.out.println();
        }
// the final sum
        System.out.format("%15s", "GRAND TOTAL:");
        for (int player_number=0; player_number<number_of_players; ++player_number) {
            int sum = 0;
            for (int rule_number=0; rule_number<p[0].number_of_rules(); ++rule_number) {
                if (rule_number == 6 ) { // skip Sum which is only an illustrative entry
                    continue;
                }
                sum += p[player_number].peek(rule_number);
            }
            System.out.format("%15d", sum);
        }
        System.out.print("\n\n");
    }
}