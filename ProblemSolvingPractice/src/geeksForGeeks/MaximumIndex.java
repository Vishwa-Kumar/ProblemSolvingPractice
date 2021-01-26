package geeksForGeeks;

public class MaximumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= new int[]{82, 63, 44, 74, 82, 99, 82};
		System.out.println("ans: "+maxIndexDiff(arr,7));

	}
	
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int smallestToLeftArr[]=new int[n];
        int largestToRightArr[]=new int[n];
        int maxIndexDiffSoFar=0;
        int maxIndex=0;
        //make smallest to left array
        smallestToLeftArr[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            smallestToLeftArr[i]=Math.min(smallestToLeftArr[i-1],arr[i]);
        }
        printArr(smallestToLeftArr);
        //make largest to right array
         largestToRightArr[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
           largestToRightArr[i]=Math.max(largestToRightArr[i+1],arr[i]);
           System.out.println(largestToRightArr[i]);
        }
        printArr(largestToRightArr);
        maxIndex=0;
        maxIndexDiffSoFar=0;
        int x=0;
        int y=0;
        
        while(y<n && x<n)
        {
            if(largestToRightArr[y]>=smallestToLeftArr[x])
            {
                
                maxIndex=Math.max(maxIndex,y-x);
                System.out.println(maxIndex);
                y++;
               
               
            }
           else
            {
                x++;
                continue;
            }
        }
        
        return maxIndex;
    }
    
    static void printArr(int arr[])
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		System.out.println("i "+i+" "+arr[i]);
    	}
    }
}


