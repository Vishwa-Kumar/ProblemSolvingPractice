package hackerRank;

import java.io.IOException;
import java.util.Scanner;

public class ArrayLeftRotation {
	 private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		int a[]=new int[] {1,2,3,4,5};
		int d=2;
		int res[]=rotLeft(a,d) ;
		
		for(int i:res)
		{
			System.out.print(i+"\t");
		}
	}
	
	 static int[] rotLeft(int[] a, int d) {
		 int size=a.length;
		 int res[]=new int[size];
		 int actual_rotation=d%size;
		
		 if(actual_rotation==0)
		 {
			 return a;
		 }
		 for(int i=0;i<size;i++)
		 {
			 res[i]=a[(i+d)%size];
		 }
		 return res;
	    }

}
