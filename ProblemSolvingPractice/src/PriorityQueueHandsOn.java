import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class  PriorityQueueHandsOn {

	
	class    Node{
		int i;
		int j;
		public Node(int i, int j) {
			super();
			this.i = i;
			this.j = j;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		pq.add(3);
		pq.add(6);
		pq.add(10);
		
		//System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		System.out.println(pq.size());
		
//		PriorityQueue<Node> pq = new PriorityQueue<Node> (
//				  new Comparator<Node> () {
//				    public int compare(Node a, Node b) {
//				       return a.i - b.i;
//				    }
//				  }
//				);
		
		
//		PriorityQueue<Node> pq = new PriorityQueue<>(Collections.reverseOrder());
//		Node n=new Node(1,2);
//		pq.add(new Node(1,2));
//		pq.add(new Node(10,20));
//		
//		pq.add(new Node(30,50));
		
	
		
//		System.out.println(pq.poll());
	}

}
