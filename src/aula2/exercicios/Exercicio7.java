package aula2.exercicios;

public class Exercicio7 {
	static boolean saldo;
	public static void calcula () {
		if(saldo) {
		System.out.println("Tem saldo"); 
		}
		else {
		System.out.println("Nao tem saldo"); 
		}
	}
	public static void main(String[] args) {
		calcula();
	}
}
