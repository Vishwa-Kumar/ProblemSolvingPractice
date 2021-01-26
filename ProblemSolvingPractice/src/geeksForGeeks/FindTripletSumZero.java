package geeksForGeeks;

import java.util.Arrays;

public class FindTripletSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {60 ,-65, 5, -21, 8, 93};
		new FindTripletSumZero().findTriplets(arr,6);

	}
	
	
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
		Arrays.sort(arr);
       // -65 -21 5 8 60 93
        for(int i=0;i<n;i++)
        {
        	// we need to find -arr[i] sum pair
        	System.out.println(arr[i]);
        	int end=n-1;
        	int start=i+1;
        	int localSum=0;
        	int sumToFind=-arr[i];
        	while(start<end)
        	{
        		
        		localSum=arr[start]+arr[end];
        		System.out.println("localSum "+localSum +" arr[s]  "+arr[start]+" arr[e]  "+arr[end]+" sumToFind "+sumToFind);
        		
        		if(localSum-sumToFind==0)
        		{
        			System.out.println(arr[i]+"  "+arr[start]+" "+arr[end]);
        			return true;
        		}
        		else if(localSum>sumToFind)
        		{
        			end--;
        		}
        		else
        		{
        			start++;
        		}
        	}
        		
        	
        }
		return false;
    }

}
