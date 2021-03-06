// Lower Section LargeStraight Rule (#13) implementation

package program;

public class LargeStraight extends SaveScore implements Rule {

    public String rule_name() {
        return "Stor stege";
    }
    public String rule_description() {
        return "2+3+4+5+6 => 20 poäng";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int hits[] = { 0, 0, 0, 0, 0, 0, 0 };
        for (int dice=0; dice<6; ++dice) {
            ++hits[dices[dice]];
        }
        for (int i=2; i<=6; ++i) {
            if (hits[i] == 0) {
                return 0;
            }
        }
        return 20;
    }
}
