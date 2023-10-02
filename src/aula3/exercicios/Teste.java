package aula3.exercicios;

import java.util.Scanner;


public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria Conta1 = new ContaBancaria();
		Data atual = new Data();
		atual.setDia(3);
		atual.setMes(9);
		atual.setAno(2023);
		Conta1.setData(atual);
		System.out.println("Data atual: " + Conta1.getDataAberturaFormatada());
		System.out.println("Quanto deseja depositar?");
		Conta1.depositar(sc.nextDouble());
		System.out.println("Seu saldo: " + Conta1.getSaldo());
		System.out.println("Quanto quer sacar?");
		Conta1.sacar(sc.nextDouble());
		System.out.println("Seu saldo: " + Conta1.getSaldo());
		sc.close();
	}
	//melhorar esse sistema pelo amor de Deus KKKKKK
}
