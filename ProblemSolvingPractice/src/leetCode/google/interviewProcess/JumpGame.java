package leetCode.google.interviewProcess;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGame jumpGame=new JumpGame();
		int[] nums= {2,0,0};
		System.out.println(jumpGame.canJump(nums));
	}
	
	public boolean canJump(int[] nums)
	{
		return recCanJump(nums,0);
		
	}
	
	
	private boolean recCanJump(int[] nums,int index)
	{
		if(nums.length==1)
		{
			return true;
		}
		System.out.println("index"+ index);
		int num=nums[index];
		boolean res=false;
		for(int i=index+1;i<=num+index;i++)
		{
			if(i==nums.length-1)
			{
				return true;
			}
			else
			{
				res=recCanJump(nums,i);
				if(res==true)
				{
					return true;
				}
				else
				{
					continue;
				}
				
			}
		}
		
		return false;
	}

}
