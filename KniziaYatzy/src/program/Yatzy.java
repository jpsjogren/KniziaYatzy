// Lower Section Yatzy Rule (#16) implementation

package program;

import java.util.Arrays;

public class Yatzy extends SaveScore implements Rule {

    public String rule_name() {
        return "Yatzy";
    }
    public String rule_description() {
        return "Alla likadana => 50";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int hits[] = { 0, 0, 0, 0, 0, 0, 0 };
        for (int dice=0; dice<6; ++dice) {
            ++hits[dices[dice]];
        }
        Arrays.sort(hits);
        if (hits[6] == 5) {
            return 100;
        }
        return 0;
    }
}

