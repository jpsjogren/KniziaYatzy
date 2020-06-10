package program;

public class Tower extends SaveScore implements Rule {

    public String rule_name() {
        return "Torn";
    }
    public String rule_description() {
        return "Fyra likadana med ett tal och två likadana med ett annat tal";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int hits[] = { 0, 0, 0, 0, 0, 0, 0 };
        int foursome = 0, couple = 0;
        for (int dice=0; dice<6; ++dice) {
            ++hits[dices[dice]];
        }
        for (int i=1; i<7; ++i) {
            if (hits[i] == 4) {
                foursome = i;
                break;
            }
        }
        if (foursome == 0) {
            return 0;
        }
        for (int i=1; i<7; ++i) {
            if (hits[i] == 2) {
                couple = i;
                break;
            }
        }
        if (couple == 0) {
            return 0;
        }
        return couple*2 + foursome*4;
    }
}