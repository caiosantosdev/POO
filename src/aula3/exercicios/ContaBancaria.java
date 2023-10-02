package aula3.exercicios;

import java.util.Locale;
import java.text.NumberFormat;


public class ContaBancaria {
	private double saldo;
	private Data dataAbertura;
	//
	public double getSaldo() {
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
	public String getDataAberturaFormatada() {
		String dataFormatada = 
				(dataAbertura.getDia() 
				+ "/" 
				+ dataAbertura.getMes()
				+ "/"
				+ dataAbertura.getAno());
		return dataFormatada;
	}
	public String getSaldoFormatado() {
		Locale localeBR = new Locale("pt","BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
		String saldoFormatado = ("R$: " + dinheiro.format(getSaldo()));
		return saldoFormatado;
	}
	public void depositar(double deposito) {
		saldo += deposito;
		System.out.println("Deposito realizado");
	}
	public void sacar(double saque) {
		if(saque > saldo) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo-=saque;
			System.out.println("Saque realizado");
		}
	}
}
