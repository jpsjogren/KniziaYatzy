package program;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class DiceCasting {

    private int dices[] = new int[5];
    private boolean on_hold[] = { false, false, false, false, false };
    private int castnr = 0;
// -------------------------------------------
    private void flip(int value) {
        for (int i=0; i<dices.length; ++i) {
            if (dices[i] == value) {
                on_hold[i] = !on_hold[i];
            }
        }
    }
// -------------------------------------------
    public boolean wants_more() {
        return castnr < 3;
    }
    public void cast() {
        for (int i=0; i<dices.length; ++i) {
            if (on_hold[i]) {
                continue;
            }
            dices[i] = ThreadLocalRandom.current().nextInt(6) + 1;
        }
        ++castnr;
    }
    public int[] data() {
        return dices;
    }
// NOTE no line break at the end, this is intentional!
    public void show() {
        int i;
        for (i=0; i<dices.length-1; ++i) {
            System.out.print(dices[i] + " ");
        }
        System.out.print(dices[i]); // here println() could be
    }
    public void pick_hold(Scanner input) {
        if (!wants_more()) {
            return;
        }
//        boolean tell = true;
        do {
            int i;
            for (i=0; i<dices.length-1; ++i) {
                if (on_hold[i]) {
                    System.out.print("H ");
                } else {
                    System.out.print("- ");
                }
            }
            if (on_hold[i]) {
                System.out.println("H");
            } else {
                System.out.println("-");
            }
//            if (tell) {
                System.out.print("a b c d e eller 1-6: låsa/släppa, 0: acceptera, bara Enter: kasta om ");
//                System.out.print("a b c d e  ");
//                tell = false;
//            }
            String answer = input.nextLine();
            if (answer.equals("0")) {
                castnr = 3;
                return;
            } else if (answer.equals("a")) {
                on_hold[0] = !on_hold[0];
            } else if (answer.equals("b")) {
                on_hold[1] = !on_hold[1];
            } else if (answer.equals("c")) {
                on_hold[2] = !on_hold[2];
            } else if (answer.equals("d")) {
                on_hold[3] = !on_hold[3];
            } else if (answer.equals("e")) {
                on_hold[4] = !on_hold[4];
            } else if (answer.equals("1")) {
                flip(1);
            } else if (answer.equals("2")) {
                flip(2);
            } else if (answer.equals("3")) {
                flip(3);
            } else if (answer.equals("4")) {
                flip(4);
            } else if (answer.equals("5")) {
                flip(5);
            } else if (answer.equals("6")) {
                flip(6);
            } else if (answer.equals("")) {
                return;
            } else {
                System.out.println("använd a-e, 1-6, 0 eller Enter");
//                tell = true;
            }
        } while (true);
    }
}
