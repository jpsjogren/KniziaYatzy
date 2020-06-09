package program;

public class FiveOfAKind extends SaveScore implements Rule {

    public String rule_name() {
        return "Femtal";
    }
    public String rule_description() {
        return "Summan av fem tärningar med samma tal";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate_straightforward(Protocol protocol, int[] dices) {
        for (int one_dice=0; one_dice<6; ++one_dice) {
            for (int another_dice=one_dice+1; another_dice<6; ++another_dice) {
                if (dices[one_dice] == dices[another_dice]) {
                    for (int third_dice=another_dice+1; third_dice<6; ++third_dice) {
                        if (dices[one_dice] == dices[third_dice]) {
                            return dices[one_dice] * 5;
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
        for (int dice=0; dice<6; ++dice) {
            ++hits[dices[dice]];
        }
        for (int i=1; i<7; ++i) {
            if (hits[i] >= 5) {
                return i * 5;
            }
        }
        return 0;
    }
}    
