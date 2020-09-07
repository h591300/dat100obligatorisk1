package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class NFakultet {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("Heltal:"));
		int i = 1;
		int tall = n;
		long ganger = 1;	//long > int
		if (n >= 0) {
			while (n>1) {
				int sum = n*i;
				n -= 1;
				ganger = ganger *sum;
			}
			showMessageDialog(null, tall+"! = "+ ganger);
		} else {
			showMessageDialog(null,"Skriv inn et positivt tall!");
		}
	}

}