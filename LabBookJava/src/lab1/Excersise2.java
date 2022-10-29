package lab1;

/*
Exercise 2: Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
 */

import java.util.*;

public class Excersise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Light red, yellow or green");
		String input = sc.next();
		//switch statement to check the condition
		switch (input) {
		case "red":
			System.out.println("Stop!!");
			break;
		case "yellow":
			System.out.println("Be Ready!!");
			System.out.println("Take a deep breath foot on clutch, accelarate !");
			break;
		case "green":
			System.out.println("Go go go go ...");
			System.out.println("power rangers SPD");
			break;
		default:
			System.out.println(
					"Conrats!! your Driving licence is being cancelled on account of not knowing signal lights");
			break;
		}
		sc.close();
	}

}