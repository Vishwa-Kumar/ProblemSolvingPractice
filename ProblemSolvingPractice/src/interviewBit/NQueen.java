package interviewBit;

import java.util.ArrayList;

public class NQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueen obj = new NQueen();
		obj.solveNQueens(4);
		// System.out.println(obj.ans);
	}

	public ArrayList<ArrayList<String>> solveNQueens(int a) {

		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < a; i++) {
			ArrayList<String> al = new ArrayList<String>();
			for (int j = 0; j < a; j++) {
				al.add(".");

			}
			ans.add(al);
		}
		//System.out.println(ans);
		ArrayList<ArrayList<ArrayList<String>>> solList=new ArrayList<ArrayList<ArrayList<String>>>();
		if(solveNQueensUtil(a, 0, ans))
		{
			solList.add(ans);
		}
		
		return ans;
	}

	private boolean solveNQueensUtil(int a, int row, ArrayList<ArrayList<String>> chess) 
	{
		if(row==a)
		{
			return false;
		}
			for (int c = 0; c < a; c++) {
				if (checkMove(a, row, c, chess))
				{
					
					chess.get(row).set(c,"Q");
					if(row==a-1)
					{
						System.out.println("chess"+chess);
						return true;
					}
					
					if(solveNQueensUtil(a, row + 1, chess))
					{
						return true;
					}
					else {
						chess.get(row).set(c,".");
					}
					
				}
			}
			return false;
	}

	private boolean checkMove(int a, int r, int c, ArrayList<ArrayList<String>> chess) 
	{
		// check boundary condition
		
		// check row
		ArrayList<String> al=chess.get(r);
		for(int i=0;i<a;i++)
		{
			if(al.get(i).equalsIgnoreCase("Q") && (i!=r))
			{
				return false;
			}
			
		}
		
		// check column
		for(int i=0;i<a;i++)
		{
			al=chess.get(i);
			
			if(al.get(c).equalsIgnoreCase("Q") && (i!=r))
			{
				return false;
			}
			
		}
		
		//check upper diagnoals
		int row=r-1;
		int col=c-1;
		
		while(row>=0 && col>=0)
		{
			al=chess.get(row);
			if(al.get(col).equalsIgnoreCase("Q"))
			{
				return false;
			}
			row--;
			col--;
		}
			
		
		//check lower diagnoals
		
		 row=r+1;
		 col=c+1;
		
		while(row<a && col<a)
		{
			al=chess.get(row);
			if(al.get(col).equalsIgnoreCase("Q"))
			{
				return false;
			}
			row++;
			col++;
		}
		
		
		
		
		 return true;
	}

}
