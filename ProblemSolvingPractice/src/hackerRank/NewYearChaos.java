package hackerRank;

public class NewYearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[] {1,5,2,3,4};
		 a=new int[] {2,5,1,3,4};
		a=new int[] {2,1,5,3,4};
		minimumBribes(a);

	}
	
	static void minimumBribes(int[] q) {
		
		int size=q.length;
		int bribeCount=0;
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(q[j]>j+2+1)
				{
					System.out.println("Too chaotic");
					return;
				}
				
				if(q[j]>q[j+1])
				{
					int temp=q[j];
					q[j]=q[j+1];
					q[j+1]=temp;
					bribeCount++;
				}
			
			}
		}
		System.out.println(bribeCount);
    }

}
