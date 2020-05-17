// Lower Section FullHouse Rule (#14) implementation

package program;

class FullHouse extends SaveScore implements Rule {

    public String rule_name() {
        return "Kåk";
    }
    public String rule_description() {
        return "Tre likadana med ett tal och två likadana med ett annat tal";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int hits[] = { 0, 0, 0, 0, 0, 0, 0 };
        int threesome = 0, couple = 0;
        for (int dice=0; dice<5; ++dice) {
            ++hits[dices[dice]];
        }
        for (int i=1; i<7; ++i) {
            if (hits[i] == 3) {
                threesome = i;
                break;
            }
        }
        if (threesome == 0) {
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
        return couple*2 + threesome*3;
    }
}

