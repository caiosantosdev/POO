package aula5.exercicio;

public class TesteTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		/*Não se pode chamar o método getSaldo a partir de t pois t
		 * tem a forma de uma interface que só possui o metodo calculaTributos
		 * sendo assim, não exerga o método getSaldo da classe que sofre o polimorfismo.
		 */
		
	}

}
