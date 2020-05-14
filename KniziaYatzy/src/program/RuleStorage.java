package program;

public interface RuleStorage { // saves the number exactly once (sv: sparar ett heltal exakt en gång)

  int peek() throws Exception; // shows what's in the score box
                               // (sv: returnerar vilken data var sparad av den här regeln tidigare)

  void store(int result) throws Exception; // saves the result in the score box for later usage
                                           // (sv: resultatet som ska sparas för senare, för att skriva ut protokollet
                                           //  eller att räkna ut bonus)
}
