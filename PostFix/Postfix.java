package exam;

import java.util.*;

public class ExpressionsEvaluation {


	public static String toPostfix(String exp) {// this method is for changing an expression to postfix

		Stack<Character> s = new Stack<Character>();//stack of characters
		ArrayDeque<Character> dq = new ArrayDeque<Character>();//array of characters
		int level = 0;//priority level of a specific operator
		String string = " ";//the final returned string
		boolean space = false;// space boolean for deciding where to add the space which is after each double 
		if (exp != " ") {//if the exp was empty
			
			for (int i = 0; i < exp.length(); i++) {

				if (exp.charAt(i) != '*' && exp.charAt(i) != '/' && exp.charAt(i) != '+' && exp.charAt(i) != '-'
						&& exp.charAt(i) != ' ') {
					
					if (exp.charAt(i) == '.') {//if the character was . add it to the array

						dq.add(exp.charAt(i));

					} else {
						//if the character was a number add it to the array
						dq.add(exp.charAt(i));
					}
				}

				else {
					if (exp.charAt(i) == ' ') {// if the char was space do nothing

					} else {
						if (s.isEmpty()) {// if the stack wasn't empty 

							if (exp.charAt(i) == '*') {
								level = 2;// make the expression of the level 2
								s.push(exp.charAt(i));//add to the stack

							}

							if (exp.charAt(i) == '/') {
								level = 2;// make the expression of the level 2
								s.push(exp.charAt(i));//add to the stack

							}
							if (exp.charAt(i) == '+') {
								level = 1;// make the expression of the level 1
								s.push(exp.charAt(i));//add to the stack

							}
							if (exp.charAt(i) == '-') {

								level = 1;// make the expression of the level 1
								s.push(exp.charAt(i));//add to the stack

							}

						} else {// if the stack wasn't empty

							if (exp.charAt(i) == '*' && level == 2) {

								s.push('*');// add * to the stack

							}
							if (exp.charAt(i) == '*' && level == 1) {

								s.push('*');// add * to the stack and make the level of priority = 2
								level = 2;

							}
							if (exp.charAt(i) == '/' && level == 2) {

								s.push('/');//add to the stack

							}
							if (exp.charAt(i) == '/' && level == 1) {

								s.push('/');// add * to the stack and make the level of priority = 2
								level = 2;

							}
							if (exp.charAt(i) == '+' && level == 1) {

								s.push('+');// add + to the stack if the priority level was 1 which means / * aren't there

							}
							if (exp.charAt(i) == '+' && level == 2) {

								while (s.peek() == '*' || s.peek() == '/') {// if the stack contained any operator from level 2 add them to the array
									dq.add(s.pop());

								}
								level = 1;// make the stack level = 1

								s.push('+');

							}
							if (exp.charAt(i) == '-' && level == 1) {

								s.push('-');

							}
							if (exp.charAt(i) == '-' && level == 2) {

								while (s.peek() == '*' || s.peek() == '/') {// if the stack contained any operator from level 2 add them to the array
									dq.add(s.pop());

								}

								s.push('-');
								level = 1;

							}

						}

					}

				}

			}
			while (!s.isEmpty()) {// if the stack contained any operator after the operation then add them one by one to the array

				dq.add(s.pop());
			}
			for (char i : dq) {//looping in the arraydeque
                
				if(i == '*' || i=='/' || i=='+' || i== '-') {// if the char contained these then add a space after
					
					string += i;
					string += ' ';
					
				}
				else {
				string += i;

				if (space) {// add a space after the double number
					string += ' ';
					space = false;

				}

				if (i == '.') {// space = true to add a space after the double number

					space = true;
				}
				}

			}
		}
		return string;//the string that contains the postfix

	}

	public static double calculatePost(String exp) {//method for evaluating the fixpost

		Stack<String> stack = new Stack<>();

		String[] newer = exp.split(" ");

		for (int i = 0; i < newer.length; i++) {

			String t = newer[i];

			if (t.equals(" ")) {
				continue;
			}

			if (t.equals("*") || t.equals("/") || t.equals("+") || t.equals("-")) {

				double Number2 = Double.parseDouble(stack.pop());
				double Number1 = Double.parseDouble(stack.pop());

				double sum;

				String a = t;

				if (a.equals("+")) {
					sum = Number1 + Number2;
				} else if (a.equals("*")) {
					sum = Number1 * Number2;
				} else if (a.equals("-")) {
					sum = Number1 - Number2;
				} else {
					sum = Number1 / Number2;
				}

				stack.push(sum + "");

			} else {

				stack.push(t);
			}

		}

		return Double.parseDouble(stack.pop());

	}

}
