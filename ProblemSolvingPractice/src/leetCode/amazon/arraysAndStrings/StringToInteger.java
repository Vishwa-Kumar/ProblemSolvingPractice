package leetCode.amazon.arraysAndStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringToInteger obj = new StringToInteger();
		System.out.println(Pattern.matches("[-|+|0-9]", "1"));

		Integer.parseInt("999999999");
		System.out.println(obj.myAtoi("  0000000000012345678"));

	}

	  public int myAtoi(String str) {
	        
	        Set<Integer> set = Stream.of(0,1,2,3,4,5,6,7,8,9)
	         .collect(Collectors.toCollection(HashSet::new));
	        
	        if(str.isEmpty())
	            return 0;
	        List<Integer> result = new ArrayList<>();
	        int index = 0;
	        int len = str.length();
	        while (index < len && str.charAt(index) == ' ') {
	                index++;
	        }
	        
	        if (index < len && (str.charAt(index) != '-' && str.charAt(index) != '+') && !set.contains(Character.getNumericValue(str.charAt(index))))
	            return 0;
	        
	        int sign = 1;
	        if(index < len && (str.charAt(index) == '-' || str.charAt(index) == '+')){
	            if(str.charAt(index) == '-')
	                sign = -1;
	            index++;
	        }
	        while(index < len && Character.getNumericValue(str.charAt(index)) == 0)
	            index++;
	        
	        while(index < len && set.contains(Character.getNumericValue(str.charAt(index)))){
	            result.add(Character.getNumericValue(str.charAt(index)));
	            index++;
	        }
	        int length = result.size();
	        if(length > 10)
	        {
	            if(sign > 0)
	                return Integer.MAX_VALUE;
	            return Integer.MIN_VALUE;
	        }
	        
	        
	        long ten = 1;
	        long res = 0;
	        for(int i = length-1; i>=0; i--){
	            int val = result.get(i);
	            res = (long)val * ten + res;
	            ten = ten * 10;
	        }
	        res = res * sign;
	        
	        if(res > Integer.MAX_VALUE)
	            return Integer.MAX_VALUE;
	        
	        if(res < Integer.MIN_VALUE)
	            return Integer.MIN_VALUE;
	        
	        return (int)res;
	    }
}
