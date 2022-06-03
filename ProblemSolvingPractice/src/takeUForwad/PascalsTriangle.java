package takeUForwad;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		PascalsTriangle pascalsTriangle=new PascalsTriangle();
		List<List<Integer>> res=pascalsTriangle.generate(num);
		//System.out.println(res.toString());
		
		
		for(int i=0,preSpace=num-1;i<num;i++,preSpace--)
		{
			List<Integer> var=res.get(i);
			for(int sp=preSpace;sp>0;sp--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<var.size();j++)
			{
				System.out.print(var.get(j));
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
	 public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
			List<Integer> row, pre = null;
			for (int i = 0; i < numRows; ++i) {
				row = new ArrayList<Integer>();
				for (int j = 0; j <= i; ++j)
					if (j == 0 || j == i)
						row.add(1);
					else
						row.add(pre.get(j - 1) + pre.get(j));
				pre = row;
				res.add(row);
			}
			return res;
	    }

}
