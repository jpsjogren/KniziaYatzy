// Lower Section ThreeOfAKind Rule (#10) implementation

package program;

public class ThreeOfAKind extends SaveScore implements Rule {

    public String rule_name() {
        return "Tre lika";
    }
    public String rule_description() {
        return "Summan av tre tärningar med samma tal";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate_straightforward(Protocol protocol, int[] dices) {
        for (int one_dice=0; one_dice<3; ++one_dice) {
            for (int another_dice=one_dice+1; another_dice<4; ++another_dice) {
                if (dices[one_dice] == dices[another_dice]) {
                    for (int third_dice=another_dice+1; third_dice<5; ++third_dice) {
                        if (dices[one_dice] == dices[third_dice]) {
                            return dices[one_dice] * 3;
                        }
                    }
                }
            }
        }
        return 0;
    }

// alternativt
    public int calculate(Protocol protocol, int[] dices) {
        int hits[] = { 0, 0, 0, 0, 0, 0, 0 };
        for (int dice=0; dice<5; ++dice) {
            ++hits[dices[dice]];
        }
        for (int i=1; i<7; ++i) {
            if (hits[i] >= 3) {
                return i * 3;
            }
        }
        return 0;
    }
}

