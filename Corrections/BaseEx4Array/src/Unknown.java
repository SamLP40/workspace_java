/**
 * 4.5 : Algorithme de tri d'un tableau de nombres entiers
 * 
 * @author El babili - 2023
 * 
 */

public class Unknown {
	public static void main(String[] args) {
		int table[] = { -5, 2, -8, 31, 15, 4 };
		displayTab(table);
		fonction(table);
		displayTab(table);
	}
	
	static void fonction(int[] tab) {
		int tmp = 0;
		for (int i = 0; i < tab.length; i++) {
			for (int j = 1; j < (tab.length - i); j++) {
				if (tab[j - 1] > tab[j]) {					
					tmp = tab[j - 1];
					tab[j - 1] = tab[j];
					tab[j] = tmp;
				}
			}
		}
	}

	static void displayTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}
}
