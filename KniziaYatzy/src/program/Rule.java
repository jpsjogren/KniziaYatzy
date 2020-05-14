package program;

public interface Rule extends RuleStorage { // interface for implementing each of our 16 rules

    boolean cast_is_needed();

    int calculate(Rule[] protocol, int[] dices_contents);

}
