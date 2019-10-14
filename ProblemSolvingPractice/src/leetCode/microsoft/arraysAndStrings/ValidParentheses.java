package leetCode.microsoft.arraysAndStrings;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses obj=new ValidParentheses();
		System.out.println(obj.isValid("()"));

	}

	public boolean isValid(String s) {
		if(s==null || s=="")
		{
			return true;
		}
		Stack<Character> stack=new Stack<>();
		
		
		int n=s.length();
		
		for(int i=0;i<n;i++)
		{
			char c=s.charAt(i);
			System.out.println("c"+c);
			if(c=='{' )
			{
				stack.push('}');
			}
			else if(c=='[')
			{
				stack.push(']');
			}
			else if (c=='(')
			{
				stack.push(')');
			}
			else 
			{
				System.out.println(stack.size());
				if (stack.isEmpty() || stack.pop()!=c) {
					return false;
				}
				
			}
		}
		
		return stack.isEmpty();
	}

}
