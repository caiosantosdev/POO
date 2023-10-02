package aula3.exercicios;

import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;


public class Caixa {
	private static double saldo;
	private static Data dataAbertura = new Data();
	//
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ok = 1;
		int opcao = 0;
		dataAbertura.setDia(3);
		dataAbertura.setMes(9);
		dataAbertura.setAno(2023);
		while(ok == 1) {
			System.out.println("BANCO MUZITANO");
			System.out.println(getDataAberturaFormatada());
			System.out.println("o que deseja fazer?");
			System.out.println("Seu saldo: " + getSaldoFormatado());
			System.out.println("1 - depositar");
			System.out.println("2 - sacar");
			System.out.println("0 - sair");
			opcao = scan.nextInt();
			if(opcao == 1) {
				System.out.println("Digite o valor que deseja depositar.");
				depositar(scan.nextDouble());
			}
			else if(opcao == 2) {
				System.out.println("Qual valor deseja sacar?");
				sacar(scan.nextDouble());
			}
			else if(opcao == 0) {
				ok = 0;
			}
		}
		scan.close();
	}
	public static double getSaldo() {
		return saldo;
	}
	public void setSaldo(double d) {
		saldo = d;
	}
	public Data getData() {
		return dataAbertura;
	}
	public void setData(Data x) {
		dataAbertura = x;
	}
	public static String getDataAberturaFormatada() {
		String dataFormatada = 
				(dataAbertura.getDia() 
				+ "/" 
				+ dataAbertura.getMes()
				+ "/"
				+ dataAbertura.getAno());
		return dataFormatada;
	}
	public static String getSaldoFormatado() {
		Locale localeBR = new Locale("pt","BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
		String saldoFormatado = (" " + dinheiro.format(getSaldo()));
		return saldoFormatado;
	}
	public static void depositar(double deposito) {
		saldo += deposito;
		System.out.println("Deposito realizado");
	}
	public static void sacar(double saque) {
		if(saque > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo-=saque;
			System.out.println("Saque realizado");
		}
	}
	//melhora esse programa quando tiver tempo.
}
