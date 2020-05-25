package program;

public class GameFlowCalculateSumBonus {

    public static void calculate(Protocol[] p, int number_of_players) throws Exception {
// rules Sum and Bonus are to be applied explicitly afterwards, for each player,
// these rules do not need any dicecasts
        for (int player_number=0; player_number<number_of_players; ++player_number) {
          p[player_number].store(6, p[player_number].calculate(6, null)); // Sum
          p[player_number].store(7, p[player_number].calculate(7, null)); // Bonus
        }
    }

}
