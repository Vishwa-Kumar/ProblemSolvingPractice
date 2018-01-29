package fireCode;

public class LongestPalindromicSubstring {
	
	
	
	public static void main(String[] args) {

		String str="forgeeksskeegfor";
		System.out.println(new LongestPalindromicSubstring().longestPalSubstr(str));

	}

	
	public String longestPalSubstr(String str){
		
	    int strSize=str.length();
	    if(strSize==0 || strSize==1)
	    {
	    	return str;
	    }
	    
	    
	    boolean sol[][]=new boolean[strSize][strSize];
	    int startIndex=0;
	    int maxLengthOfPalSubStr=0;
	    
	    // for single length string
	    maxLengthOfPalSubStr=1;
	    for(int i=0;i<strSize;i++)
	    {
	    	 sol[i][i]=true;
	 	   
	    }
	    
	    //for length 2
	    startIndex=0;
	    for(int i=0;i<strSize-1;i++)
	    {
	    	if(str.charAt(i)==str.charAt(i+1))
	    	{
	    		sol[i][i+1]=true;
	    		startIndex=i;
	    		maxLengthOfPalSubStr=2;
	    	}
	    	else
	    	{
	    		sol[i][i+1]=false;
	    	}
	    }
	    
	    //for length more than 2
	    
	    for(int k=3;k<=strSize;k++)
	    {
            // Fix the starting index
		      for (int i = 0; i < strSize - k + 1; i++) 
		      {
		    	  // Get the ending index of substring from
	                // starting index i and length k
	                int j = i + k - 1;
	                if(sol[i+1][j-1]==true  && str.charAt(i)==str.charAt(j))
	                {
	                	sol[i][j]=true;
	                	
	                	if(k>maxLengthOfPalSubStr)
	                	{
	                		maxLengthOfPalSubStr=k;
	                		startIndex=i;
	                	}
	                }
		      }
	    }
		return str.substring(startIndex,startIndex+maxLengthOfPalSubStr);
	}

}
