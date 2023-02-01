import java.util.Scanner;
import java.lang.Math;
public class Game {
/* étapes :
 * 
 *  2.1 si non = terminer le programme 
 *  2.3.3 si le nombre est le bon, terminer le programme et revenir au départ
 * */
	
//Insertion du random dans le jeu via une pseudo-classe
	static int mathRandom() {
		double rand = Math.random()*100;
		int nbrand = (int)rand; // Transfert du contenu de rand dans une variable de stockage (convertie en int)
		return nbrand; // Pour renvoyer au système le nombre choisi pour qu'il soit stocké
	}
    
	public static void main (String[] args) {
        
        int number=mathRandom(); // Utilisation du contenu de la pseudo-classe dans la variable number pour générer le nombre aléatoire
        int testedNumber; // Valeur que doit saisir l'utilisateur
		String play = "Oui" + "Non"; // Entrée qui doit déterminer si le programme se lance.
		boolean isPlaying=true; // On considère par défaut que l'utilisateur veut jouer.

		Scanner s = new Scanner(System.in);
			System.out.println("Voulez vous jouer ?");
			s.next(); // Choix de l'utilisateur
			if (play=="Non") isPlaying=false; // Non : la partie s'arrête.
			else if (isPlaying=true); // Oui : une partie est générée
			// Boucle à répéter tant que l'on joue
				while (isPlaying==true) {
					System.out.println ("Tapez votre nombre :");
					testedNumber = s.nextInt();
			// L'interface indique si c'est plus ou moins, et redemande tant que l'on a pas trouvé.
					while(testedNumber != number) {
				
						System.out.println((number > testedNumber)? "C'est plus" : "C'est Moins");
						System.out.println ("Tapez votre nombre :");
						testedNumber = s.nextInt();	// Nouvelle saisie
						if(number == testedNumber) System.out.println("Vous avez trouvé"); 
						isPlaying=false; // Fin de la boucle, la partie s'arrête.
			}
			}
s.close();				
	}
}