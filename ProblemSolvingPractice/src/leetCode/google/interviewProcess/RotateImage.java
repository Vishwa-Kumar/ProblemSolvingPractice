package leetCode.google.interviewProcess;

public class RotateImage {

	public static void main(String[] args) {
		
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		RotateImage rotateImage=new RotateImage();
		rotateImage.rotate(matrix);

	}

	public void rotate(int[][] matrix) {
		printMatrix(matrix);
		transposeMatrix(matrix);
		printMatrix(matrix);
		reverseCol(matrix);
		printMatrix(matrix);
		
	}
	
	private void reverseCol(int[][]matrix)
	{
		int row=matrix.length;
		int col=matrix[0].length;
		int i,j=0;
		for( i=0;i<col/2;i++)
		{
			for( j=0;j<row;j++)
			{
				int temp=matrix[j][i];
				matrix[j][i]=matrix[j][col-1-i];
				matrix[j][col-1-i]=temp;
			}
		}
	}
	
	
	private void transposeMatrix(int[][] matrix)
	{
		int row=matrix.length;
		int col=matrix[0].length;
		int i,j=0;
		for( i=0;i<row;i++)
		{
			for(j=i;j<col;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
	}
	
	public  void printMatrix(int mat[][])
	{
		int row=mat.length;
		int col=mat[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
