package interviewBit;

public class MaximalString {

	public String maxString=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="97599";
		MaximalString obj=new MaximalString();
	//	System.out.println(obj.swap(s, 0, 2));
		obj.solve(s,2);

		System.out.println("sol "+obj.maxString);
		//System.out.println(Integer.parseInt("7114254313"));
		//-2147483648 to 2147483647
	}
	
    public String solve(String A, int B) {
    	maxString=A;
        solveUtil(A,B);
      
        return maxString;
        
    }
    
     public  void solveUtil(String A, int B) {
        
        // null check
        if (B==0)
        {
            return;
        }
       
        for(int i=0;i<A.length();i++)
        {
             for(int j=i+1;j<A.length();j++)
            {
            	
                String tempString=swap(A,i,j);
                System.out.println("tempString"+tempString);
                
                long temp=Long.parseLong(tempString);
                long maxStringValue=Long.parseLong(maxString);
                
                if(temp>maxStringValue)
                {
                	System.out.println("tempString "+tempString+" maxStringValue "+maxStringValue);
                    maxString=tempString;
                	System.out.println("maxString "+maxString);
                    solveUtil(tempString,B-1);
                }
               
            }
        }
        
    }
    
    public String swap(String str,int i,int j)
    {
        char ch[] = str.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        return new String(ch);
    }

}
