package leetCode.google.interviewProcess;

import java.util.Arrays;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplyStrings multiplyStrings = new MultiplyStrings();
		String num1 = "123";
		String num2 = "456";
		System.out.println(multiplyStrings.multiply(num1, num2));

	}

	public String multiply(String num1, String num2) {

		int size1 = num1.length();
		int size2 = num2.length();
		int[] temp = new int[(size1 * size2) + 1];
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				int a = Integer.valueOf(String.valueOf(num1.charAt(size1 - 1 - i)));
				int b = Integer.valueOf(String.valueOf(num2.charAt(size2 - 1 - j)));
				temp[i + j] += a * b;
			}
		}
		System.out.println(Arrays.toString(temp));

		int[] copy = new int[(size1 * size2) + 1];
		int carry = 0;
		for (int i = 0; i < size1 * size2 + 1; i++) {
			int sum = carry + temp[i];
			copy[i] = sum % 10;
			carry = sum / 10;
		}
		System.out.println(Arrays.toString(copy));
		
		
		StringBuilder sb=new StringBuilder();
		int start;
		for( start=copy.length-1;start>0;start--)
		{
			if(copy[start]!=0)
			{
				break;
			}
		}
		
		for(int i=start;i>=0;i--)
		{
			sb.append(copy[i]+"");
			
		}
		
		if(sb.toString().equals(""))
		{
			return "0";
		}
		return sb.toString();
	}

}
