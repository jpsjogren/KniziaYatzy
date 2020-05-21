// Sum Rule (between #6 and #7) implementation

package program;

public class Sum extends SaveScore implements Rule {

    public String rule_name() {
        return "Summan hittills";
    }
    public String rule_description() {
        return "Summan av resultat efter de första 6 steg";
    }

    public boolean cast_is_needed() {
        return false;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int sum = 0;
        for (Rule r=protocol.first_rule(); r!=this; r=protocol.next_rule(r)) {
            try {
                sum += r.peek();
            } catch(Exception e) {
// we can not throw here, without affecting the interface
// ignoring for the moment
                ;
            }
        }
        return sum;
    }
}

