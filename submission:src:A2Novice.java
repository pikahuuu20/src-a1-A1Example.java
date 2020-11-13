package a2;

import java.util.Scanner;

public class A2Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int I = Integer.parseInt(scan.nextLine());
		int numberVegetarian = 0;
		String highestCllName = "";
		String lowestCllName = "";
		double highestCll = Double.MIN_VALUE;
		double lowestCll = Double.MAX_VALUE;
		for (int t = 0; t < I; t++) {
			String input = scan.nextLine();
			String[] val = input.split("");
			String nameIngredient = val[0];
			double price = Double.parseDouble(val[1]);
			boolean vegetarian = Boolean.parseBoolean(val[2]);
			double cll = Double.parseDouble(val[3]);
			//Now let us check whether it is a vegetarian.
			if (vegetarian) {
				numberVegetarian = numberVegetarian + 1;
			}
			//then, we should calculate the cll.
			double cllPer;
			cllPer = cll / price;
			if (cll > highestCll) {
				highestCllName = nameIngredient;
				highestCll = price;
			} else if (cll < lowestCll) {
				lowestCllName = nameIngredient;
				lowestCll = price;
			}
			// Your code here.
		}
		System.out.println("Number of vegetarian ingredients:" + numberVegetarian);

		System.out.println("Highest cals/$:" + highestCllName);
		System.out.println("Lowest cals/$:" + lowestCllName);
		// You can define helper methods here if needed.

	}
}