package p1.s2023_1;

import java.util.Scanner;


public class Questao2 {
	private static final int READ_LIMIT = 1000;
	public static void main(String[] args) {
		boolean stopRequested = false;
		int readCount = 0;
		double totalWeight = 0;
		Scanner scan = new Scanner(System.in);
		
		while(stopRequested != true && readCount < READ_LIMIT) {
			System.out.println("Insira uma string no formato nome#peso#altura");
			System.out.println("para finalizar o programa digite: finalizar");
			String s = scan.next();
			if(stopTest(s) == false) {
				if (s.contains("#") == false) continue;
				String[] a = s.split("#");
				System.out.println(s.toCharArray());
				Double weight = Double.parseDouble(a[1]);
				totalWeight += weight;
				readCount ++;				
			}
			else {
				stopRequested = true;
			}
		}
		System.out.println("A media dos pesos eh: " + (totalWeight/readCount));
		scan.close();
	}
	
	public static boolean stopTest(String s) {
		return (s.equalsIgnoreCase("finalizar"));
	}
}
