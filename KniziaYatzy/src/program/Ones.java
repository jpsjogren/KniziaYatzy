// Upper Section Ones Rule (#1) implementation

package program;

public class Ones extends SaveScore implements Rule {

    public String rule_name() {
        return "Ettor";
    }
    public String rule_description() {
        return "Summan av alla ettor";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int result = 0;
        for (int i=0; i<6; ++i) {
            if (dices[i] == 1) {
                result += 1;
            }
        }
        return result;
    }
}

