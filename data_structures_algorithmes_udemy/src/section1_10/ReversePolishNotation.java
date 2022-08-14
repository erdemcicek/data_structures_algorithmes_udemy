package section1_10;

import java.util.Stack;

public class ReversePolishNotation {
	
	public static void main(String[] args) {
		//System.out.println(evalRPM(new String[] {"2","1","+","3","*"}));
		System.out.println(evalRPN(new String[] {"2","1","+","3","*"}));

	}
	
	private static int evalRPM(String[] tokens) {
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0 ; i < tokens.length ; i++) {
			if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
				int v1 = st.pop();
				int v2 = st.pop();
								
				switch(tokens[i]) {
					case "+": st.push(v1+v2);break; 
					case "-": st.push(v1-v2);break; 
					case "*": st.push(v1*v2);break; 
					case "/": st.push(v1/v2);break; 
				}
			} else {
				int p = Integer.parseInt(tokens[i]);
				st.push(p);
			}
		}
		return st.get(0);
	}
	
	private static int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0, x, y;
        
        for(int i = 0; i < tokens.length; ++i) {
             if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                 y = stack.pop();
                 x = stack.pop();
                 switch(tokens[i]) {
                     case "+":
                         res = x + y;
                         break;
                    case "-":
                         res = x - y;
                         break;
                    case "*":
                        res = x * y;
                        break;
                   default:
                        res = x / y;
                        break;
                }
                stack.push(res);
            }
           else{
               stack.push(Integer.parseInt(tokens[i]));
           }
             
        }
        return stack.peek();
    }

}
