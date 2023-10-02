package aula4;

public class Teste {

	public static void main(String[] args) {
		Urso u = new Urso();
		Leao x = new Leao();
		x.setNome("Simba");
		System.out.println(x.getNome());
		teste(x);
	}
	public static void teste(Animal a) {
		a.correr();
		//a.rugir(); nao funciona pois rugir é somente da classe Leao.
	}
}
