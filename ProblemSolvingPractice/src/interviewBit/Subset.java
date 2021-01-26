package interviewBit;

import java.util.ArrayList;
import java.util.Collections;




//Elements in a subset must be in non-descending order.
//The solution set must not contain duplicate subsets.
//Also, the subsets should be sorted in ascending ( lexicographic ) order.
//The list is not necessarily sorted.


public class Subset {
	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subset obj = new Subset();
		ArrayList<Integer> curr = new ArrayList<Integer>();
		curr.add(1);
		curr.add(2);
		 curr.add(3);
		obj.subsets(curr);
		System.out.println(obj.res);
	}

	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		ArrayList<Integer> curr = new ArrayList<Integer>();
		Collections.sort(A);
		//subsetUtil(A, curr, 0);
		subsetUtilOrder(A,curr,0);
		return res;
	}

	// this solution generates the all subsets but it not fullfilling the constraints of ascendinging and 
	// lexiographical order .
	private void subsetUtil(ArrayList<Integer> A, ArrayList<Integer> curr, int index) {

		// base condition
		if (index == A.size()) {
			Collections.sort(curr);
			res.add(new ArrayList<Integer>(curr));
			return;
		}
		subsetUtil(A, curr, index + 1);
		curr.add(A.get(index));
		subsetUtil(A, curr, index + 1);
		curr.remove(A.get(index));

	}
	
	private void subsetUtilOrder(ArrayList<Integer> A,ArrayList<Integer> curr,  int index) {

		
		
		for(int i=index;i<A.size();i++)
		{
			curr.add(A.get(i));
			res.add(new ArrayList<>(curr));
			subsetUtilOrder(A,new ArrayList<Integer>(curr), i+1);
			curr.remove(A.get(i));
		}

	}

}
