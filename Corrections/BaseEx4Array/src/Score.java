/**
 * Ex 4.1 : Parcourir un tableau contenant des notes, écrire la note la plus petite, la plus grande et la moyenne 
 * 
 * @author El babili - ${year}
 * 
 */

public class Score {
	public static void main(String[] args) {
		double [] scores = { 10,13,17,20,8.5};
		
		displayScores(scores);
		System.out.println();
		
		System.out.println("Max = " + maxScores(scores));
		System.out.println("Min = " + minScores(scores));
		System.out.println("Moy = " + averageScores(scores));		
	}
	
	public static void displayScores(double [] scores) {
		for(double n : scores)	System.out.print(n + "  ");
	}

	public static double maxScores(double [] scores) {
		double max = scores[0];
		for(int i = 1 ; i < scores.length ; i++) {
			if(max < scores[i])
				max = scores[i];
		}
		return max;
	}
	public static double minScores(double [] scores) {
		double min = scores[0];
		for(int i = 1 ; i < scores.length ; i++) {
			if(min > scores[i])
				min = scores[i];
		}
		return min;
	}
	public static double averageScores(double [] scores) {
		double moy = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			moy += scores[i];
		}
		return moy/scores.length;
	}
}
