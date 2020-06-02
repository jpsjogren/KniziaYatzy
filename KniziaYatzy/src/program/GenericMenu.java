package program;

// implements simplistic terminal menus for 1 to 25 items,
// optionally with multiple choice and a default choice
//
//int menu(String... items)
//returns the choice (numbered from 1)
//or 1 if the "default" alternative is chosen
//
//int menu(int default_choice, String... items)
//returns the choice (numbered from 1)
//or the default choice value if the "default" alternative is chosen
//
//int[] menu(int max_choices, int[] default_choice, String... items)
//returns an int array of size up to max_choices and in its elements the choices (numbered from 1)
//or the default choice array if the "default" alternative is chosen
//

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;

public class GenericMenu {
    private static Scanner scanner;
    // -------------------------------------------------------------- //
    public static int[] menu(int max_number_of_choices, int[] default_choice, String... entry) {
	int[] res;
	do {
	    visualise(max_number_of_choices, default_choice, entry);
	    res = choose(entry.length, default_choice, max_number_of_choices);
	} while (res == null);
	return res;
    }
    // -------------------------------------------------------------- //
    public static int menu(int default_choice, String... entry) {
	int dc[] = new int[1];
	dc[0] = default_choice;
	int[] res = menu(1, dc, entry); // single choice
	return res[0];
    }
    // -------------------------------------------------------------- //
    public static int menu(String... entry) {
	return menu(1, entry); // default will be the first entry
    }

    // radix 36 is for 0-9 then a-z
    // .............................................................. //
    private static void visualise(int maxchoices, int[] default_choice, String... entry) {
	int i = 0;
	for (String s : entry) {
	    ++i;
	    System.out.println("("+Integer.toString(i+9,36)+") "+s);
	}
	if (entry.length > 1) {
	    System.out.print("Ange a-"+Integer.toString(i+9,36));
	} else {
	    System.out.print("Ange a");
	}
	if (default_choice != null && default_choice.length !=0) {
	    System.out.print(", bara Enter för (");
	    for (int ii=0; ii<default_choice.length; ++ii) {
		System.out.print(Integer.toString((default_choice[ii]+9),36));
	    }
	    System.out.print(")");
	}
	if (maxchoices > 1) {
	    System.out.print(", upp till "+maxchoices+" val utan mellanslag");
	}
	System.out.println();
    }
    // .............................................................. //
    private static int[] choose(int menulength, int d[], int m) {
	scanner = new Scanner(System.in);
	String s = scanner.nextLine();
	TreeSet<Integer> ss = new TreeSet<Integer>();
	int i;
	for (i=0; i<s.length(); ++i) {
	    int onechoice;
	    try {
		onechoice = Integer.parseInt(s.substring(i, i+1), 36) - 9;
	    } catch (NumberFormatException e) {
		onechoice = -1;
	    }
	    if (onechoice == -9) {
		return new int[] {};
	    }
	    if (onechoice < 0 || onechoice > menulength) {
		System.out.println("Ett opassande tecken: '"+s.substring(i, i+1)+"'");
		return null;
	    }
	    ss.add(onechoice);
	    if (ss.size() > m) {
		System.out.println("För många samtidiga val, du får pröva igen");
		return null;
	    }
	}
	if (i == 0) {
	    return d;
	}
	int[] r = new int[ss.size()];
	i = 0;
	for (Integer ii : ss) {
	    r[i++] = ii;
	}
	return r;
    }
}