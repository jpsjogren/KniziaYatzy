// Upper Section Twos Rule (#2) implementation

package program;

class Twos extends SaveScore implements Rule {

    public String rule_name() {
	return "TvÃ¥or";
    }
    public String rule_description() {
	return "Summan av alla tvÃ¥or";
    }

    public boolean cast_is_needed() {
	return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
	int result = 0;
	for (int i=0; i<5; ++i) {
	    if (dices[i] == 2) {
	        result += 2;
	    }
	}
	return result;
    }
}
