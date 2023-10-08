package aula5.exercicio;

public class ContaCorrente extends Conta implements Tributavel {
	public double calculaTributos() {
		double tributo = 0.01*getSaldo();
		return tributo;
	}
}
