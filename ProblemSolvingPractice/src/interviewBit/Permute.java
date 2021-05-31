package interviewBit;

import java.util.ArrayList;

public class Permute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permute obj=new Permute();
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 al.add(1);
		 al.add(2);
		 al.add(3);
		 obj.permute(al);
		 System.out.println(obj.res);
	}

	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
		permuteUtil(A, new ArrayList<Integer>(), A.size());
		return res;
	}

	public void permuteUtil(ArrayList<Integer> A, ArrayList<Integer> curr, int size) {

		if (curr.size() == size) {
			res.add(curr);
			return;
		}

		for (int i = 0; i < A.size(); i++) {
			
			curr.add(A.get(i));
			//System.out.println(A);
			//System.out.println("size"+ A.size()+" temp"+temp+" curr "+curr);
			ArrayList<Integer> subArray=createSubarray(A,A.get(i));
			//System.out.println("subArray "+subArray);
			permuteUtil(subArray, new ArrayList(curr), size);
			curr.remove(curr.size()-1);
		}
	}
	
	public ArrayList<Integer> createSubarray(ArrayList<Integer> A,int ele)
	{
		ArrayList<Integer> subArray=new ArrayList<Integer>();
		for(int i:A)
		{
			if(i==ele)
			{
				continue;
			}
			subArray.add(i);
		}
		return subArray;
	}

}
