package lab8;
import queues.*;
import stacks.*;
public class Tester {

	/**
	 * Check if str is balanced
	 * Example for balanced strings: "", "{}", "{() []}", "{([()[]])}" etc.
	 * Example for unbalanced strings: "(", "]" , "[)", "{()[]", etc. 
	 * Use a stack
	 */
	public static boolean balancedParentheses(String str) {
		String leftP = "{[(";
		String rightP = "}])";
		
		AStack<String> stackL = new AStack<>(str.length());
		AStack<String> stackR = new AStack<>(str.length());

		for(int i = 0; i < str.length(); i++) {

			if (leftP.indexOf(str.substring(i, i + 1)) != -1) {
				stackL.push(str.substring(i, i + 1));
			}
			
			else if (rightP.indexOf(str.substring(i, i + 1)) != -1) {
				try {
					if (leftP.indexOf(stackL.topValue()) == rightP.indexOf(str.substring(i, i + 1))) {
						stackL.pop();
					}
					else {
						stackR.push(str.substring(i, i + 1));
					}
				}
				catch (Exception NullPointerException) {
					return false;
				}
				
			}

			
		}
		
		
		return (stackL.length() == 0) && (stackR.length() == 0);
	}
	
	public static void maxInQueue(QueueADT<Integer> Q) {
		
	}
	
	public static void main(String[] args) {
		System.out.println(balancedParentheses("[]{}[{}]"));
		System.out.println(balancedParentheses("{}]"));
	}

}
