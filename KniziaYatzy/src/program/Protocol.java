package program;

//---------------------------- usage example:
//Protocol p = new Protocol("Kalle Anka");
//for(Rule r=p.first_rule(); r!=null; r=p.next_rule(r)) {
//             ^^^^^^^^^^                 ^^^^^^^^^
//    int[] dice_contents;
//    int score;
//    if (r.cast_is_needed()) {
//          ^^^^^^^^^^^^^^
//        // as much as you wish (1-3 times)
//	  do {
//	      // put relevant data into dice_contents...
//	      dice_contents = new WhateverProducesThis(whatever_data);
//	      // calculate score of dices (or/and of the existing entries in the protocol)
//	      score = r.calculate(p, dice_contents);
//                      ^^^^^^^^^
//	      // act (e.g. show/ask/...) on the score
//	  } while (the_player_and_the_rules_allow);
//	  // store the score into the protocol
//	  r.store(score);
//          ^^^^^
//    } else {
//	  score = r.calculate(p, null);
//                  ^^^^^^^^^
//    }
//}
// in examples below: Protocol p, Rule r, int[] dices, int rulenum
//----------------------------
//int p.calculate(rulenum, dices);
//int r.calculate(p, dices);
//----------------------------
//// when needed, read score from a rule:
//int p.peek(rulenum);
//int r.peek();
//----------------------------
//// metadata:
//String p.player_name();
//String p.rule_name(rulenum);
//String p.rule_description(rulenum);
//String r.rule_name();
//String r.rule_description();
//----------------------------
//// number of rules:
//int p.number_of_rules();
//----------------------------
// NOTE the Sum pseudo-rule is not available through indexing,
// but only as p.next_rule(...) from Bonus
// or explicitly as p.sum()
//----------------------------

public class Protocol {

    private Rule[] rules; // protocol is per player,
                          // an array of rules, including Bonus et al,
                          // each rule has its own way of calculating the score,
                          // its own specific metadata as name and description,
                          // and its own "store-once" score storage slot
    private final int the_number_of_rules = 16;

    private String the_player_name;

    Protocol(String player) throws Exception {
        the_player_name = player;
        rules = new Rule[the_number_of_rules];
        int i = 0;
        rules[i++] = new Ones();
        rules[i++] = new Twos();
        rules[i++] = new Threes();
        rules[i++] = new Fours();
        rules[i++] = new Fives();
        rules[i++] = new Sixes();
//        rules[i++] = new Sum();
// we insert Sum between Sixes and Bonus,
// but only for access through incremental iteration,
// i.e. next_rule(), but not through direct indexing (!),
// the incremental API is there for usage with the "strong order"
// and "half strong order" Swedish Yatzy variation
// while indexing is for the "free order" variation,
// where Sum is to be called explicitly via p.sum() when needed
        Rule the_sum = new Sum();
        rules[i++] = new Bonus();
        rules[i++] = new OnePair();
        rules[i++] = new TwoPairs();
        rules[i++] = new ThreeOfAKind();
        rules[i++] = new FourOfAKind();
        rules[i++] = new SmallStraight();
        rules[i++] = new LargeStraight();
        rules[i++] = new FullHouse();
        rules[i++] = new Chance();
        rules[i++] = new Yatzy();
        if (i != the_number_of_rules) {
            throw new Exception("Internt fel BADRULECOUNT");//"Internal error - wrong number of rules"
        }
    }

    public String player_name() {
	return the_player_name;
    }
    public int number_of_rules() {
	return the_number_of_rules;
    }
    public Rule rule(int rulenum) {
        return rules[rulenum];
    }
    public Rule first_rule() {
        return rules[0];
    }
// we could have the rules in a linked list,
// but that would add some complexity,
// without a noticeable gain
    public Rule next_rule(Rule r) {
	if (r == the_sum) { // the special case of iteration from Sum
	    return rules[6]; // Bonus
	}
	int i;
        for (i=0; rules[i]!=r; ++i) {
            ;
        }
        if (i == 5) { // Sixes()
            return the_sum; // the special case of iteration to Sum
        }
        if (++i == rules.length) {
            return null;
        }
        return rules[i];
    }
    public Rule sum() {
	return the_sum;
    }
    public boolean cast_is_needed(int rulenum) {
	return rules[rulenum].cast_is_needed();
    }
    public void store(int rulenum, int score) throws Exception {
	rules[rulenum].store(score);
    }
    public int peek(int rulenum) throws Exception {
	return rules[rulenum].peek();
    }
    public boolean empty(int rulenum) {
	return rules[rulenum].empty();
    }
    public int calculate(int rulenum, int[] dices) {
	return rules[rulenum].calculate(this, dices);
    }
    public String rule_name(int rulenum) {
	return rules[rulenum].rule_name();
    }
    public String rule_description(int rulenum) {
	return rules[rulenum].rule_description();
    }
}
