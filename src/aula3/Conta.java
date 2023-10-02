package aula3;

public class Conta {
	private double saldo;
	private String nome;
	public void debitar(double val) {
		if(val <= saldo) {
			saldo-=val;
			System.out.println("Débito realizado.");
		}
		else {
			System.out.println("Débito não realizado");
		}
	}
	public void depositar(double val) {
		saldo+=val;
	}
	public double getSaldo() {
		return saldo;
	}
}
