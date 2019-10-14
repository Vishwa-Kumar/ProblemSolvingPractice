package oyo;

import java.util.*;

public class SpiralOrderMatrix {

	public static void main(String[] args) {
		SpiralOrderMatrix obj = new SpiralOrderMatrix();
		obj.spiralOrder(4);
		

	}

	public List<Integer> spiralOrder(int n) {

		int[][] mat = new int[n][n];

		int rs = 0;
		int re = n-1;
		int cs = 0;
		int ce = n-1;
		int i = 0;
		int num = 0;

		while (rs < n && cs < n) {
			for (i = cs; i <= ce; i++) {
				mat[rs][i] = ++num;
			}
			rs++;
			for (i = rs; i <= re; i++) {
				mat[i][ce] = ++num;
			}
			ce--;
			for (i = ce; i >= cs; i--) {
				mat[re][i] = ++num;
			}
			re--;
			for (i = re; i >= rs; i--) {
				mat[i][cs] = ++num;
			}
			cs++;
			
			
			
		}
		SpiralOrderMatrix.print(mat);
		return null;
	}
	
	public static void print(int[][] mat) {
		
		int r=mat.length;
		int c=mat[0].length;
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}

	}


}
