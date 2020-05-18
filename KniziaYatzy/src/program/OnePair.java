// Lower Section OnePair Rule (#8) implementation

package program;

class OnePair extends SaveScore implements Rule {

    public String rule_name() {
        return "Ett Par";
    }
    public String rule_description() {
        return "Största summan av ett par med samma tal";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int max_eligible = 0;
        for (int one_dice=0; one_dice<4; ++one_dice) {
            if (dices[one_dice] > max_eligible) {
                for (int another_dice=one_dice+1; another_dice<5; ++another_dice) {
                    if (dices[one_dice] == dices[another_dice]) {
                        max_eligible = dices[one_dice];
                    }
                }
            }
        }
        return max_eligible * 2;
    }
}

