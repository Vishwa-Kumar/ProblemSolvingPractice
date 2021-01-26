import java.util.HashMap;

public class Decoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String word="Glance";
	System.out.println(decode(word.toUpperCase()));

	}

	public static String decode(String word) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('A', 1);
		hm.put('B', 2);
		hm.put('C', 3);
		hm.put('D', 4);
		hm.put('E', 5);
		hm.put('F', 6);
		hm.put('G', 7);
		hm.put('H', 8);
		hm.put('I', 9);

		String output = "";
		boolean startWord = true;

		for (Character c : word.toCharArray()) {
			System.out.println("char " + c);
			if (hm.containsKey(c)) {
				if (startWord) {
					output = output + "0" + hm.get(c);
					startWord = false;
				} else {
					output = output + "-0" + hm.get(c);
				}

			} else {
				if (startWord) {
					output += "" + c + "";
					startWord = false;
				} else {
					output += "-" + c + "";
				}

			}

		}
		
		return output;
	}

}
