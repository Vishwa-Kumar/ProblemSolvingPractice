package leetCode.google.interviewProcess;

import java.util.*;

/*
 * 
 * Given an array of integers arr, find the sum of min(b), 
 * where b ranges over every (contiguous) subarray of arr. 
 * Since the answer may be large, return the answer modulo 109 + 7.
 */

public class SumofSubarrayMinimums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int sumSubarrayMins(int[] arr) {
        int size=0;
        int startIndex=0;
        int endIndex=0;
        int n=arr.length;
        ArrayList<Integer> subArr=new ArrayList<>();
        int subArrayMinSum=0;
        for (size=1;size<=n;size++)
        {
            for(startIndex=0;startIndex<=n-size;startIndex++)
            {
                for(endIndex=startIndex;endIndex<startIndex+size;endIndex++)
                {
                    subArr.add(arr[endIndex]);
                } 
                Collections.sort(subArr);
                subArrayMinSum=subArrayMinSum+subArr.get(0);
                subArr.clear();
                
            }
         
        }
        return subArrayMinSum;
    }

}
