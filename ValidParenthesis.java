import java.util.Stack;

public class ValidParenthesis {
    public  boolean isValid( String s){
          Stack<Character> stack=new Stack<>();
          for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{') 
             {
                stack.push(c);
             }
          else{
            if(stack.isEmpty()){
                return false;
            }
            char top= stack.pop();
            if ((c == ')' && top != '(') || 
            (c == ']' && top != '[') || 
            (c == '}' && top != '{')){
                return false;
            }
          }
         
    } return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis sc=new ValidParenthesis();
        String test="(){}";
        String test2="[)";
        System.out.println(" "+sc.isValid(test));
        System.out.println(" "+sc.isValid(test2));
    }
}



