package oyo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class DistinctArray {
	
	
//	given a array with numbers and distinct attribute of an array is the number of distinct elements array has
//	given number B we need to remove elements from array in a way that it gives least distinct of the array 
	
	
	public static void main(String[] args) {
		DistinctArray obj = new DistinctArray();
		
		int[] a = { 3, 1, 2, 5, 3 };
		int res = obj.distinctInArray(a,2);
		
		
		System.out.println("  res  " +res);
	}
	
	class Node{
		int num;
		int count;
		public Node(int num, int count) {
			this.num = num;
			this.count = count;
		}
		@Override
		public String toString() {
			return "Node [num=" + num + ", count=" + count + "]";
		}
		
	}
	
	
	public int distinctInArray(int[] arr,int m)
	{
		PriorityQueue<Node> pq=new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node arg0, Node arg1) {
				
				return arg0.count-arg1.count;
			}
			
		});
		HashMap<Integer,Node> hm=new HashMap<>();
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i:arr)
		{
			hs.add(i);
			if(hm.containsKey(i))
			{
				Node node=hm.get(i);
				node.count=node.count+1;
				hm.put(i,node);
			}
			else
			{
				hm.put(i,new Node(i,1));
			}
		}
		System.out.println("unique before removing "+hs.size());
		System.out.println("count map "+hm);
		for(Entry<Integer,Node> entry:hm.entrySet())
		{
			pq.add(entry.getValue());
		
		}
		System.out.println("m "+m);
		System.out.println("pq "+pq);
//		while(!pq.isEmpty())
//		{
//			Node n=pq.poll();
//			System.out.println("pq "+n.num+" "+n.count);
//			
//		}
		int count=0;
		while(count<m  && !pq.isEmpty())
		{
			
			Node node=pq.peek();
			System.out.println("Node node "+node.num+"  count  "+node.count);
			if( node.count<=m)
			{
				count=+node.count;
				pq.poll();
			}
			else
			{
				break;
			}
			System.out.println("count "+count+ " pq "+pq);
		}
		
		return pq.size();
	}

}
