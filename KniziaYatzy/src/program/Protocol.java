package program;

//---------------------------- usage example:
//Protocol p = new Protocol("Kalle Anka");
//for(int rulenum=0; rulenum < 16; ++rulenum) {
//    int[] dice_contents; // int[5]
//    int score;
//    if (p[rulenum].cast_is_needed()) {
//        // as much as you wish (1-3 times)
//	  do {
//	      // put relevant data into dice_contents...
//	      dice_contents = new WhateverProducesThis(whatever_data);
//	      // calculate score of dices (or/and the existing entries in the protocol)
//	      score = p[rulenum].calculate(p, dice_contents);
//	      // act (e.g. show/ask/...) on the score
//	  } while (the_player_and_the_rules_allow);
//	  // store the score into the protocol
//	  p[rulenum].store(score);
//    } else {
//	  score = p[rulenum].calculate(p, null);
//    }
//}
//----------------------------
//// when needed, read score from an earlier rule:
//earlier_score = p[earlier_rulenum].peek();
//----------------------------

public class Protocol {

  Rule[] protocol; // protocol is an array of Rules
                   // protocol consists of 16 rows, including Bonus
                   // each row has a unique way of calculating the score
  String player_name;
  
  Protocol(String player) throws Exception {
    player_name = player;
    protocol = new Rule[16];
    int i = 0;
    //protocol[i++] = new Ones();
    protocol[i++] = new Twos();
    // ...
    //protocol[i++] = new Yatzy();
    if (i != 1) {
      throw new Exception("Internt fel BADRULECOUNT"); // "Internal error - wrong number of rules"
    }
  }
}
