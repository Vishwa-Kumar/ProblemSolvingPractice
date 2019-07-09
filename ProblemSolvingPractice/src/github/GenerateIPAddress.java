package github;

import java.util.ArrayList;
import java.util.List;

public class GenerateIPAddress {

	List<String> ipAddressList = new ArrayList<>();

	public static void main(String[] args) {

		GenerateIPAddress obj = new GenerateIPAddress();
		obj.generateIPAddressessUtil("6503562");
		System.out.println("in list " + obj.ipAddressList.size());

		for (String str : obj.ipAddressList) {
			System.out.println("list :" + str);
		}

	}

	public void generateIPAddressessUtil(String str) {
		generateIPAddressess(str, 0, "");
	}

	private void generateIPAddressess(String str, int index, String partialRes) {

		String newAddition = "";
		if (str.length() == 0 & index == 4) {
			ipAddressList.add(partialRes);
		}

		for (int i = 1; i <= str.length(); i++) {
			newAddition = str.substring(0, i);
			int j = 0;
			while (j < newAddition.length() - 1) {
				if (newAddition.charAt(j) == '0') {
					newAddition = newAddition.substring(j + 1);
				}

				j++;
			}
			int newAdd = Integer.parseInt(newAddition);
			if (newAdd > 256) {
				break;

			}
			generateIPAddressess(str.substring(i), index + 1, partialRes + "." + newAddition);

			System.out.println("partialRes ::" + newAddition);
		}
	}

	
}
