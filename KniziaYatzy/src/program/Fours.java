// Upper Section Fours Rule (#4) implementation

package program;

public class Fours extends SaveScore implements Rule {

    public String rule_name() {
        return "Fyror";
    }
    public String rule_description() {
        return "Summan av alla fyror";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int result = 0;
        for (int i=0; i<6; ++i) {
            if (dices[i] == 4) {
                result += 4;
            }
        }
        return result;
    }
}

