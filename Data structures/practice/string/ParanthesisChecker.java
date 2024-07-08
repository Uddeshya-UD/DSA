package practice.string;

import java.util.Stack;

public class ParanthesisChecker {

    static boolean ispar(String x){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < x.length() ; i++) {
            if (x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '[') {
                 stack.push(x.charAt(i));
            } else if (x.charAt(i) == ')' || x.charAt(i) == '}' || x.charAt(i) == ']')  { 
                if(stack.isEmpty()){
                    return false;
                }      
                char top = stack.pop();
                if((x.charAt(i)==')' && top!='(') || (x.charAt(i)=='}' && top!='{') || (x.charAt(i)==']' && top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ispar(args[0]));
    }

}
