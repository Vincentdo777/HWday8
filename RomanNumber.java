package HomeWork8;

import java.util.ArrayList;
import java.util.Arrays;

public class RomanNumber {
	public static void main(String[] args) {
		converNumtoRoman(8);
	}

	public static void converNumtoRoman(int num) {
		String[] romanLetters = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		int[] numberRange = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
		ArrayList<String> romanNumberArray = new ArrayList<>();
		

		for (int i = numberRange.length - 1; i >= 0 ; i--) {
			while (num >= numberRange[i]) {
				romanNumberArray.add(romanLetters[i]);
					num = num - numberRange[i];
			}
		}
		System.out.println(String.join("", romanNumberArray)); ;
	}
}
