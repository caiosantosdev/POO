package aula2.exercicios;

public class Exercicio6 { 
	double saldo;
	public void calcula () { 
		if (saldo < 1000) {
			int teste = (int)(saldo) - 1000; 
			if (teste < 0) {
				System.out.println("Deu zebra"); 
			}	
		} 
	}
}
