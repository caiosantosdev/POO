package aula1;

public class ProgramaPrincipal {
	public static void main(String[] args){
		Gato g1 = new Gato();
		Gato g2 = new Gato();
		g1.nome = "Felix";
		g2.nome = "Tom";
		g1.miar();
		g2.miar();
		Gato g3 = g1;
		g3.nome = "Botas";
		System.out.println(g1.nome);
	}
}
