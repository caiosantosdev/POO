package aula4.exercicios;
import java.util.Scanner;


public class Corretora {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		Imovel [] array = {			
				new Novo() , new Novo(),
				new Imovel(), new Imovel(), new Velho()
		};		
		for(int i = 0 ; i < 5 ; i++) {
			array[i].setPreco(scan.nextDouble());
		}
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("O preco desse imovel eh: " + array[i].getPreco());
		}
		scan.close();
	}
}
