package aula3.exercicios;

public class Aluno {
	private String nome;
	private double nota1;
	private double nota2;
	public String getNome() {
		return nome;
	}
	public void setNome(String name) {
		nome = name;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double n) {
		if(n < 0 ) {
			n = 0;
		}
		else if(n > 10) {
			n = 10;
		}
		nota1 = n;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double n) {
		if(n < 0 ) {
			n = 0;
		}
		else if(n > 10) {
			n = 10;
		}
		nota2 = n;
	}
	public void resultado() {
		double media = (nota1 + nota2) / 2;
		if(media < 4) {
			System.out.println("Reprovado");	
		}
		else if(media >= 4 && media <= 5.9) {
			System.out.println("Em Recuperação");
		}
		else if(media >= 6) {
			System.out.println("Aprovado");
		}
	}
}
