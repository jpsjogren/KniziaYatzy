// Lower Section Yatzy Rule (#16) implementation

package program;

import java.util.Arrays;

public class Yatzy extends SaveScore implements Rule {

    public String rule_name() {
        return "Maxiyatzy";
    }
    public String rule_description() {
        return "Alla likadana => 100";
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
        if (hits[6] == 6) {
            return 100;
        }
        return 0;
    }
}

