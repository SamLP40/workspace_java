/**
 * 5.4 : Programme lit une chaîne et indique si c'est un palindrome ex : akka, otto sont des palindromes 
 * 5.5 : Gestion des phrases qui sont des palindromes : "Elu par cette crapule"
 * 
 * @author El babili - 2023
 * 
 */

public class Palindrome {	
	public static void main(String[] args) {	
		String palin [] = { "a","+aya+","kayak","-kk-","ELU par cette crapule","toto","ottO","a++a","sos" };
		for(String str : palin) {
			if(isPalindrome(str))	System.out.println(str + " est un palindrome");
			else System.out.println(str + " n'est pas un palindrome");
		}
	}
	
	public static boolean isPalindrome(String str) {	
		str = str.replaceAll(" ", "");
		if(!isLetters(str)) return false;
		StringBuilder strb = new StringBuilder(str);
		String strInverse = strb.reverse().toString();
		return str.equalsIgnoreCase(strInverse) ? true : false;
	}
	
	public static boolean isLetters(String str) {		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i)) == false)
				return false;
		}
		return true;
	}
}
