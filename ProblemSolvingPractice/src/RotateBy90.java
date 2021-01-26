
public class RotateBy90 {
	
	public static void main(String[] args) {
		
		RotateBy90 o=new RotateBy90();
		int[][] a=  {{1, 2, 3},
		             {4, 5, 6},
		             {7, 8, 9}};
		int[][] b=o.rotateImage(a);
		
		//o.print(b);
		
	}
	
	
	
	int[][] rotateImage(int[][] a) {
	    int n = a.length;
	    for(int i = 0; i < n / 2; i++){
	        for(int j = i; j < n-i-1; j++){
	        	System.out.println("i  "+i+" j  "+j+" n-i-1  "+(n-i-1));
	            int temp = a[i][j];
	            a[i][j] = a[n-j-1][i];
	            a[n-j-1][i] = a[n-1-i][n-1-j];
	            a[n-1-i][n-1-j] = a[j][n-1-i];
	            a[j][n-1-i] = temp;
	        }
	    }
	    return a;
	}
	
	
	
	/*
	 * int[][] rotateImage(int[][] a) {
	 * 
	 * return reverseCol(rowToColAndViceVersa(a)); }
	 */


	int[][] rowToColAndViceVersa(int[][] a)
	{
	    int r=a.length;
	    int c=a[0].length;
	    int temp=0;
	   
	    int rs=0;
	    int cs=0;
	    for(int i=rs;i<r;i++)
	    {
	    	for(int j=cs;j<c;j++)
	    	{
	    		temp=a[i][j];
	    		a[i][j]=a[j][i];
	    		a[j][i]=temp;
	    		
	    	}
	    	rs++;
	    	cs++;
	    }
	    RotateBy90 o=new RotateBy90();
	    o.print(a);
	    return a;
	}
	
	int[][] reverseCol(int[][] a)
	{
	    int r=a.length;
	    int c=a[0].length;
	    int rs=0;
	    int cs=0;
	    int temp=0;
	    System.out.println("r"+r+" c "+c);
	    for(int i=0;i<r;i++)
	    {
	    	for(int j=cs;j<c;j++)
	    	{
	    		temp=a[i][j];
	    		a[i][j]=a[i][c-1];
	    		a[i][c-1]=temp;
	    		c--;
	    	}
	    	c=a[0].length;
	    }
	    RotateBy90 o=new RotateBy90();
	    o.print(a);
	    return a;
	}
	
	void print(int[][] a)
	{
		int r=a.length;
	    int c=a[0].length;
		 for(int i=0;i<r;i++)
		    {
		    	for(int j=0;j<c;j++)
		    	{
		    		System.out.print(a[i][j]+"\t" );
		    	}
		    	System.out.println();
		    }
	}

}
