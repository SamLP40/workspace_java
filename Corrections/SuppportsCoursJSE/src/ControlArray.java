import java.util.ArrayList;
import java.util.Scanner;

public class ControlArray {
	public static void main(String[] args) {
		 int [] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		 for(int i = 0 ; i < myArray.length ; i++)
			 System.out.print(myArray[i] + " ");
		 
		 //System.out.println(myArray[10]);
		 System.out.println();
		 
		 int [] array = new int[10];
		 for(int i = 0 ; i < array.length ; i++)
			 array[i] = i;
		 
		 String [] myStrings = { "monday","tuesday","happyday"};
		 for(String str : myStrings)	//équivalent du foreach
			 System.out.println(str);
		 
		 ArrayList<String> coll = new ArrayList<>();
	        coll.add( "lundi" );
	        coll.add( "mardi" );
	     System.out.println( coll.size() );
	     for (String string : coll) {
	         System.out.println( string );
	     }		 
	     
	     /*long counter = 0;
	     while(true) {
	    	 System.out.println(" ----> " + counter++);
	     }*/
	     
	     Scanner scan = new Scanner(System.in);	     
	     int val = scan.nextInt();		//saisi au clavier de 5
	     
	     switch(val) {
	     	case 0 : System.out.println("ok0");
	     	break;
	     	case 1 : System.out.println("ok1");
	     	break;
	     	case 5 : System.out.println("ok5");
	     	case 6 : System.out.println("ok6");
	     	default: System.out.println("ok default");
	     }
	     scan.close();
	}
}
