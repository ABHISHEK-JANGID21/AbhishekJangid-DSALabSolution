package com.greatlearning.balancedbrackets;

import java.util.Scanner;

public class DriverClassOfParenthesesMatching {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		ParenthesesMatching p = new ParenthesesMatching();
		boolean result;
		result = p.isMatching(s);
		if (result == false) {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		} else if (result == true) {
			System.out.println("The entered Strings contain Balanced Brackets");
		}
	}

}
