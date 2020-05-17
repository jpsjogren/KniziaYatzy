package program;

import java.util.Scanner;

public class Play {

    private static void visualize_score(Rule r, int score) {
        System.out.println(" ----------- " + r.rule_name() + " => " + score);
    }

    public static void play(String player) throws Exception {
        Protocol p = new Protocol(player);
        Scanner input = new Scanner(System.in);

// this implements "strict" ("tvång") play rules:
        for(Rule r=p.first_rule(); r != null; r=p.next_rule(r)) {
            int score;
            System.out.print("===================== Nu blir det "+r.rule_name()+": ");
            input.nextLine();
            if (r.cast_is_needed()) {
                DiceCasting dices = new DiceCasting();
                do {
                    dices.cast();
                    dices.show();
                    score = r.calculate(p, dices.data());
                    visualize_score(r, score);
                    dices.pick_hold(input); // this has to implement the dialogue
                } while (dices.wants_more());
            } else {
                score = r.calculate(p, null);
                visualize_score(r, score);
            }
            // store the score into the protocol
            r.store(score);
        }
        int final_score = 0;
// we need our knowledge of the index of the Sum rule's result,
// to skip or alternatively use it while calculating the final score,
// which creates some inconvenience,
// but we still want to have that slot in the protocol,
// to easily make the possible printout (below)
        int i = 0;
        for (Rule r=p.first_rule(); r != null; r=p.next_rule(r)) {
            if (++i != 7) { // the Sum's index
                final_score += r.peek();
            }
        }
        System.out.println("Slutpoäng: "+final_score);

// here we might want to produce a nice printout
// of the whole protocol

    }
}
