
public class Hello {

	public static void main(String[] args) {
		System.out.println(" " + 10 + 5);
		System.out.println(10 + 5);
		
		System.out.println((double)11 / 3);
		
		int value = 10; 
		System.out.println( ++value ); //incrémente value = value + 1 et l'affiche -> 11 
		System.out.println("value = " + value);
		  
		System.out.println( --value ); //décrémente value = value - 1 et l'affiche -> 10 
		System.out.println("value = " + value);
		  
		System.out.println( value++ ); //affiche puis incrémente -> 10
		System.out.println("value = " + value); // -> 11
		  
		System.out.println( value-- ); //affiche puis décrémente -> 11
	    System.out.println("value = " + value); // -> 10
	}
}
