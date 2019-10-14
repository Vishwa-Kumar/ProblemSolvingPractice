package leetCode.amazon.arraysAndStrings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstUniqueCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		s = "loveleetcode",
//				return 2.
		FirstUniqueCharacterString obj=new FirstUniqueCharacterString();
		System.out.println(obj.firstUniqChar("cc"));
		
	}
	
	class Node{
		int firstIndex;
		int count;
		
		public Node(int firstIndex, int count) {
			super();
			this.firstIndex = firstIndex;
			this.count = count;
		}

		@Override
		public String toString() {
			return "Node [firstIndex=" + firstIndex + ", count=" + count + "]";
		}
		
		
	}
	
	 public int firstUniqChar(String s) {
	        
		 if(s==null || s=="" || s.length()==0)
	        {
	            return -1;
	        }
		 char[] chars=s.toCharArray();
		 LinkedHashMap<Character,Node> hm=new LinkedHashMap<Character, Node>();
		 
		 for(int i=0;i<chars.length;i++)
		 {
			 if(hm.containsKey(chars[i]))
			 {
				 
				 Node node=hm.get(chars[i]);
				 node.count=node.count+1;
				 hm.put(chars[i],node);
			 }
			 else
			 {
				 hm.put(chars[i],new Node(i,1));
			 }
		 }
		int minIndex=Integer.MAX_VALUE;
		 for (Entry<Character, Node> entry : hm.entrySet()) {
			 System.out.println(entry.getKey()+" "+entry.getValue());
			 Node node=entry.getValue();
			 if (node.count!=1)
			 {
				 continue;
			 }
			 else
			 {
				 if(node.firstIndex<minIndex)
				 {
					 minIndex=node.firstIndex;
				 }
			 }
			   
			}
		 hm.clear();
		 if (minIndex==Integer.MAX_VALUE)
		 {
			 return -1;
		 }
		 return minIndex;
	    }

}
