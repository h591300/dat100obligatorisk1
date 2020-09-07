package no.hvl.dat100;

public class Karakterskala {
	static int feildata = 0;

	public static void main(String[] args) {

		int s = 100;
		int a = 90;
		int b = 80;
		int c = 60;
		int d = 50;
		int e = 40;
		int f = 0;

		for (int antStud = 10; antStud > 0; antStud -= 1) {
			int inndata = inn(null);
			if (inndata > s || inndata < f) {
				System.out.println("SKRIV INN EIN GYLDIG POENGSUM, SKRIV INN PÅ NYTT!");
				++antStud;
				++feildata;
			} else {
				if (inndata >= a && inndata <= s) {
					System.out.println("A");
				} else {
					if (inndata >= b && inndata <= a) {
						System.out.println("B");
					} else {
						if (inndata >= c && inndata <= b) {
							System.out.println("C");
						} else {
							if (inndata >= d && inndata <= c) {
								System.out.println("D");
							} else {
								if (inndata >= e && inndata <= d) {
									System.out.println("E");
								} else {
									if (inndata >= f && inndata <= e) {
										System.out.println("STRYK");
									} else {

									}
								}
							}
						}
					}
				}
			}
		}
	}

	private static int inn(String[] args) {
		if (feildata >= 1) {
			int innput = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Skriv inn poengsum i heltall på nytt"));
			--feildata;
			return innput;
		} else {
			int innput = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Skriv inn poengsum i heltall"));
			return innput;
		}
	}
}
