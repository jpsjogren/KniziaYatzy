package program;

public class Protocol {

  Rule[] protocol; // protocol is an array of Rules
                   // protocol consists of 16 rows, including Bonus
                   // each row has a unique way of calculating the score
  String player_name;
  
  Protocol(String player) throws Exception {
    player_name = player;
    protocol = new Rule[16];
    int i = 0;
    protocol[i++] = new Ones();
    protocol[i++] = new Twos();
    // ...
    protocol[i++] = new Yatzy();
    if (i != 16) {
      throw Exception("Internt fel BADRULECOUNT"); // "Internal error - wrong number of rules"
    }
  }
}
