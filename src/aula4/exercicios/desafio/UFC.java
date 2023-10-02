package aula4.exercicios.desafio;

import java.util.Scanner;

public class UFC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Lutador [] lutadores = new Lutador[10];
		for(int i = 0; i < lutadores.length ; i++) {
			System.out.println("insira o nome do lutador" + i);
			String nome = scan.nextLine();
			System.out.println("insira o peso do lutador" + i);
			double peso = scan.nextDouble();
			System.out.println("Insira a idade do lutador" + i);
			int idade = scan.nextInt();
			if(peso <= 120.2 && peso > 93.0) {
				lutadores[i] = new PesoPesado(nome, idade, peso);
			}
			else if(peso <= 93.0 && peso > 83.9) {
				lutadores[i] = new MeioPesado(nome, idade, peso);
			}
			else if(peso <= 83.9 && peso > 65.0) {
				lutadores[i] = new PesoMedio(nome, idade, peso);
			}
			else if(peso <= 65) {
				lutadores[i] = new PesoPena(nome, idade, peso);
			}
		}
		for(int j = 0; j < lutadores.length ; j++) {
			System.out.println(lutadores[j]);
		}
		System.out.println("insira um numero de 0 a 9");
		int numero = scan.nextInt();
		System.out.println(lutadores[numero]);
		lutadores[numero].possiveisLutas(lutadores, numero);
		
		
		scan.close();
	}

}
