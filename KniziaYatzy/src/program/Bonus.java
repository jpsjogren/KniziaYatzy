// Bonus Rule (#7) implementation

package program;

public class Bonus extends SaveScore implements Rule {

    public String rule_name() {
        return "BONUS";
    }
    public String rule_description() {
        return "100 extra poäng om minst 84 finns";
    }

    public boolean cast_is_needed() {
        return false;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int sum = 0;
        Rule r = protocol.first_rule();
        for (int i=0; i<6; ++i, r=protocol.next_rule(r)) {
            try {
                sum += r.peek();
            } catch(Exception e) {
// we can not throw here, without affecting the interface
// ignoring for the moment
                ;
            }
        }
        if (sum >= 84) {
            return 100;
        } else {
            return 0;
        }
    }
}

