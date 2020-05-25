package program;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class GameFlowDiceCasting {

    private int dices[] = new int[5];
    private boolean on_hold[] = { false, false, false, false, false };
    private int castnr = 0;
// -------------------------------------------------------------- //
    public GameFlowDiceCasting(Scanner input) {
// ---------- MARKERA ALLA TÄRNINGAR SOM FRIA
        do {
// ---------- GENERERA SLUPMÄSSIGT INNEHÅLL 1 till 6 FÖR ALLA FRIA TÄRNINGAR
              cast();
// ---------- VISA TÄRNINGARNAS INNEHÅLL
              show();
// ---------- VISA MENY FÖR ATT MARKERA OM VILKA TÄRNINGAR SKA HÅLLAS alt. ACCEPTERA LÄGET
// ---------- ÄR OMGÅNGEN MINDRE ÄN TRE OCH LÄGET INTE ACCEPTERAT?
        } while (pick_hold(input)); // this has to implement the dialogue
    }
// -------------------------------------------------------------- //
    public int[] data() {
        return dices;
    }
// .............................................................. //
    private void cast() {
        for (int i=0; i<dices.length; ++i) {
            if (on_hold[i]) {
                continue;
            }
            dices[i] = ThreadLocalRandom.current().nextInt(6) + 1;
        }
        ++castnr;
    }
// .............................................................. //
    private void show() {
        int i;
        for (i=0; i<dices.length-1; ++i) {
            System.out.print(dices[i] + " ");
        }
        System.out.println(dices[i]);
    }
// .............................................................. //
    private boolean pick_hold(Scanner input) {
        if (castnr == 3) {
            return false;
        }
        int[] menu_choices = GameFlowMenu.menu(5, new int[] {},
"hålla tärning med "+dices[0],
"hålla tärning med "+dices[1],
"hålla tärning med "+dices[2],
"hålla tärning med "+dices[3],
"hålla tärning med "+dices[4],
"acceptera utfallet utan att kasta om");
        for (int i=0; i<on_hold.length; ++i) {
            on_hold[i] = false;
        }
// check whether the player indicated "acceptera" somewhere
// in the answer, even if the corresponding choice was not
// first in the multiple-choice answer string, like "236" :
        for (int i=0; i<menu_choices.length; ++i) {
            if (menu_choices[i] == 6) {
                return false;
            }
// it is safe to do this in the same common loop:
//        }
//        for (int i=0; i<menu_choices.length; ++i) {
            on_hold[menu_choices[i]-1] = true;
        }
        return true;
    }
}
