import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Tri {

	public static void main (String[] args) {
		
		String[] ListEleve = {"Guillaume Anselme", "Dylan de Albuquerque", "Camille Gaschet", 
				"Ludovic Dupre", "Samuel Le Porcher", "Nicolas Wache", "Francois Supervielle"}; //Liste des étudiants
			Arrays.sort(ListEleve);
			System.out.println(Arrays.toString(ListEleve));	 // Liste triée dans l'ordre croissant

			ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(ListEleve)); // Conversion du tableau string en collection
			Collections.reverse(list2); // Liste triée dans l'ordre décroissant
			System.out.println(list2);
			
	}
}
	/* Ex 4.5
	 * 
	 *  Les chiffres disposés dans le tableau d'entiers Table seront réorganisés.
	 *  
	 *  Un tableau est initialisé, et se sert de deux méthodes qui vont servir à le modifier : displayTab et fonction.
	 *  
	 *  La méthode displayTab(); sert simplement à afficher les valeurs du tableau avant et après l'utilisation de la méthode fonction();
	 *  
	 *  La méthode fonction(); va venir mélanger ces valeurs, en déplaçant le contenu de case en case comme ceci :
	 *  
	 *  	static void fonction(int[] tab) {
				int tmp = 0; (init)
				for (int i = 0; i < tab.length; i++) {           (début boucle 1 qui effectue le tour du tableau)
					for (int j = 1; j < (tab.length - i); j++) { (début boucle 2 qui va mélanger les valeurs)
						if (tab[j - 1] > tab[j]) {		         (si la valeur précédente est supérieure à la valeur pointée par j)			
							tmp = tab[j - 1];                    (tmp stocke la valeur précédente)
							tab[j - 1] = tab[j];                 (la valeur précédente reçoit la valeur suivante)
							tab[j] = tmp;                        (la valeur pointée par j prend donc la valeur précédente, les valeurs sont inversées)
						}                                        (le processus se répète tant que la boucle se répète)*/
