package program;

interface Rule extends RuleStorage { // interface for implementing each of our 16 rules

  int calculate(Rule[] protocol, RollDices rd);

}
