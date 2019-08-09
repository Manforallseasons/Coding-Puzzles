package morseDecoder;
import java.util.*; 
import java.util.Scanner;

public class Decoder {
	public static void main(String args[]) { 
		Scanner myObj = new Scanner(System.in);
		Map<String, String> map=new HashMap<String, String>();
		map.put(".-","A");
		map.put("-...","B");
		map.put("-.-.","C");
		map.put("-..","D");
		map.put(".","E");
		map.put("..-.","F");
		map.put("--.","G");
		map.put("....","H");
		map.put("..","I");
		map.put(".---","J");
		map.put("-.-","K");
		map.put(".-..","L");
		map.put("--","M");
		map.put("-.","N");
		map.put("---","O");
		map.put(".--.","P");
		map.put("--.-","Q");
		map.put(".-.","R");
		map.put("...","S");
		map.put("-","T");
		map.put("..-","U");
		map.put("...-","V");
		map.put(".--","W");
		map.put("-..-","X");
		map.put("-.--","Y");
		map.put("--..","Z");
		
		System.out.println("Enter Input");
		String input = myObj.nextLine();
		String[] array = input.split(" ");
		String product = "";
		for (String s: array) {
			if (map.containsKey(s)){
				product += map.get(s);
			}
			if (s.equals("!")) {
				product += " ";
			}
		}
		System.out.println(product);
	   }
	
}
