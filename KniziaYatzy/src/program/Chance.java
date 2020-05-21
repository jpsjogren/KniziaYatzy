// Lower Section Chance Rule (#15) implementation

package program;

public class Chance extends SaveScore implements Rule {

    public String rule_name() {
        return "Chans";
    }
    public String rule_description() {
        return "Summan av alla tärningar";
    }

    public boolean cast_is_needed() {
        return true;
    }

    public int calculate(Protocol protocol, int[] dices) {
        int sum = 0;
        for (int dice=0; dice<5; ++dice) {
            sum += dices[dice];
        }
        return sum;
    }
}

