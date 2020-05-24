package program;

import java.util.Arrays;

public class GameFlowRelevantRules {
// -------------------------------------------------------------- //
    public String[] rule_names;
// -------------------------------------------------------------- //
    public Rule[] rules;
// -------------------------------------------------------------- //
    GameFlowRelevantRules(Protocol pp) {
        String[] acceptable_rule_names = new String[15];
        Rule[] acceptable_rules = new Rule[15];
        int rule_index = 0;
        for (Rule rule=pp.first_rule(); rule != null; rule=pp.next_rule(rule)) {
            if (!rule.cast_is_needed()) { // Sum and Bonus shall be skipped here
                continue;
            }
            if (rule.empty()) {
                acceptable_rule_names[rule_index] = rule.rule_name();
                acceptable_rules[rule_index++] = rule;
            }
        }
        rule_names = Arrays.copyOf(acceptable_rule_names, rule_index);
        rules = Arrays.copyOf(acceptable_rules, rule_index);
    }
}