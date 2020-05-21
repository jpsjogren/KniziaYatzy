// Lower Section FourOfAKind Rule (#11) implementation

package program;

public class FourOfAKind extends SaveScore implements Rule {

    public String rule_name() {
        return "Fyra lika";
    }
    public String rule_description() {
        return "Summan av fyra tärningar med samma tal";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int hits[] = { 0, 0, 0, 0, 0, 0, 0 };
        for (int dice=0; dice<5; ++dice) {
            ++hits[dices[dice]];
        }
        for (int i=1; i<7; ++i) {
            if (hits[i] >= 4) {
                return i * 4;
            }
        }
        return 0;
    }
}

