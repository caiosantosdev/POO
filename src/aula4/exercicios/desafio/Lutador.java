package aula4.exercicios.desafio;

import java.util.ArrayList;
import java.util.Random;

public abstract class Lutador {
	private String nome;
	private int idade;
	private double peso;
	private int identificador;
	
//	Peso pesado até 120,2kg, Peso meio-pesado até 93,0kg, 
//	peso médio até 83,9kg e peso pena até 65,0kg.
	public Lutador(String nome, int idade, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		if(peso <= 120.2 && peso > 93.0) {
			this.identificador = 1;
		}
		else if(peso <= 93.0 && peso > 83.9) {
			this.identificador = 2;
		}
		else if(peso <= 83.9 && peso > 65.0) {
			this.identificador = 3;
		}
		else if(peso <= 65) {
			this.identificador = 4;
		}
	}
	
	public void possiveisLutas(Lutador [] x, int numero) {
			System.out.println(x[numero]);
			System.out.println("Possiveis lutas do lutador: " + x[numero].getNome());
			for(int j = 0 ; j < x.length ; j++) {
				if( (x[numero].getIdentificador() == x[j].getIdentificador()) && (x[numero] != x[j]) ) {
					System.out.println("Lutador: " + x[numero].getNome() + " VS " + x[j].getNome());
				}
			}
	}
	public Lutador sorteioLuta(Lutador[] y) {
		Random random = new Random();
		ArrayList<Lutador> listaLutadores = new ArrayList<Lutador>();
		for(int j = 0 ; j < y.length ; j++) {
			if( (y[0].getIdentificador() == y[j].getIdentificador()) && (y[0] != y[j]) ) {
				listaLutadores.add(y[j]);
			}
		}
		return (Lutador)listaLutadores.get(random.nextInt(0,listaLutadores.size()));
	}
	
	public String categoriaLutador() {
			return getClass().getName();
	}
	public String toString() {
		return (nome + "/" + idade + "/" + peso);
	}

	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	public int getIdentificador() {
		return identificador;
	}

}