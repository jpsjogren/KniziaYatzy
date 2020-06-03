package program;

import java.util.TreeSet;
import java.util.Collections;

public class GameFlowPrintout {
// here we use the knowledge that there are max 4 players
// and also assume max line length to be 80 characters

// -------------------------------------------------------------- //
    public static void printout(Protocol[] p, int number_of_players, boolean game_over) throws Exception {

        // the data is there in p[player_number].peek(rule_number)
// title
        System.out.format("\n%15s%s\n", "", "Yatzy-protokollet");
        System.out.println();
// names
        System.out.format("%15s", "");
        for (int player_number=0; player_number<number_of_players; ++player_number) {
            System.out.format("%-15s", p[player_number].player_name());
        }
        System.out.println();
// rules
        GameFlowCalculateSumBonus.calculate(p, number_of_players);
        for (int rule_number=0; rule_number<p[0].number_of_rules(); ++rule_number) {
            if (rule_number == 6) { // Sum
                System.out.println();
            }
            System.out.format("%-15s", p[0].rule_name(rule_number));
            for (int player_number=0; player_number<number_of_players; ++player_number) {
        	if (p[player_number].empty(rule_number)) {
        	    System.out.format("%15s", "");
        	} else {
                    System.out.format("%-15d", p[player_number].peek(rule_number));
        	}
            }
            System.out.println();
            if (rule_number == 7) { // Bonus
                System.out.println();
            }
        }
// the final sum
        System.out.format("\n%-15s", "---Totalt---");
        int[] places = new int[number_of_players];
        int[] sums = new int[number_of_players];
	TreeSet<Integer> sorted_sums = new TreeSet<Integer>(Collections.reverseOrder());
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
            System.out.format("%-15d", sum);

            sums[player_number] = sum;
            sorted_sums.add(sum);
        }
        System.out.println();
        System.out.format("%-15s", "   Plats");
        for (int player_number=0; player_number<number_of_players; ++player_number) {
            int rank = 1;
            for (int ss : sorted_sums) {
                if (sums[player_number] == ss) {
                    System.out.format("%-15d", rank);
                    break;
                }
                ++rank;
            }
        }
        System.out.println();
// the winner list
        if (game_over) {
	    int[] sorted_sums_array = new int[sorted_sums.size()];
	    int i = 0;
	    for (Integer ii : sorted_sums) {
	        sorted_sums_array[i++] = ii;
	    }
            int max_sum = sorted_sums_array[i-1];
            System.out.println();
            int rank = 1;
            for (int ss : sorted_sums) {
                String placement;
                switch (rank) {
                    case 1:
                        placement = "**!Vinnare!**";
                        break;
                    case 2:
                        placement = "Andra plats";
                        break;
                    case 3:
                        placement = "Tredje plats";
                        break;
                    case 4:
                        placement = "Fjärde plats";
                        break;
                    case 5:
                        placement = "Femte plats";
                        break;
                    default:
                        placement = "Och sedan";
                        break;
                }
                System.out.format("%-15s", placement);
                boolean need_header = false;
                for (int player_number=0; player_number<number_of_players; ++player_number) {
                    if (sums[player_number] == ss) {
                        if (need_header) {
                            System.out.format("%15s", "");
                        }
                        System.out.format("%-15smed resultatet %d\n", p[player_number].player_name(), ss);
                        need_header = true;
                    }
                }
                ++rank;
            }
            System.out.println();
        }
        
    }
}