/**
 * Ex 4.3 : Programme consiste à parcourir un tableau d'élèves et d'indiquer s'il contient tel élève ou pas
 * puis d'afficher ses notes et sa moyenne version avec tableau
 * 
 * @author El babili - 2023
 * 
 */

import java.util.Scanner;

public class Etudiant {
	public static void main(String[] args) {		
		String [] students = {"aymene",
								"maryam",
								"chloé"};		
		double [][] scores = { 
				{12.5 , 15 , 18.5 , 10},
				{15.5 , 17 , 13 , 20},
				{14.5 , 16 , 15.5 , 11}
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bonjour veuillez saisir l'élève recherché :");
		String student = scan.next();
		scan.close();
		
		int pos=-1;
		for(int i=0 ; i<students.length ;i++) {
			if(students[i].equalsIgnoreCase(student)) {
				pos = i;
				break;
			}				
		}
		
		if(pos != -1) {
			Score.displayScores(scores[pos]);
			System.out.println("\nmoyenne : " + Score.averageScores(scores[pos]));
		}
		else System.out.println("élève non présent");
	}
}
