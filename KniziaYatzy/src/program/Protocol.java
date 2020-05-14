package program;

//---------------------------- usage example:
//Protocol p = new Protocol("Kalle Anka");
//for(int rulenum=0; rulenum < p.number_of_rules; ++rulenum) {
//    int[] dice_contents; // int[5]
//    int score;
//    if (p.rules[rulenum].cast_is_needed()) {
//        // as much as you wish (1-3 times)
//	  do {
//	      // put relevant data into dice_contents...
//	      dice_contents = new WhateverProducesThis(whatever_data);
//	      // calculate score of dices (or/and of the existing entries in the protocol)
//	      score = p.rules[rulenum].calculate(p, dice_contents);
//	      // act (e.g. show/ask/...) on the score
//	  } while (the_player_and_the_rules_allow);
//	  // store the score into the protocol
//	  p.rules[rulenum].store(score);
//    } else {
//	  score = p.rules[rulenum].calculate(p, null);
//    }
//}
//----------------------------
//// when needed, read score from an earlier rule:
//int earlier_score = p.rules[earlier_rulenum].peek();
//----------------------------
//// metadata:
//String rule_name = p.rules[rulenum].rule_name();
//String rule_description = p.rules[rulenum].rule_description();
//----------------------------

public class Protocol {

  Rule[] rules; // protocol is per player,
                // an array of 16 rules (i.e. including Bonus et al),
                // each rule has its own way of calculating the score,
                // its own specific metadata as name and description,
                // and its own "store-once" score storage slot
  final int number_of_rules = 1;
  
  String player_name;
  
  Protocol(String player) throws Exception {
    player_name = player;
    rules = new Rule[number_of_rules];
    int i = 0;
    //rules[i++] = new Ones();
    rules[i++] = new Twos();
    // ...
    //rules[i++] = new Yatzy();
    if (i != number_of_rules) {
      throw new Exception("Internt fel BADRULECOUNT"); // "Internal error - wrong number of rules"
    }
  }
}
