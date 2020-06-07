package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChallengeByRajat2 {
	public static void smartSort(String toConvert) {
		String[] thread = toConvert.split("");
		String vowels = "aeiou";
		List<String> vow = new ArrayList<String>();

		List<String> vowe = Arrays.asList(vowels.split(""));
		for (int i = 0; i < thread.length; i++) {
			if (vowe.contains(thread[i])) {
				vow.add(thread[i]);
			}
		}
		for (int k = 0; k < vow.size(); k++) {
			System.out.print("." + vow.get(k));
			
		}
		System.out.println(" ");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input:"+ " ");
		String input = sc.nextLine();
		System.out.print("Output:"+ " ");
		smartSort(input);
		System.out.println("Do you want to check for another word? Answer with Y or N.");
		// String answer=sc.next();
		if (sc.next().equalsIgnoreCase("Y")) {
			main(args);
		} else
			System.out.println("OK, Thank You");
		sc.close();
	}
}
