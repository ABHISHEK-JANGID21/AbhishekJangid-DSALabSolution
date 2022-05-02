package com.greatlearning.balancedbrackets;

import java.util.Stack;

public class ParenthesesMatching {
	public boolean isMatching(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(ch);
				continue;
			} else if (stack.isEmpty()) {
				return false;
			}

			else {
				char check;
				check = stack.pop();
				if (check == '(') {
					if (ch == '}' || ch == ']')
						return false;
				}
				if (check == '[') {
					if (ch == '}' || ch == ')')
						return false;
				}
				if (check == '{') {
					if (ch == ')' || ch == ']')
						return false;
				}
			}
		}
		return (stack.isEmpty());
	}
}
