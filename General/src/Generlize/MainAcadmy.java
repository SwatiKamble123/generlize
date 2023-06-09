package Generlize;

import java.util.*;

public class MainAcadmy {

	public static void main(String[] args) {
		while (true) {
			System.out
					.println("Please Choose Sport According To Your Intrest \n 1.\t Cricket 2.\t Hocket 3.\t Football");
			call();
		}
	}

	private static void call() {
		Scanner sc = new Scanner(System.in);
		int intrest = sc.nextInt();
		Acadmy a = new Acadmy();
		Sport obj = a.game(intrest);
		if (obj instanceof Football) {
			System.out.print("Selected Football");
		} else if (obj instanceof Hockey) {
			System.out.print("Selected Hockey");
		} else if (obj instanceof Cricket) {
			System.out.print("Selected Cricket");
		} else {
			System.out.print("Choose Another Game");

		}

	}
}
