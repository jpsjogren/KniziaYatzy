// Bonus Rule (#7) implementation

package program;

class Bonus extends SaveScore implements Rule {

    public String rule_name() {
        return "Bonus";
    }
    public String rule_description() {
        return "50 extra poäng om minst 63 finns";
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
        if (sum >= 63) {
            return 50;
        } else {
            return 0;
        }
    }
}

