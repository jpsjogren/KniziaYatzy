package program;

public class Protocol {

  Rule[] protocol; // protocol is an array of Rules
                   // protocol consists of 16 rows, including Bonus
                   // each row has a unique way of calculating the score
  String name;
  
  Protocol(String player) {
    name = player;
    protocol = new Rule[16];
    protocol[0] = new Ones();
    protocol[1] = new Twos();
    // ...
    protocol[15] = new Yatzy();
  }
}
