package aula5.exercicio;

public class Conta {
	private int numero;
	private double saldo = 0;
	private double limite;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void deposita(int quantia) {
		this.saldo+=(double)quantia;
	}
	public void deposita(double quantia) {
		this.saldo+=quantia;
	}
}
