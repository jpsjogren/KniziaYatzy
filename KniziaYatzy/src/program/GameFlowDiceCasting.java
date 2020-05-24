package program;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class GameFlowDiceCasting {

    private int dices[] = new int[5];
    private boolean on_hold[] = { false, false, false, false, false };
    private int castnr = 0;
    // -------------------------------------------------------------- //
    public void cast() {
	for (int i=0; i<dices.length; ++i) {
	    if (on_hold[i]) {
		continue;
	    }
	    dices[i] = ThreadLocalRandom.current().nextInt(6) + 1;
	}
	++castnr;
    }
    // -------------------------------------------------------------- //
    public int[] data() {
	return dices;
    }
    // -------------------------------------------------------------- //
    public void show() {
	int i;
	for (i=0; i<dices.length-1; ++i) {
	    System.out.print(dices[i] + " ");
	}
	System.out.println(dices[i]);
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
    }
    // -------------------------------------------------------------- //
    public boolean pick_hold(Scanner input) {
	if (castnr == 3) {
	    return false;
	}
	int[] menu_choices = GameFlowMenu.menu(5, new int[] {},
		"hålla tärning med "+dices[0],
		"hålla tärning med "+dices[1],
		"hålla tärning med "+dices[2],
		"hålla tärning med "+dices[3],
		"hålla tärning med "+dices[4],
		"acceptera läget");
	// check whether the player indicated "acceptera" somewhere
	// in the answer, even if the corresponding choice was not
	// first in the multiple-choice answer string, like "236" :
	for (int i=0; i<menu_choices.length; ++i) {
	    if (menu_choices[i] == 6) {
		return false;
	    }
	    // it is safe to do flipping in the same common loop:
	    //        }
	    //        for (int i=0; i<menu_choices.length; ++i) {
	    on_hold[menu_choices[i]-1] = !on_hold[menu_choices[i]-1];
	}
	return true;
    }
}
