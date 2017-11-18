package fireCode;
import java.util.ArrayList;

public class RecoveringIP {

	static ArrayList<String> listOfIp=new ArrayList<>();
	private static void printList(ArrayList<String> ipList)
	{
		for(int i=0;i<ipList.size();i++)
		{
			String a=ipList.get(i).substring(1);
			System.out.println(a);
		}
	}
	public static ArrayList<String> generateIPAddrs(String s) {
		generateIPAddrsUtil("",s);
		printList(listOfIp);
		return null;
	}
	
	
	
   public static void generateIPAddrsUtil(String ipTillNow,String restStr)
   {
	    String unitsOfIp[]=ipTillNow.split("\\.");
		if(restStr.length()==0)
		{
			
			System.out.println("unitsOfIp.size"+unitsOfIp.length+" "+ipTillNow);
			if(unitsOfIp.length==5)
			{
				String a=ipTillNow.substring(1);
				
				listOfIp.add(a)	;	
			}
			 if(unitsOfIp.length>4)
			   {
				   return;
			   }
			
			return;
		}
		int restStrLength=restStr.length();
		int loopCounter=restStrLength>3?3:restStrLength;
		for(int i=1;i<=loopCounter;i++)
		{
			if(Integer.parseInt(restStr.substring(0,i))>=0 &&  Integer.parseInt(restStr.substring(0,i))<256)
			{
				generateIPAddrsUtil(ipTillNow+"."+restStr.substring(0,i),restStr.substring(i));
			}
			
		}
	}
	
	public static void main(String[] args) {
		String a="25525511135";
		generateIPAddrs(a);
	
	}

}
