// Upper Section Sixes Rule (#6) implementation

package program;

public class Sixes extends SaveScore implements Rule {

    public String rule_name() {
        return "Sexor";
    }
    public String rule_description() {
        return "Summan av alla sexor";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int result = 0;
        for (int i=0; i<5; ++i) {
            if (dices[i] == 6) {
                result += 6;
            }
        }
        return result;
    }
}

