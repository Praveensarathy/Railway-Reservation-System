package controller;

import java.util.Scanner;

public class Validation {
	static Scanner sc = new Scanner(System.in);
	public static String getString() {
		return sc.nextLine();
	}
	public static int getInteger() {
		return Integer.parseInt(sc.nextLine());
	}
	
}
