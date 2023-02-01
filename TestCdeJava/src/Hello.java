import java.util.Scanner;
public class Hello {
	public static void main (String[] args) {
		System.out.println("bonjour et bienvenue. \n Saisissez votre nom:");

		Scanner nom = new Scanner(System.in); /* Allocation d'une case mémoire pour insérer le nom.*/
			String name = nom.next(); /* Création de la variable locale nom qui va servir à entrer le nom. */
				System.out.println("salut " + name); /* Le système renvoie le texte "salut [name]" */
				String firstName = nom.next(); /* Idem pour le prénom */
				System.out.println("salut " + firstName);
	nom.close(); /* Fermeture de la boucle */
		}
	}
