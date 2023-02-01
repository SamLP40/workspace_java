//import java.lang.Character;
//import java.lang.String;
//import java.lang.Double;

public class TypeCharString {

	public static void main(String[] args) {
		 char a = 'a';
	     char b = 97;
	     char c = '\u0061';
	     char d = '\n';
	     char e = 'e';
	        
	     System.out.print( a + "->" +  b + "->" + '\t' + c + "-> \n" + d + "->" + e + "\n");  
	     System.out.println(Character.isLetter( a ));
	     
	     String firstName = "luke";
	     String lastName = "skywalker";
	     System.out.println(firstName.toLowerCase() + " " + lastName.toUpperCase());
	     java.lang.String fullName = firstName;
	     fullName += " " + lastName;
	     System.out.println(fullName);
	     
	     String intrus = firstName;
	     
	     if(intrus.equals("luke"))	System.out.println("les chaines sont �gales ! ");
	     else System.out.println("les chaines sont diff�rentes !");
	     
	     System.out.println(firstName == "luke");				
	     System.out.println(firstName == new String("luke"));	  
	     
	     if(lastName.length() > 0) {
	    	System.out.println(lastName.substring(3)); 
	     }	    	 
	     
	     // Types primitifs & conversion
	     String strPi = "3.14";
	     double value = java.lang.Double.parseDouble( strPi );
	     value *= 2;
	     String result = "pi * 2 = " + Double.toString(value);	
	     System.out.println(result);
	}
}

//NB : une cha�ne de caract�res apparaissant plusieurs fois dans un fichier de code Java sera stock�e dans le .class en un unique exemplaire