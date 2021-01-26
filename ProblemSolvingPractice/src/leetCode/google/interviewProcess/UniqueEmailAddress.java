package leetCode.google.interviewProcess;

import java.util.HashSet;

public class UniqueEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueEmailAddress obj = new UniqueEmailAddress();
		String[] email = new String[] { "test.email+alex@leetcode.com", "test.email@leetcode.com" };

		// ["test.email+alex@leetcode.com", "test.email@leetcode.com"]
		System.out.println(obj.numUniqueEmails(email));

	}

	// my solution leetcode
	public int numUniqueEmails(String[] emails) {
		String nonDomain = "";
		String domain = "";
		String uniqueEmail;
		HashSet<String> hs = new HashSet<String>();
		for (String s : emails) {
			int nonDomainLastindex = (s.contains("+") ? s.indexOf("+") : s.indexOf("@"));
			nonDomain = s.substring(0, nonDomainLastindex);
			System.out.println("nonDomain   " + nonDomain);
			nonDomain = nonDomain.replace(".", "");
			domain = s.substring(s.indexOf("@"));
			uniqueEmail = nonDomain + domain;
			hs.add(uniqueEmail);
		}
		return hs.size();
	}
// best solution in leetcode
//	class Solution {
//	    public int numUniqueEmails(String[] emails) {
//	        Set<String> uniqueEmails = new HashSet<>();
//	        
//	        for (int i = 0; i < emails.length; i++) {
//	            String canonical = toCanonical(emails[i]);
//	            uniqueEmails.add(canonical);
//	        }
//	        
//	        return uniqueEmails.size();
//	    }
//	    
//	    private String toCanonical(String email) {
//	        char[] canonical = new char[email.length()];
//	        int write_pos = 0;
//	        int read_pos = 0;
//	        char c = 0;
//	        
//	        while ((c = email.charAt(read_pos)) != '@') {
//	            if (c == '.') { 
//	                // Skip this char 
//	            } else if (c == '+') { 
//	                break; 
//	            } else {
//	                canonical[write_pos++] = c;            
//	            }
//	            read_pos++;
//	        }
//	        
//	        while ((c = email.charAt(read_pos)) != '@') {
//	            read_pos++;
//	        }
//	        
//	        while (read_pos < email.length()) {
//	            c = email.charAt(read_pos);
//	            canonical[write_pos++] = c;
//	            read_pos++;
//	        }
//	        
//	        return new String(canonical, 0, write_pos);
//	    }
//	}

}
