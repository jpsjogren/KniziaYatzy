package program;

//---------------------------- usage example:
//Protocol p = new Protocol("Kalle Anka");
//for(int rulenum=0; rulenum < p.number_of_rules; ++rulenum) {
//    int[] dice_contents; // int[5]
//    int score;
//    if (p.protocol[rulenum].cast_is_needed()) {
//        // as much as you wish (1-3 times)
//	  do {
//	      // put relevant data into dice_contents...
//	      dice_contents = new WhateverProducesThis(whatever_data);
//	      // calculate score of dices (or/and the existing entries in the protocol)
//	      score = p.protocol[rulenum].calculate(p.protocol, dice_contents);
//	      // act (e.g. show/ask/...) on the score
//	  } while (the_player_and_the_rules_allow);
//	  // store the score into the protocol
//	  p.protocol[rulenum].store(score);
//    } else {
//	  score = p.protocol[rulenum].calculate(p.protocol, null);
//    }
//}
//----------------------------
//// when needed, read score from an earlier rule:
//int earlier_score = p.protocol[earlier_rulenum].peek();
//----------------------------
//// metadata:
//String rule_name = p.protocol[rulenum].rule_name();
//String rule_description = p.protocol[rulenum].rule_description();
//----------------------------

public class Protocol {

  Rule[] protocol; // protocol is an array of Rules, per player
                   // protocol consists of a number of rules
                   // in practice 16 (i.e. including Bonus et al)
                   // each row has a unique way of calculating the score
  final int number_of_rules = 1;
  
  String player_name;
  
  Protocol(String player) throws Exception {
    player_name = player;
    protocol = new Rule[number_of_rules];
    int i = 0;
    //protocol[i++] = new Ones();
    protocol[i++] = new Twos();
    // ...
    //protocol[i++] = new Yatzy();
    if (i != number_of_rules) {
      throw new Exception("Internt fel BADRULECOUNT"); // "Internal error - wrong number of rules"
    }
  }
}
