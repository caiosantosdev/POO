package aula4.exercicios;

public class Novo extends Imovel{
	public double getPreco() {
		return (super.getPreco()+(0.1*super.getPreco()));
	}
}
