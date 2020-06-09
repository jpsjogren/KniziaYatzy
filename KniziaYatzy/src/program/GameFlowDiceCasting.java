package program;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class GameFlowDiceCasting {

    private int dices[] = new int[6];
    private boolean on_hold[] = { false, false, false, false, false, false };
    private int castnr = 0;
    private boolean is_abandoned = false;
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
    public boolean abandoned() {
        return is_abandoned;
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
        System.out.print("I omgång nr " +castnr +" har du fått:  ");
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
        int[] menu_choices = GenericMenu.menu(6, new int[] {},
"hålla tärning med "+dices[0],
"hålla tärning med "+dices[1],
"hålla tärning med "+dices[2],
"hålla tärning med "+dices[3],
"hålla tärning med "+dices[4],
"hålla tärning med "+dices[5],
"acceptera utfallet utan att kasta om",
"--- återgå till huvudmenyn");
        for (int i=0; i<on_hold.length; ++i) {
            on_hold[i] = false;
        }
// check whether the player indicated "acceptera" or "återgå"
// somewhere in the answer, even if the corresponding choice was
// not first in the multiple-choice answer string, like "bcfg" :
        for (int i=0; i<menu_choices.length; ++i) {
            if (menu_choices[i] == 8) {
                is_abandoned = true;
                return false;
            }
            if (menu_choices[i] == 7) {
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
