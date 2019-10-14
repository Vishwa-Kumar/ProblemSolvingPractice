import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;





public class Test {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
		List<Integer> ls=new ArrayList<Integer>();
		
//		hm.put(1, ls.add(2));
		
		
		
		// TODO Auto-generated method stub
//			System.out.println("Hi");
//			
//			
//			String a="my name is vishwa";
//			String b[]=a.split(" ");
//			System.out.println(b.length);
//			List<String> ol=new ArrayList<String>();
//			ol.add("mi2 jog mid pet");
//			ol.add("wz3 34 54 398");
//			ol.add("a1 alps cow bar");
//			ol.add("x4 45 21 7");
//			Test t=new Test();
//			List<String> res= t.prioritizedOrders(4,ol);
//			System.out.println("res"+res);
	}
	
	
	private static class NewNode
	{
		String id;
		String[] metaData;
		boolean isPrime;
		String originalString;
		NewNode(String id2,String[] al,boolean ip,String os){
			this.id=id2;
			this.metaData=al;
			this.isPrime=ip;
			this.originalString=os;
		}
		@Override
		public String toString() {
			return "NewNode [id=" + id + ", metaData=" + Arrays.toString(metaData) + ", isPrime=" + isPrime
					+ ", originalString=" + originalString + "]";
		}
		
	}
	
	private static class Node
	{
		int row;
		int col;
		int val;
		boolean isVisited;
		
		Node(int r,int c, int v, boolean iv)
		{
			this.row=r;
			this.col=c;
			this.val=v;
			this.isVisited=false;
		}
		
		
	}
	
	
		int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot)
	    {
	        // WRITE YOUR CODE HERE
			
			int mat[][]=new int[numRows][numColumns];
			
			for(int i=0;i<numRows;i++)
			{
				for(int j=0;j<numRows;j++)
				{
					mat[i][j]=lot.get(i).get(j);
				}
			}
			breadthFirstSearch(mat,0);
			return 0;
	    }
		
		 int breadthFirstSearch(int[][] matrix, int source){
	        boolean[] visited = new boolean[matrix.length];
	        visited[source-1] = true;
	        Queue<Integer> queue = new LinkedList<>();
	        queue.add(source);
	        System.out.println("The breadth first order is");
	        int pathCount=0;
	        while(!queue.isEmpty()){
	            System.out.println(queue.peek());
	            int x = queue.poll();
	            int i;
	            for(i=0; i<matrix.length;i++){
	                if(matrix[x-1][i] == 1 && visited[i] == false ){
	                    queue.add(i+1);
	                    visited[i] = true;
	                    if(matrix[x-1][i]==9)
	                    {
	                    	return pathCount;
	                    }
	                    pathCount=pathCount+1;
	                    
	                }
	            }
	        }
	        return -1;
	    }
	
	
	
	
	
	 public List<String> prioritizedOrders(int numOrders, List<String> orderList) 
		{
		 String id;
		 List<NewNode> nl=new ArrayList<NewNode>();
		 int firstMetaInteger=0;
		 boolean isPrime=false;
		 
		 for(int i=0;i<numOrders;i++)
		 {
			 isPrime=false;
			 String b[]=orderList.get(i).split(" ");
			 id=b[0];
			 try {
				 System.out.println("b[1]"+b[1]);
				 firstMetaInteger=Integer.parseInt(b[1]);
			 }catch(Exception e)
			 {
				 isPrime=true;
			 }
			 NewNode node=new NewNode(id,b,isPrime,orderList.get(i));
			 nl.add(node);
			 
		 }
		 System.out.println("before sorting"+nl);
		 Collections.sort(nl, new Comparator<NewNode>() {


				@Override
				public int compare(NewNode obj1, NewNode obj2) {
					// TODO Auto-generated method stub
					if (obj1.isPrime==obj2.isPrime)
					{
						int len1=obj1.metaData.length;
						int len2=obj2.metaData.length;
						
						String m1[]=obj1.metaData;
						String m2[]=obj2.metaData;
						
						int smaller=len1>len2?len2:len1;
						
						int counter=1;
						while(counter<smaller)
						{
							String word1=m1[counter];
							String word2=m2[counter];
							
							int res=word1.compareTo(word2);
							if (res==0)
							{
								counter=counter+1;
								continue;
							}
							else
							{
								return res;
							}
						}
						
						
						return 0;
					}
					else
					{
						if(obj1.isPrime==true)
						{
							return -1;
						}
						else
						{
							return 1;
						}
					}
					
					
					
				}
		 	});
		 
		 List<String> res=new ArrayList<String>();
		 for(int i=0;i<numOrders;i++)
		 {
			 res.add(nl.get(i).originalString);
		 }
		 
		 
			return res;
			// WRITE YOUR CODE HERE
		}
	
	
//	 public int solution(int A, int B) {
//	        // write your code in Java SE 8
//		 int count=0;
//		 for(int i=A;i<=B;i++)
//		 {
//			 
//			 Double sqroot=Math.sqrt(i);
//			 System.out.println("i "+i+" "+sqroot);
//			 System.out.println("i "+i+" "+sqroot * sqroot);
//			 
//			 String s=sqroot+"";
//			 int sq=(int) Math.round(sqroot);
//			 int prev=sq-1;
//			 int next=sq+1;
//			 
//			 if (sq*prev==i || sq * next ==i)
//			 {
//				 count++;
//			 }
//			 System.out.println("rounded"+sq);
//			 
//			 System.out.println(sqroot * sqroot==i);
//			 
//		 }
//		 System.out.println("final count"+count);
//		 
//		 return count;
//	    }
	
	
	
	
	
	
	
	 public int solution(int N) {
	        // write your code in Java SE 8
		 
		 if (N==0)
		 {
			 return 0;
		 }
		 int digitCount=0;
		 StringBuilder str=new StringBuilder();
		 while (N>0)
		 {
			 N=N/10;
			 digitCount++;
			 if(digitCount==1)
			 {
				 str.append("1");
			 }
			 else
			 {
				 str.append("0");
			 }
			
		 }
		 
		 if(digitCount==1 )
		 {
			 return 0;
		 }
		 else
		 {
			return Integer.parseInt(str.toString());
		 }
		
	    }

}
