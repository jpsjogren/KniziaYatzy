package program;

import highscore.*;

public class Main {
	static Menu menu = new Menu();
	public static void main(String[] args) throws Exception {
		System.out.println("Välkommen till Yatzy!");
		System.out.println("=====================");
		//HighScore.showTopTenResults();
		menu.startMenu();
	}
}
