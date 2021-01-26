package geeksForGeeks;

import java.util.Stack;

public class LongestValidParenthese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input=")()())";
		System.out.println(countValidParentheses(input));

	}
	private static int countValidParentheses(String input)
	{
	    
	    Stack<Character> openStack=new Stack<Character>();
	     Stack<Integer> indexStack=new Stack<Integer>();
	    indexStack.add(-1);
	    
	    char[] charArr=input.toCharArray();
	    int i=0;
	    int length=0;
	    int maxLength=0;
	    for(char c:charArr)
	    {
	    	if(c=='(')
	    	{
	    		openStack.add(c);
	    		indexStack.add(i);
	    	}
	    	else if(c==')')
	    	{
	    		if(!openStack.isEmpty()  && openStack.peek()=='(')
	    		{
	    			openStack.pop();
	    			indexStack.pop();
	    			length=i-indexStack.peek();
	    			maxLength=Math.max(maxLength,length);
	    		}
	    		else{
	    		    indexStack.add(i);
	    		}
	    	}
	    	i++;
	    }
	    return maxLength;
	}

}
