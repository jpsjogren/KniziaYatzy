package program;

public class GameFlowCalculateSumBonus {

    public static void calculate(Protocol[] p, int number_of_players) throws Exception {
// rules Sum and Bonus are to be applied explicitly, for each player,
// these rules do not need any dicecasts
        for (int player_number=0; player_number<number_of_players; ++player_number) {
            if (p[player_number].empty(6)) { // we calculate Sum at Bonus exactly once, at the same time,
        	                             // no need to check empty(7)
        	boolean prerequisites = true;
        	for (int rulenum=0; rulenum<6; ++rulenum) {
        	    if (p[player_number].empty(rulenum)) {
        		prerequisites = false;
        		break;
        	    }
        	}
        	if (prerequisites) {
                    p[player_number].store(6, p[player_number].calculate(6, null)); // Sum
                    p[player_number].store(7, p[player_number].calculate(7, null)); // Bonus
        	}
            }
        }
    }
}
