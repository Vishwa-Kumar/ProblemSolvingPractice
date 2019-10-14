package companyCodingRound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class EmployeeWithLesserThanKBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> input=new ArrayList<List<Integer>>();
		
		
		 List<Integer> inner=new ArrayList<Integer>();
		 inner.add(1);
		 inner.add(1481122000);
		 inner.add(1481122020);
		 input.add(inner);
		 
		 List<Integer> i2=new ArrayList<Integer>();
		 i2.add(3);
		 i2.add(1481122000);
		 i2.add(1481122020);
		 input.add(i2);
		 
		 
		 List<Integer> i3=new ArrayList<Integer>();
		 i3.add(1);
		 i3.add(1481122020);
		 i3.add(1481122040);
		 input.add(i3);
		 
		 
		 List<Integer> i4=new ArrayList<Integer>();
		 i4.add(2);
		 i4.add(1481122020);
		 i4.add(1481122040);
		 input.add(i4);
		 
		 List<Integer> i5=new ArrayList<Integer>();
		 i5.add(3);
		 i5.add(1481122040);
		 i5.add(1481122060);
		 input.add(i5);
		 
		 List<Integer> i6=new ArrayList<Integer>();
		 i6.add(1);
		 i6.add(1481122050);
		 i6.add(1481122060);
		 input.add(i6);
		 
		 
		 List<Integer> i7=new ArrayList<Integer>();
		 i7.add(3);
		 i7.add(1481122070);
		 i7.add(1481122090);
		 input.add(i7);
	 
	
	
		 List<List<Integer>> res= employeeWithLesserThanKBreaks(input,2);
		 
		 for(int i=0;i<res.size();i++)
		 {
			 System.out.print(res.get(i).get(0));
			 System.out.print(res.get(i).get(1));
			 System.out.println();
		 }
	

	}
	private static class NewNode
	{
		Integer id;
		Integer s;
		Integer e;
		Integer bc;
		NewNode(int i, int s,int e,int bc){
			this.id=i;
			this.s=s;
			this.e=e;
			this.bc=bc;
		}
		@Override
		public String toString() {
			return "NewNode [id=" + id + ", s=" + s + ", e=" + e + ", bc=" + bc + "]";
		}
		
		
	}
	
	public static List<List<Integer>> employeeWithLesserThanKBreaks(List<List<Integer>> employeeCalls, int k) {
	    // Write your code here
	 System.out.println(employeeCalls.size());
	 HashMap<Integer,NewNode> hm=new HashMap<>();
	 List<List<Integer>> res=new ArrayList<List<Integer>>();
	 
	 
	 for(int i=0;i<employeeCalls.size();i++)
	 {
		
		List<Integer> l=employeeCalls.get(i);
		
		 int id=l.get(0);
		 int st=l.get(1);
		 int en=l.get(2);
		 if(hm.containsKey(id))
		 {
			 NewNode n=hm.get(id);
			 int count=n.bc;
			 if(n.e<st)
			 {
				 count++;
				 hm.remove(id);
				 NewNode newN=new NewNode(id, st, en, count);
				 hm.put(id, newN);
			 }
			 else
			 {
				 hm.remove(id);
				 NewNode newN=new NewNode(id, st, en, count);
				 hm.put(id, newN);
			 }
		 }
		 else
		 {
			 NewNode newN=new NewNode(id, st, en, 0);
			 hm.put(id, newN);
		 }
	 }
	 
	 
	 
	 for (Entry<Integer, NewNode> entry : hm.entrySet())  
	 {   
	 NewNode n=hm.get(entry.getKey() );
	 System.out.println("n"+n);
	 int count=n.bc;
	 int id=n.id;
	 if(count<k)
	 {	List<Integer> l=new ArrayList<Integer>();
	 		l.add(id);
	 		 l.add(count);
		 res.add(l);
		 
	 }
 
    } 
	 
	 return res;
 }


}
