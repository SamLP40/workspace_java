
public class Hello {

	public static void main(String[] args) {
		System.out.println(" " + 10 + 5);
		System.out.println(10 + 5);
		
		System.out.println((double)11 / 3);
		
		int value = 10; 
		System.out.println( ++value ); //incr�mente value = value + 1 et l'affiche -> 11 
		System.out.println("value = " + value);
		  
		System.out.println( --value ); //d�cr�mente value = value - 1 et l'affiche -> 10 
		System.out.println("value = " + value);
		  
		System.out.println( value++ ); //affiche puis incr�mente -> 10
		System.out.println("value = " + value); // -> 11
		  
		System.out.println( value-- ); //affiche puis d�cr�mente -> 11
	    System.out.println("value = " + value); // -> 10
	}
}
