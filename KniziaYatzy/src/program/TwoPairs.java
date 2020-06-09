// Lower Section TwoPairs Rule (#9) implementation

package program;

public class TwoPairs extends SaveScore implements Rule {

    public String rule_name() {
        return "Två Par";
    }
    public String rule_description() {
        return "Summan av två par med identiska utslag inom varje par";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
// here we do not have to check for max value,
// because at best we only can find two pairs among the 5 dices
//
// find a pair, then look for another one,
// ignoring the dices consumed in the first round
        int eligible1 = 0;
        int first_pair2 = 0; // initalization only to make the compiler happy
        int one_dice;
        for (one_dice=0; one_dice<6 && eligible1==0; ++one_dice) {
            for (int another_dice=one_dice+1; another_dice<6; ++another_dice) {
                if (dices[one_dice] == dices[another_dice]) {
                    eligible1 = dices[one_dice];
                    first_pair2 = another_dice;
                    break;
                }
            }
        }
        for (; one_dice<6; ++one_dice) {
            if (one_dice == first_pair2 ||
                dices[one_dice] == eligible1) {
                continue;
            }
            for (int another_dice=one_dice+1; another_dice<6; ++another_dice) {
                if (another_dice == first_pair2 ) {
                    continue;
                }
                if (dices[one_dice] == dices[another_dice]) {
                    return (eligible1 + dices[one_dice]) * 2;
                }
            }
        }
        return 0;
    }
}

