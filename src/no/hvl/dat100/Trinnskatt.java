package no.hvl.dat100;

public class Trinnskatt {

	public static void main(String[] args) {
		// lese inn bruttoinntekt, beregne + skrive ut trinnskatt
		double inndata = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Brutto inntekt:"));

		double trinn1 = 164101;
		double trinn2 = 230951;
		double trinn3 = 580651;
		double trinn4 = 934051;

		if (inndata >= trinn4) {
			System.out.println("Trinnskatten er " + inndata / 100 * 14.52 + "kr.");
		} else {
			if (inndata >= trinn3) {
				System.out.println("Trinnskatten er " + inndata / 100 * 11.52 + "kr.");
			} else {
				if (inndata >= trinn2) {
					System.out.println("Trinnskatten er " + inndata / 100 * 2.41 + "kr.");
				} else {
					if (inndata >= trinn1) {
						System.out.println("Trinnskatten er " + inndata / 100 * 0.93 + "kr.");
					}
				}
			}
		}

	}

}
