import java.util.HashMap;
import java.util.Scanner;

/**
 * Ex 4.3 : Programme consiste à parcourir un tableau d'élèves et d'indiquer s'il contient tel élève ou pas
 * puis d'afficher ses notes et sa moyenne
 * 
 * @author El babili - 2023
 * 
 */

public class Student {	
	public static void main(String[] args) {
		HashMap<String, double[]> studentsScores = new HashMap<String, double[]>();
		double [] aymene = {12.5 , 15 , 18.5 , 10};
		studentsScores.put("aymene el babili", aymene);
		
		double [] maryam = {15.5 , 17 , 13 , 20};
		studentsScores.put("maryam ezzaouia", maryam);
		
		double [] chloé = {14.5 , 16 , 15.5 , 11};
		studentsScores.put("chloé dupont", chloé);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bonjour veuillez saisir l'élève recherché :");
		String student = scan.nextLine();
		scan.close();
		
		if(studentsScores.containsKey(student)) {
			double [] studNotes = studentsScores.get(student);
			Score.displayScores(studNotes);	
			System.out.println("\nmoyenne : " + Score.averageScores(studNotes));
		}
		else System.out.println("élève non présent");
	}
}
