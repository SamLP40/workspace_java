
public class TypeOperator {
	public static void main(String[] args) {
		int counter = 5;       
        String name;
        name = "nina";
        double pi;
        int x = 10 , y = 5;
        
        pi = 3.1415;            
        
        System.out.println( counter );
        System.out.println( name );
        System.out.println( pi );
        System.out.println( x + y);
        System.out.println( "x = " + x + " y = "+ y  );        
        
        //----------------------après les variables, voici les opérateurs arithmétiques
        int firstValue = 11;
        int secondValue = 3;
        int div = firstValue / secondValue;
        int rest = firstValue % secondValue;
    
        int computedValue = div * secondValue + rest;
        System.out.println( "11 / 3 == " + div );                      
        System.out.println( "11 % 3 == " + rest + '\n');                     
        System.out.println( "computedValue == " +  computedValue ); 
        
        /*------------------ opérateurs de
         					 comparaisons---------------*/
        boolean firstBoolean = true;
        boolean secondBoolean = false;
        
        if(firstBoolean == secondBoolean)	System.out.println("les booléens sont identiques");
        else if(firstBoolean != secondBoolean)	System.out.println("les booléens ne sont pas les mêmes");
        
        if(firstBoolean == true && secondBoolean == false)	System.out.println("c'est cool");
        
        if(firstBoolean == true || secondBoolean == true)	System.out.println("c'est super cool");
        
        //----------------- opérateur post ou préfixé
        int value = 10;                                         
        System.out.println( ++value );        
        System.out.println( --value );    
        System.out.println( value++ );        
        System.out.println( value-- );        
	}
}
