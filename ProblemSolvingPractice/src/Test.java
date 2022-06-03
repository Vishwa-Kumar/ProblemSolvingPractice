import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;





public class Test {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
	        int n,i;
	        double sum=0.0,a=0;
	        System.out.println("Enter the  number till which the loop should run");
	        n=sc.nextInt();
	        for(i=1;i<=n;i=i+3)
	        {
	            sum =sum+((3*i+1.0)/Math.pow(a,3*i+2));
	            System.out.println("The number is "+sum);
	            break;
	        }
		
	}

}
