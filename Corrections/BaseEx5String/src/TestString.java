import java.util.Scanner;

/**
 * Ex 5.1 : Trouver plusieurs moyens de concat�ner 2 chaines de type String
 * 
 * Ex 5.2 : Programme qui dans une phrase donnée, indique si un mot saisi par l'utilisateur s'y trouve ou pas
 *  ex : "il fait beau aujourd'hui" -> mot recherché "beau" donc trouvé 
 *  
 * Ex 5.3 : Programme qui recherche une sous chaine dans une phrase et la remplace par une autre saisie au clavier
 *  ex : "il fait beau aujourd'hui" donne "il fait chaud aujourd'hui" 
 * 
 * @author El babili - 2023
 * 
 */

public class TestString {
	public static void main(String[] args) {
		//Ex 5.1
		String str1 = "bonjour";
		String str2 = "la promo";
		str1 += " " + str2;			//1er moyen de concat 2 chaines
		System.out.println(str1);
		
		str1 += new String(" ça va ?"); //2ème moyen
		System.out.println(str1);
		
		String str3 = String.join(str1," est-ce que vous êtes motivé ?"); //3ème moyen
		System.out.println(str3);
		
		//Pour l'optimisation, voir aussi StringBuffer et StringBuilder
		
		//Ex 5.2
		String str = "il fait beau aujourd'hui";
		System.out.println(str + "\n - quel mot recherchez vous ?");
		Scanner scan = new Scanner(System.in);
		String kb = scan.next();
		
		if(str.toLowerCase().contains(kb.toLowerCase()))	System.out.println(kb + " est bien dans la phrase");
		else System.out.println(kb + " n'est pas dans la phrase");
		
		//Ex 5.3
		System.out.println("par quel mot souhaitez vous remplacer le mot s'il existe ?");
		String replace = scan.next();
		if(str.toLowerCase().contains(kb.toLowerCase()))	{
			str = str.replace(kb, replace);
			System.out.println(str);
		}
				
		scan.close();					
	}
}
