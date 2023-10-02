package p1.s2023_1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inverted = inverter(sc.next());
		System.out.println(inverted);
		sc.close();
	}
	public static String inverter (String n) {
		char [] a = n.toCharArray();
		System.out.println(a.length);
		char [] x = new char [a.length];
		for(int i = 0; i < a.length ; i++) {
			x[i] = a[a.length - i];
		}
		String inverted = x.toString();
		return inverted;
	}

}
