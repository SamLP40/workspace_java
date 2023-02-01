import java.util.Scanner;

public class PositiveNegative {
	
	public static boolean posNeg(int n) {
		if(n >= 0) return true;
		else return false; 
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	     
	    int val = scan.nextInt();	
	    
	    System.out.println(posNeg(val));
	    
	    //if(val >= 0) System.out.println("positif");
	    //else System.out.println("negatif");
	    
	    scan.close();
	}
}
