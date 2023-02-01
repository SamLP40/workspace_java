import java.util.Scanner;

public class ChoixEleve {

	public static void main (String[] args) {


		String[] ListEleve = {"Guillaume Anselme", "Dylan de Albuquerque", "Camille Gaschet", 
				"Ludovic Dupre", "Samuel Le Porcher", "Nicolas Wache", "Francois Supervielle"}; //Liste des étudiants
		double[][] notes= 
					{{10.5, 12, 14},
					{18, 15, 19},
					{11, 14, 14.5},
					{15, 12, 16},
					{9, 12, 13},
					{9, 13, 13},
					{10.5, 17, 15.5}}; // Liste des notes par étudiant
		String nomEleve = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Saisir nom/prénom de l'élève : ");
		nomEleve = scan.nextLine(); // Saisie de l'élève (nom/prénom)
		boolean isInTheList=false;
		for (int i=0;i<ListEleve.length;i++) { // Parcours du tableau (penser à mettre strictement inférieur à tableau.length sinon = exception)

			if (nomEleve.equalsIgnoreCase(ListEleve[i])) {
				System.out.println("Moyenne de l'élève : "+scores(notes[i])); // utilise la méthode scores pour retourner la moyenne des valeurs de notes[]
				isInTheList=true;
				break;
			} 
		}
		if (isInTheList==false)	{
			System.out.print(nomEleve+" n'est pas dans la liste");

		}
		scan.close();
	}
// Calcul de la moyenne des valeurs inscrites dans le tableau notes[]
	public static double scores(double[] notes) { // appel du tableau de notes initialisé dans le main

		double moy=0.0;
		
System.out.println("Notes :");

		for(int counter=0;counter < notes.length;counter++) {
			
			System.out.println(notes[counter]);
			moy+=notes[counter];
			
			}
		return Math.round(moy/notes.length); // Retourne la moyenne arrondie au dixième

	}
}