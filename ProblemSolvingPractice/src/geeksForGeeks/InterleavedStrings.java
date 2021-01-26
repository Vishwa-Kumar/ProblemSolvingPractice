package geeksForGeeks;

public class InterleavedStrings {
	
	
	public boolean isInterLeave(String a,String b,String c)
	{
            //Your code here
      
		
        if((a.length()+b.length())==c.length())
        {
        	return isInterLeaveRec(a,b,c);
        }
        else
        {
        	return false; 
        }
        
       
	}
	
	public boolean isInterLeaveRec(String a,String b,String c)
	{
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		
		if(a.length()==0 && b.length()==0 && c.length()==0)
		{
			return true;
		}
		if(c.length()==0 && (a.length()!=0 || b.length()!=0))
		{
			return false;
		}
		if(c.length()!=0 && (a.length()==0 && b.length()==0))
		{
			return false;
		}
		boolean first=false;
		boolean second=false;
		
           if(a.length()>0 && a.charAt(0)==c.charAt(0))
           {
        	   first= (isInterLeaveRec( a.substring(1),b, c.substring(1)));
           }
        
            if(b.length()>0 && b.charAt(0)==c.charAt(0))
           {
        	   second= ( isInterLeaveRec( a,b.substring(1), c.substring(1)));
           }
        
      return first||second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="aab";
		String b="axy";
		String c="aaxaby";
		
		System.out.println(new InterleavedStrings().isInterLeave(a,b,c));

	}

}
