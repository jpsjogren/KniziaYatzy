package program;

public class GameFlowPrintout {
// here we use the knowledge that there are max 4 players
// and also assume max line length to be 80 characters

// -------------------------------------------------------------- //
    public static void printout(Protocol[] p, int number_of_players) throws Exception {
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
        GameFlowCalculateSumBonus.calculate(p, number_of_players);
        for (int rule_number=0; rule_number<p[0].number_of_rules(); ++rule_number) {
            System.out.format("%15s", p[0].rule_name(rule_number));
            for (int player_number=0; player_number<number_of_players; ++player_number) {
        	if (p[player_number].empty(rule_number)) {
        	    System.out.format("%15s", "");
        	} else {
                    System.out.format("%15d", p[player_number].peek(rule_number));
        	}
            }
            System.out.println();
        }
// the final sum
        System.out.format("%15s", "GRAND TOTAL:");
        int[] places = new int[number_of_players];
        int[] sums = new int[number_of_players];
        for (int i=0; i<number_of_players; ++i) {
            places[i] = 1;
            sums[i] = 0;
        }
        for (int player_number=0; player_number<number_of_players; ++player_number) {
            int sum = 0;
            for (int rule_number=0; rule_number<p[0].number_of_rules(); ++rule_number) {
                if (p[player_number].empty(rule_number)) {
                    continue;
                }
                if (rule_number == 6) { // skip Sum which is only an illustrative entry
                    continue;
                }
                sum += p[player_number].peek(rule_number);
            }
            System.out.format("%15d", sum);
            for (int i=0; i<player_number; ++i) {
                if (sum > sums[i]) {
                    ++places[i];
                } else if (sum < sums[i]){
            	    ++places[player_number];
                }
            }
            sums[player_number] = sum;
        }
        System.out.println();
        System.out.format("%15s", "Platserna:");
        for (int player_number=0; player_number<number_of_players; ++player_number) {
            System.out.format("%15d", places[player_number]);
        }
        System.out.println();
    }
}