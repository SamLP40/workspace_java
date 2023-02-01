import java.util.Scanner;
import java.lang.Math;
public class Game {
	//Insertion du random dans le jeu via une pseudo-classe
	static int mathRandom() {
		double rand = Math.random()*100+1;
		int nbrand = (int)rand; // Transfert du contenu de rand dans une variable de stockage (convertie en int)
		return nbrand; // Pour renvoyer au système le nombre choisi pour qu'il soit stocké
	}

	public static void main (String[] args) {

		int number=mathRandom(); // Utilisation du contenu de la pseudo-méthode dans la variable number pour générer le nombre aléatoire
		int testedNumber; // Valeur que doit saisir l'utilisateur
		int numberTry=1; // Nombre d'essais qui seront comptabilisés
		String play = "Oui"; // Entrée qui doit déterminer si le programme se lance.
		// On considère par défaut que l'utilisateur veut jouer.
		Scanner s = new Scanner(System.in);
		System.out.println("Voulez vous jouer ?");
		play = s.next(); // Choix de l'utilisateur
		// Oui : une partie est générée
		// Boucle à répéter tant que l'on joue
		while (play.equals("Oui")) {
			System.out.println ("Tapez votre nombre :");
			testedNumber = s.nextInt();
			// L'interface indique si c'est plus ou moins, et redemande tant que l'on a pas trouvé.
			while(testedNumber != number) {
				System.out.println((number > testedNumber)? "C'est Plus" : "C'est Moins");
				System.out.println ("Tapez votre nombre :");
				numberTry++;
				testedNumber = s.nextInt();	// Nouvelle saisie
			}
			if(number == testedNumber) { System.out.println("Vous avez trouvé en " +numberTry+ " coups \nVoulez vous rejouer ?"); 
			play= s.next(); // Fin de la boucle, la partie s'arrête et le programme demande si on veut rejouer.		
			}
			s.close();		}		
	}
}