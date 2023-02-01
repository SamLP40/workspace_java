import java.util.Scanner;
public class TestJava {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in); /* Allocation mémoire */
		double numberselect = scan.nextDouble(); /* Le contenu ajouté est de type nombre à virgule (double) */
		double number = numberselect; //

				if(number >= 1) System.out.println("Le nombre entré est positif"); /* Cas où le nombre entré est positif */
				else if(number <= -1) System.out.println("Le nombre entré est négatif"); /* Cas où le nombre est négatif */
				else if (number==0) System.out.println("Le nombre est égal à 0"); /* Cas où l'on tape 0. */
				if (number % 2 ==0) System.out.println("Le nombre entré est pair"); /* Vérification de la parité */
				else if(number % 2 != 0) System.out.println("Le nombre entré est impair");
			}

	}

/* Exercice 2.3 (réponse) : Si l'on entre une valeur inattendue par le programme, cela génère une exception.
Pour remédier au problème, on peut utiliser un morceau de code qui identifie et indique les exceptions en java.
On peut également prévenir cette exception en indiquant à l'utilisateur de retaper quelque chose. 

Exercice 3.2 (réponse) : on obtient également une exception puisque l'on a tapé une valeur que le programme
ne peut pas identifier.

Pour régler ce problème, il est possible d'utiliser la fonction try{ / catch{, finally{ pour identifier
l'erreur via l'éditeur de code. 

Dans le cadre de cette semaine, on préférera utiliser la méthode isDigit(); pour détecter les caractères non entiers.*/
 