package aula3;


public class Aluno {
	private int idade;
	private double notaFinal;
	private String nome;
	
	//Constructors
	private Aluno(double n) {
		notaFinal = n;
	}
	public Aluno() {
		System.out.println("abc");
	}
	public Aluno(double n , int i) {
		setIdade(i);
		setNotaFinal(n);
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int i) {
		idade = i;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double d) {
		notaFinal = d;
	}
}
