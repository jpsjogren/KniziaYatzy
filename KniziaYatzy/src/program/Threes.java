// Upper Section Threes Rule (#3) implementation

package program;

public class Threes extends SaveScore implements Rule {

    public String rule_name() {
        return "Treor";
    }
    public String rule_description() {
        return "Summan av alla treor";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int result = 0;
        for (int i=0; i<6; ++i) {
            if (dices[i] == 3) {
                result += 3;
            }
        }
        return result;
    }
}

