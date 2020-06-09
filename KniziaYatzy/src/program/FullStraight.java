package program;

public class FullStraight extends SaveScore implements Rule {

    static final int korvbiten = 21; // 25 according to a different authority
    public String rule_name() {
        return "Full stege";
    }
    public String rule_description() {
        return "1+2+3+4+5+6 => "+korvbiten+" poäng";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int hits[] = { 0, 0, 0, 0, 0, 0, 0 };
        for (int dice=0; dice<6; ++dice) {
            ++hits[dices[dice]];
        }
        for (int i=1; i<=6; ++i) {
            if (hits[i] == 0) {
                return 0;
            }
        }
        return korvbiten;
    }
}
