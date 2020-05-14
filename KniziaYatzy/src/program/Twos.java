// Upper Section Twos Rule (#2) implementation

package program;

class Twos extends SaveScore implements Rule {
    
    public boolean cast_is_needed() {
	return true;
    }

  public int calculate(Rule[] protocol, int[] result) {
    return 1;
  }
}
