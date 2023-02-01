import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Ex 4.4 : Programme qui va afficher une liste de prénoms d'une classe,
 * puis trier dans l'odre décroissant et l'afficher
 * enfin dans l'ordre croissant et l'afficher
 * 
 * @author El babili - 2023
 * 
 */

public class TriStudents {
	public static void main(String[] args) {
		ArrayList<String> promo = new ArrayList<String>();
		
		promo.add("luke");
		promo.add("chubaka");
		promo.add("6po");
		promo.add("r2d2");
		promo.add("han");
		promo.add("yoda");
		promo.add("anakin");
		
		System.out.println(promo);
		
		promo.sort(null);		// c'est ici que s'opère le tri décroissant
		System.out.println(promo);
		
		promo.sort(Collections.reverseOrder()); // tri croissant
		System.out.println(promo);
	}
}
