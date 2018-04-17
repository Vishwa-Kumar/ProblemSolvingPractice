package educative.io;

import java.util.*;

/*This is not using either adjacency list or adjacency matrix
it uses simple two list to represent the vertex and other list to represent edges
Time Complexity O(V*E)
Space Complexity O(2V)=O(V)
*/


public class MinimumSpanningTreePrim {
	static class Graph
	{
		ArrayList<String> vertexList=new ArrayList<>();
		ArrayList<Edge> edgeList=new ArrayList<>();
	}
	static class Edge{
		
		String startVertex;
		String endVertex;
		int weight;
		
		Edge(String a, String b, int w)
		{
			this.startVertex=a;
			this.endVertex=b;
			this.weight=w;
		}
	}

	public static void main(String[] args) {
		Graph g1=new Graph();
		Graph g2=new Graph();
	    g1.vertexList.add("A");
		g1.vertexList.add("B");
		g1.vertexList.add("C");
		g1.vertexList.add("D");
		g1.vertexList.add("E");
		
		g1.edgeList.add(new Edge("A","B",1));
		g1.edgeList.add(new Edge("A","C",1));
		g1.edgeList.add(new Edge("B","D",3));
		g1.edgeList.add(new Edge("B","C",2));
		g1.edgeList.add(new Edge("C","E",3));
		g1.edgeList.add(new Edge("D","E",2));
		
		g2.vertexList.add("1");
		g2.vertexList.add("2");
		g2.vertexList.add("3");
		g2.vertexList.add("4");
		g2.vertexList.add("5");
		g2.vertexList.add("6");
		g2.vertexList.add("7");
		
		g2.edgeList.add(new Edge("1","2",2));
		g2.edgeList.add(new Edge("1","3",1));
		g2.edgeList.add(new Edge("2","4",3));
		g2.edgeList.add(new Edge("3","4",1));
		g2.edgeList.add(new Edge("1","4",2));
		g2.edgeList.add(new Edge("3","5",2));
		g2.edgeList.add(new Edge("4","7",2));
		g2.edgeList.add(new Edge("5","7",2));
		g2.edgeList.add(new Edge("5","6",1));
		
		//System.out.println("Test Case 1"+if(findMST(g1)==7));
		System.out.println(findMST(g1));
		System.out.println(findMST(g2));
		

	}
	
	 public static int findMST(Graph g)
	 {
		 //adding first random vertex
		 String nextVertex=g.vertexList.get(0);
		 HashSet<String> mstVertex=new HashSet<>();
		 HashSet<String> graphVertex=new HashSet<>(g.vertexList);
		 mstVertex.add(g.vertexList.get(0));
		 graphVertex.remove(g.vertexList.get(0));
		 
		 System.out.println("nextVertex "+nextVertex);
		 
		 //find next minimum vertex adjacent to previous one
		 int nextMinWeight=Integer.MAX_VALUE;
		 int mstWeight=0;
		 Edge nextEdge=null;
		 
		 while(!graphVertex.isEmpty())
		 {
			 nextMinWeight=Integer.MAX_VALUE;
			 nextEdge=null;
			 for(Edge e:g.edgeList)
			 {
				 if((mstVertex.contains(e.startVertex) || mstVertex.contains(e.endVertex)) &&(
					  graphVertex.contains(e.startVertex)||graphVertex.contains(e.endVertex)))
				 {
					 if(e.weight<nextMinWeight)
					 {
						 nextMinWeight=e.weight;
						 nextEdge=e;
					 }
				 }
			 }
			 nextVertex=nextEdge.endVertex.equals(nextVertex)?nextEdge.startVertex:nextEdge.endVertex;
			 mstVertex.add(nextVertex);
			 graphVertex.remove(nextVertex);
			 System.out.println("nextVertex "+nextVertex+" weight "+nextEdge.weight+" edge"+nextEdge.startVertex+" "+nextEdge.endVertex);
			 mstWeight+=nextEdge.weight;
		 }
		 
		 System.out.println("mstWeight "+mstWeight);
		 return mstWeight;
		 
	 }
 

}
