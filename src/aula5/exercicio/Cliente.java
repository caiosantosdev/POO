package aula5.exercicio;

public class Cliente {
	private String nome;
	private int cpf;
	Tributavel[] tributaveis = new Tributavel[10];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
