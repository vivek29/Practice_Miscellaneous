package cloudera;

import java.util.Stack;

public class Task2 {

	public int solution(String S) {
		// write your code in Java SE 8
		try{
			Stack<Integer> stack = new Stack<Integer>();
			int num1, num2;
			for(int i=0;i<S.length();i++){
				char ch = S.charAt(i);
				if(ch == ' '){}
				else{
					if(ch >'0' && ch < '9'){
						stack.push(Character.getNumericValue(ch));
					}
					else{
						num1 = stack.pop();
						num2 = stack.pop();
						switch(ch){
						case '+':
							stack.push(num1+num2);
							break;
						case '*':
							stack.push(num1*num2);
							break;
						default:
							return -1;        // if input ch has other than '+' or '*', return error
						}
					}
				}
			}
			return stack.pop();
		}	
		catch (Exception e){
			return -1;
		}
	}
}
