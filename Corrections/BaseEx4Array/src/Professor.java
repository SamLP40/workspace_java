import java.util.Scanner;

/**
 * 4.2 : Programme demande à l'utilisateur ici un professeur, de saisir les notes d'un élève, 
 * une fois fini, affiche nom et prénom de l'élève + moyenne, l'action est répété autant de fois qu'il y a d'élèves 
 * 
 * @author El babili - 2023
 * 
 */

public class Professor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String response = "o";		
		System.out.println("Souhaitez vous saisir les notes d'un élèves O/N ?");	
		response = scan.nextLine();
		
		while(response.equalsIgnoreCase("o")){
			System.out.println("saisir nom : ");		
			String lastName = scan.nextLine();
			System.out.println("saisir prénom : ");
			String firstName = scan.nextLine();				
			System.out.println(lastName + " " + firstName + " / moyenne : " + enterScores(scan));
			System.out.print("souhaitez vous saisir les notes d'un autre élève O/N ?");
			response = scan.next();
			scan.nextLine();	//afin de vider le buffer restant contenant un retour à la ligne
		}		
		System.out.println("au revoir professeur");		
		scan.close();		
	}
	
	public static double enterScores(Scanner scan) {
		double moy = 0;
		int counter = 0;
		
		System.out.println("Saisissez chaque note suivie par la touche entrée,"
				+ " lorsque vous avez fini taper stop puis entrée ");
		while(scan.hasNext()) {			 
			if(scan.hasNextDouble()) {		// Exemple de saisie : 15,5 surtout pas 15.5 !		
				moy += scan.nextDouble();
				counter ++;
			}
			else {
				scan.next();	
				break;
			}
		}		
		return moy/counter;		
	}
}
