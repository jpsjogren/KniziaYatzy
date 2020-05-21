// Upper Section Fives Rule (#5) implementation

package program;

public class Fives extends SaveScore implements Rule {

    public String rule_name() {
        return "Femmor";
    }
    public String rule_description() {
        return "Summan av alla femmor";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int result = 0;
        for (int i=0; i<5; ++i) {
            if (dices[i] == 5) {
                result += 5;
            }
        }
        return result;
    }
}

