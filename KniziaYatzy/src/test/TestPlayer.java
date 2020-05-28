package test;

import program.*;
import java.util.Scanner;
import org.junit.*;

public class TestPlayer {

	@Test
	public void testNameOfPlayer() throws Exception {
		Protocol obj = new Protocol("Priya");
		String name = obj.player_name();
		Assert.assertEquals(name, "Priya");
		System.out.println("Name Tested sucessfully");

	}

	@Test
	public void testNameOfPlayer_shouldReturnFalse() throws Exception {
		Protocol obj = new Protocol("Priya");
		String name = obj.player_name();
		Assert.assertNotEquals(name, "Priyanka");
		System.out.println("Wrong Name Tested sucessfully");

	}

	@Test
	public void numberOfRules() throws Exception {
		Protocol obj = new Protocol("Priya");
		int total_number_of_rules = obj.number_of_rules();
		Assert.assertEquals(17, total_number_of_rules);
		System.out.println("Total number of rules Tested sucessfully");

	}

	@Test
	public void numberOfRules_shouldReturnFalse() throws Exception {
		Protocol obj = new Protocol("Priya");
		int total_number_of_rules = obj.number_of_rules();
		Assert.assertNotEquals(20, total_number_of_rules);
		System.out.println("Wrong Total number of rules Tested sucessfully");

	}

	@Test
	public void Should_Return_True_IfnumberOfPlayers1() throws Exception {
		Scanner input = new Scanner(System.in);
		Protocol[] p = new Protocol[1];
		int total_number_of_players = GameFlowPlayerList.createProtocol(p, input);
		Assert.assertEquals(1, total_number_of_players);
		System.out.println("Total number of players 1 Tested sucessfully");

	}

	@Test
	public void Should_Return_True_IfnumberOfPlayers2() throws Exception {
		Scanner input = new Scanner(System.in);
		Protocol[] p = new Protocol[2];
		int total_number_of_players = GameFlowPlayerList.createProtocol(p, input);
		Assert.assertEquals(2, total_number_of_players);
		System.out.println("Total number of players 2 Tested sucessfully");

	}

	@Test
	public void Should_Return_True_IfnumberOfPlayers3() throws Exception {
		Scanner input = new Scanner(System.in);
		Protocol[] p = new Protocol[3];
		int total_number_of_players = GameFlowPlayerList.createProtocol(p, input);
		Assert.assertEquals(3, total_number_of_players);
		System.out.println("Total number of players 3 Tested sucessfully");

	}

	@Test
	public void Should_Return_True_IfnumberOfPlayers4() throws Exception {
		Scanner input = new Scanner(System.in);
		Protocol[] p = new Protocol[4];
		int total_number_of_players = GameFlowPlayerList.createProtocol(p, input);
		Assert.assertEquals(4, total_number_of_players);
		System.out.println("Total number of players 4 Tested sucessfully");
	}

	@Test
	public void Should_Return_False_IfnumberOfPlayers_moreThanFour() throws Exception {
		Scanner input = new Scanner(System.in);
		int max_no_of_players = 4;
		Protocol[] p = new Protocol[max_no_of_players];
		int total_number_of_players = GameFlowPlayerList.createProtocol(p, input);
		Assert.assertNotEquals(5, total_number_of_players);
		System.out.println("Total number of players more than 4 Tested sucessfully");
	}

}
