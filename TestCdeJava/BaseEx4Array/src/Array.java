import java.util.Arrays;
import java.lang.Math;

public class Array {
// méthode permettant de calculer la moyenne/écart-type
	public static double stdev(int[] list){
	        double sum = 0.0;
	        double mean = 0.0;
	        double num=0.0;
	        double numi = 0.0;

	        for (int i : list) {
	            sum+=i;
	        }
	        mean = sum/list.length; //Calcul de la moyenne

	        for (int i : list) {  // Calcul en fonction du nombre de valeurs du tableau
	            numi = Math.pow(((double) i - mean), 2);
	            num+=numi; // Calcul de l'écart-type
	        }

	        return Math.sqrt(num/list.length); // Retourne la moyenne et l'écart-type
		
		
	}
	
	public static void main (int[] array) {
		
		int[] notes= {16, 12, 4, 12, 6, 9, 1, 13, 17, 15, 8, 11}; // Déclaration du tableau et des valeurs
		int i=0;
		
		for (i=0;i<notes.length;i++); // Valeurs parcourues par i
	
		System.out.println(notes);
	}
}