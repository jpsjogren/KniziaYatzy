// Lower Section SmallStraight Rule (#12) implementation

package program;

public class SmallStraight extends SaveScore implements Rule {

    public String rule_name() {
        return "Liten stege";
    }
    public String rule_description() {
        return "1+2+3+4+5 => 15 poäng";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int hits[] = { 0, 0, 0, 0, 0, 0, 0};
        for (int dice=0; dice<6; ++dice) {
            ++hits[dices[dice]];
        }
        for (int i=1; i<=5; ++i) {
            if (hits[i] == 0) {
                return 0;
            }
        }
        return 15;
    }
}

