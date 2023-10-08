package aula6.exercicio;

public class Funcionario {
	private String id;
	private String nome;
	private double salario;
	public Funcionario(String id) {
		this.id = id;
	}
	public String toString() {
		return (id + " - " + nome + " - R$ " + salario);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
