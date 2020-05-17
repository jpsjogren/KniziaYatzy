package program;

//---------------------------- usage example:
//Protocol p = new Protocol("Kalle Anka");
//for(Rule r=p.first_rule(); r!=null; r=p.next_rule(r)) {
//    int[] dice_contents;
//    int score;
//    if (r.cast_is_needed()) {
//        // as much as you wish (1-3 times)
//	  do {
//	      // put relevant data into dice_contents...
//	      dice_contents = new WhateverProducesThis(whatever_data);
//	      // calculate score of dices (or/and of the existing entries in the protocol)
//	      score = r.calculate(p, dice_contents);
//	      // act (e.g. show/ask/...) on the score
//	  } while (the_player_and_the_rules_allow);
//	  // store the score into the protocol
//	  r.store(score);
//    } else {
//	  score = r.calculate(p, null);
//    }
//}
//----------------------------
//// when needed, read score from a rule:
//int r.peek();
//----------------------------
//// metadata:
//String r.rule_name();
//String r.rule_description();
//----------------------------

public class Protocol {

    Rule[] rules; // protocol is per player,
                  // an array of rules, including Bonus et al,
                  // each rule has its own way of calculating the score,
                  // its own specific metadata as name and description,
                  // and its own "store-once" score storage slot
    final int number_of_rules = 17;

    String player_name;

    Protocol(String player) throws Exception {
        player_name = player;
        rules = new Rule[number_of_rules];
        int i = 0;
        rules[i++] = new Ones();
        rules[i++] = new Twos();
        rules[i++] = new Threes();
        rules[i++] = new Fours();
        rules[i++] = new Fives();
        rules[i++] = new Sixes();
        rules[i++] = new Sum();
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
        if (i != number_of_rules) {
            throw new Exception("Internt fel BADRULECOUNT");//"Internal error - wrong number of rules"
        }
    }

    public Rule first_rule() {
        return rules[0];
    }
// we could have the rules in a linked list,
// but that would add some complexity,
// without a noticeable gain
    public Rule next_rule(Rule r) {
        int i;
        for (i=0; rules[i]!=r; ++i) {
            ;
        }
        if (++i == rules.length) {
            return null;
        }
        return rules[i];
    }
}
