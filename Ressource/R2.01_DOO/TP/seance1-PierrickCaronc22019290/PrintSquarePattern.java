public class PrintSquarePattern {
	public static void ligneEntiere(int taille) {
		for(int ligne = 0; ligne < taille; ++ligne) {
			System.out.print("* ");
		}
			System.out.println();
	}
	public static void main(String [] a) {
		final int taille = Integer.valueOf(a[0]);
		ligneEntiere(taille);
		for(int numLigne = 0; numLigne < taille; ++numLigne) {
			System.out.print("* ");
			for(int numCologne = 1; numCologne < taille-1; ++numCologne) {
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
		ligneEntiere(taille);
	}
}

