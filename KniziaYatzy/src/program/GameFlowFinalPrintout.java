package program;

import java.util.HashMap;

public class GameFlowFinalPrintout {
// here we use the knowledge that there are max 4 players
// and also assume max line length to be 80 characters

// -------------------------------------------------------------- //
	public static void final_printout(Protocol[] p, int number_of_players) throws Exception {

		HashMap<String, Integer> UserAndSum = new HashMap<String, Integer>();
		// the data is there in p[player_number].peek(rule_number)
// title
		System.out.format("\n%15s%s\n", "", "Yatzy protocol");
// names
		System.out.format("%15s", "");
		for (int player_number = 0; player_number < number_of_players; ++player_number) {
			System.out.format("%15s", p[player_number].player_name());
		}
		System.out.println();
// rules
		for (int rule_number = 0; rule_number < p[0].number_of_rules(); ++rule_number) {
			System.out.format("%15s", p[0].rule_name(rule_number));
			for (int player_number = 0; player_number < number_of_players; ++player_number) {
				System.out.format("%15d", p[player_number].peek(rule_number));
			}
			System.out.println();
		}
// the final sum
		// changed GRAND TOTAL TO Totalt
		System.out.format("%15s", "Totalt:");
		for (int player_number = 0; player_number < number_of_players; ++player_number) {
			int sum = 0;
			for (int rule_number = 0; rule_number < p[0].number_of_rules(); ++rule_number) {
				if (rule_number == 6) { // skip Sum which is only an illustrative entry
					continue;
				}
				sum += p[player_number].peek(rule_number);

			}
			System.out.format("%15d", sum);
			// store this score to a a Hashmap(Playername,TotalScore)
			UserAndSum.put(p[player_number].player_name(), sum);
		}
		System.out.print("\n\n");
		System.out.println("");
//print who is winner among all players
		// print the values in the Hashmap
		int maxScore = 0;
		String winnerName = "";
		for (String i : UserAndSum.keySet()) {
			System.out.println("Spelare: " + i + "      Totalt: " + UserAndSum.get(i));
			if (UserAndSum.get(i) > maxScore) {
				maxScore = UserAndSum.get(i);
				winnerName = i;
			}

		}
		System.out.println("");
		System.out.println(winnerName + " är vinnaren med poäng : " + maxScore);
		System.out.println("");

	}

}