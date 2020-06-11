// Lower Section ThreePairs

package program;

public class ThreePairs extends SaveScore implements Rule {

    public String rule_name() {
        return "Tre par";
    }
    public String rule_description() {
        return "Tre par, paren måste vara olika";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
	int result = 0;
        int hits[] = { -999, 0, 0, 0, 0, 0, 0 };
        for (int dice=0; dice<6; ++dice) {
            ++hits[dices[dice]];
        }
// nu innehåller hits[1] till hits[6] respektive antal gånger
// då någon tärning visat respektive siffra (1 till 6)
        int hits_hits[] = { 0, 0, 0, 0, 0, 0, 0 };
        for (int hit=1; hit<=6; ++hit) {
            ++hits_hits[hits[hit]];
        }
// nu innehåller hits_hits[0] till hits_hits[6] respektive antal gånger
// då _någon_ siffra visades respektive antal gånger (0 till 6)
        if (hits_hits[2] != 3) { // exakt tre utav olika siffror som visades 2 gånger var?
            return 0; // nej - då är det inte "tre par"
        }
// nu vet vi att regeln gav ett utfall, dags att räkna
        for (int i=1; i<=6; ++i) {
            if (hits[i] == 2) {
                result += i*2;
            }
        }
        return result;
    }
}