/**
 * TP1 Game
 * Programme demande à l'utilisateur s'il souhaite jouer à notre jeu, 
 * si non alors sortir du programme, si oui, alors propose de saisir un chiffre entre 1 et 100 
 * puis précise à chaque itération si le chiffre est plus petit ou plus grand. 
 * Une fois le chiffre trouver, affiche le message : vous avez trouvé en x coups
 * 
 * @author El babili - ${year}
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class Game {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Bonjour souhaitez vous jouer à mon jeu O/N?");	
		String str = scan.next();
		while(str.equalsIgnoreCase("oui") || str.equalsIgnoreCase("o")){
			int nbAleatoire = (int)(Math.random()*100) + 1;
			System.out.println(nbAleatoire);
			int counter = 1, val = 0;
			System.out.println("saisissez une valeur comprise entre 1 et 100");
			while(val != nbAleatoire){				
				val = scan.nextInt();
				if( val > nbAleatoire)		System.out.println("saisissez une valeur plus petite");
				else if( val < nbAleatoire)	System.out.println("saisissez une valeur plus grande");
				else System.out.printf("vous avez trouvé en %d coups \n", counter); 
				counter++;
			}
			System.out.println("Voulez vous rejouer ?");
			str = scan.next();
		};
		System.out.println("au revoir");	
		scan.close();
	}
}
