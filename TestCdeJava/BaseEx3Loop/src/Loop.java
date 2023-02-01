import java.lang.reflect.Array;
public class Loop {

	public static void main (String[] args) {
		
			for(int i=0;i<args.length; i++) { 
				System.out.println(args[i]); /* On reprend le tableau, et on répète le nombre d'arguments
				en fonction de ce qui est tapé dans config > arguments 
				Pour insérer des arguments dans le tableau = run > run config > arguments*/
			Array.get(args, i); // Pour récupérer les arguments du tableau
		
			/* Il manque encore une étape pour faire en sorte de lire les arguments du tableau, 
			 * et déterminer leur parité et leur valeur (négative/positive ou nulle) */
				if (i<args.length) System.out.println(args[i]);
				if (i >= 1) System.out.println("Le nombre entré est positif");
				else if(i <= -1) System.out.println("Le nombre entré est négatif"); 
				else if (i==0) System.out.println("Le nombre est égal à 0");
				if (i % 2 ==0) System.out.println("Le nombre entré est pair");
				else if(i % 2 != 0) System.out.println("Le nombre entré est impair");
			 
	}
	}
}