package builderDesignPattern;

import java.util.*;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrival=new ArrayList<Integer>();
		arrival.add(1);
//		arrival.add(3);
//		arrival.add(5);
//		arrival.add(1);
//		arrival.add(4);
		
		
		List<Integer> duration=new ArrayList<Integer>();
		duration.add(5);
//		duration.add(2);
//		duration.add(2);
//		duration.add(4);
//		duration.add(2);
		
		System.out.println(maxEvents(arrival,duration));

	}
	
	
	
	
	
	
	  public static int requestsServed(List<Integer> timestamp, List<Integer> top) {
		    // Write your code here
		  
		  Collections.sort(timestamp);
		  HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		  Collections.sort(top);
		  int p=0;
		  int reqCount=0;
		  int value=0;
		 
		 
		  for (int i = 0; i < top.size(); i++) {
			  
			  p=top.get(i);
			  
			  for (int j = timestamp.size()-1; j >0; i++) {
			  
				  if(timestamp.get(j)<p)
				  {
					  timestamp=timestamp.subList(0, j);
					  reqCount=reqCount+j;
					  break;
				  }
			  }
			  
		  }
		  return reqCount;

		    }
	  
	  public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }

	
	
	
	
	
	
	
	
	
	
	private static class Node {
		Integer time;
		Integer d;

		Node(int t, int d) {
			this.time = t;
			this.d = d;
		}

		@Override
		public String toString() {
			return "Node [time=" + time + ", d=" + d + "]";
		}
		

	}
	
	
	 public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
		    // Write your code here
		 Node node=null;
		 List<Node> nl = new ArrayList<Node>();
		 HashSet<Integer> hs=new HashSet<Integer>();
		 for (int i = 0; i < arrival.size(); i++) {
			 hs.add(arrival.get(i));
			 node=new Node(arrival.get(i),duration.get(i));
			 nl.add(node);
			}
		 
		
				 
		 
		 Collections.sort(nl, new Comparator<Node>() {

				@Override
				public int compare(Node obj1, Node obj2) {
					
					if (obj1.time==obj2.time)
					{
						if(obj1.d>obj2.d)
						{
							return 1;
						}
						else if(obj1.d==obj2.d)
						{
							return 0;
						}
						else
						{
							return -1;
						}
						
					}
					return obj1.time-obj2.time;

				}
			});
		 
		 int commTime=0;
		 int eventCount=0;
		 int time=0;
		 int previousTime=0;
		 for (int i = 0; i < nl.size(); i++) {
			
			if(i==0)
			{
			commTime=commTime+nl.get(i).time;	
			previousTime=nl.get(i).time;
			eventCount++;
			}
			else
			{
				
				time=nl.get(i).time;
				if(time==previousTime)
				{
					continue;
				}
				if(commTime<=time)
				{
					previousTime=time;
					eventCount++;
				}
				else
				{
					continue;
				}
			}
			
			}
		 
		 System.out.println(nl);
		    return eventCount;

		    }

}
