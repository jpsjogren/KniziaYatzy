package program;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;

public class GameFlowMenu {
// -------------------------------------------------------------- //
  public static int[] menu(int max_number_of_choices, int default_choice, String... entry) {
    int[] res;
    do {
      visualise(max_number_of_choices, default_choice, entry);
      res = choose(entry.length, default_choice, max_number_of_choices);
    } while (res == null);
    return res;
  }
// -------------------------------------------------------------- //
  public static int[] menu(int default_choice, String... entry) {
    return menu(1, default_choice, entry);
  }
// -------------------------------------------------------------- //
  public static int[] menu(String... entry) {
    return menu(1, 1, entry);
  }

// 36 is for 0-9 then a-z
// .............................................................. //
  private static void visualise(int maxchoices, int default_choice, String... entry) {
    int i = 0;
    for (String s : entry) {
      ++i;
      System.out.println("("+Integer.toString(i,36)+") "+s);
    }
    if (entry.length > 1) {
        System.out.print("Ange 1-"+Integer.toString(i,36));
    } else {
        System.out.print("Ange 1");
    }
    if (default_choice != 0) {
      System.out.print(", bara Enter för '"+Integer.toString(default_choice,36)+"'");
    }
    if (maxchoices > 1) {
      System.out.print(", upp till "+maxchoices+" val utan mellanslag");
    }
    if (default_choice != 0) {
      System.out.println(", eller 0 för inget val");
    } else {
      System.out.println(", eller bara Enter för inget val");
    }
  }
// .............................................................. //
  private static int[] choose(int l, int d, int m) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    TreeSet<Integer> ss = new TreeSet<Integer>();
    int i;
    for (i=0; i<s.length(); ++i) {
      int onechoice;
      try {
        onechoice = Integer.parseInt(s.substring(i, i+1), 36);
      } catch (NumberFormatException e) {
        onechoice = -1;
      }
      if (onechoice == 0) {
        return new int[] {};
      }
      if (onechoice < 0 || onechoice > l) {
        System.out.println("Ett opassande tecken: '"+s.substring(i, i+1)+"'");
        return null;
      }
      ss.add(onechoice);
      if (ss.size() > m) {
        System.out.println("För många samtidiga val, du får pröva igen");
        return null;
      }
    }
    if (i == 0 && d != 0) {
      ss.add(d);
    }
    int[] r = new int[ss.size()];
    i = 0;
    for (Integer ii : ss) {
      r[i++] = ii;
    }
    return r;
  }
}
