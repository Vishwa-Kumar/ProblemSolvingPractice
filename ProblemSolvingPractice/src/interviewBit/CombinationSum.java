package interviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSum cs=new CombinationSum();
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(8);
		al.add(10);
		al.add(6);
		al.add(11);
		al.add(1);
		al.add(16);
		al.add(8);
		 HashSet <Integer> set = new HashSet <Integer>(al);
	        ArrayList <Integer> A = new ArrayList <Integer>(set);
		cs.combinationSum(A,28);
	}
	
	 ArrayList<ArrayList<Integer>> resList=new ArrayList<ArrayList<Integer>>();
	    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
	    
	       
	        ArrayList<Integer> res=new ArrayList<>();
	         
	      
	        int targetSum=B;
	        int presentSum = targetSum;
	        int presentIndex=0;
		
		  HashSet <Integer> s = new HashSet <Integer>(A); A = new ArrayList
		  <Integer>(s);
		  Collections.sort(A);
	        sumUtil(A, presentSum, presentIndex,res);
	        System.out.println(resList);
	        return resList;
	    }
	    //28
	     private boolean sumUtil(ArrayList<Integer> A,int presentSum,int presentIndex,ArrayList<Integer> res)
	    {
	    	
	     // 8, 10, 6, 11, 1, 16, 8
	    	 //1, 6, 8, 10, 11, 16
	      
	      for(int i=presentIndex;i<A.size();i++)
	      {
	          presentSum=presentSum-A.get(i);
	          if(presentSum<0)
	          {
	              // solution not possible with inclusion on A[i]
	               presentSum=presentSum+A.get(i);
	              break;
	          }
	          else if(presentSum==0)
	          {
	              // found one solution
	               res.add(A.get(i));
	               Collections.sort(res);
	               resList.add(new ArrayList<Integer>(res));
	              // System.out.println(res.toString());
	               res.remove(A.get(i));
	              // return true;
	          }
	          else{
	              // recurse further subproblem
	              res.add(A.get(i));
	              if(sumUtil(A,presentSum,i,res))
	              {
	                // great lets try to find other solution  
	               
	                
	              }
	              else{
	                // great lets try to find other solution
	                 
	                
	              }
	               res.remove(A.get(i));
	          }
	           presentSum=presentSum+A.get(i);
	      }
	      return true;
	    }

}
