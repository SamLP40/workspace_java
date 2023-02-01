import java.util.Scanner;

public class SaisieNotes {

	public static void main (String[] args) {
		// Paramètres à saisir par le professeur (et calcul de la moyenne des valeurs saisies)
		String nomEleve = ""; 
		String prenomEleve = "";
		String saisieNote = "Oui";
		Scanner scan = new Scanner(System.in);
		while(saisieNote.equalsIgnoreCase("Oui")) {

			System.out.println("Veuillez saisir le nom de l'élève : "); // Ajout de paramètres en fonction des besoins
			nomEleve= scan.nextLine();
			System.out.println("\nSaisissez le prénom :");
			prenomEleve= scan.nextLine();
			System.out.println("\nSaisissez les notes de l'élève : ");
			 // faire une boucle proposant au professeur de saisir autant de notes qu'il souhaite pour un élève donné
			// Stocker les notes saisies dans une variable (somme de toutes les notes saisies) pour que le calcul se fasse automatiquement = créer une sous-méthode
			System.out.println(nomEleve +" " + prenomEleve+" "+scores(scan)); // affiche la moyenne des notes
			System.out.println("Ajouter un élève ?"); // Pour calculer la moyenne je vais avoir besoin de connaître la somme des notes / nb de notes
			saisieNote=scan.next();
			scan.nextLine(); // Pour éviter de sauter une ligne si on relance
			
		}
		System.out.println("Au revoir.");
		scan.close();
	} 
	// Méthode permettant d'effectuer la moyenne et de la stocker pour l'afficher.
	public static double scores(Scanner scan) {

		int counter=0;
		double moy=0.0;

		while(scan.hasNext()) {
			if (scan.hasNextDouble()) {
				moy += scan.nextDouble();
				counter++;
			}else {
				scan.next();
				break;
			}
		}
		return Math.round(moy/counter);
	}
}