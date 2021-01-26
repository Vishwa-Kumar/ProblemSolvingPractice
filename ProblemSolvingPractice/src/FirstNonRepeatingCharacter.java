import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=firstNotRepeatingCharacter("abacabad");
		System.out.println("ch "+ c);
	}
	
	static char firstNotRepeatingCharacter(String s) {
		HashMap<Character,Integer> hm=new HashMap<>();

		char[] ch=s.toCharArray();

		char firstCh='_';
		    for(Character c:ch)
		    {
		        if(hm.containsKey(c))
		        {
		            hm.put(c,hm.get(c)+1);
		        }
		        else{
		            hm.put(c,1);
		           
		        }
		    }
		   
		     for(Character c:ch)
		    {
		        
		           if( (hm.get(c)==1))
		           {
		        	   System.out.println(hm.get(c)==1);
		               return c;
		           }
		        
		    }
		     System.out.println(hm);
		    return firstCh;
		    
		}


}
