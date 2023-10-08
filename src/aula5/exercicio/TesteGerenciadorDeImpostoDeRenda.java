package aula5.exercicio;

public class TesteGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		Cliente claudio = new Cliente();
		ContaCorrente ccBradesco = new ContaCorrente();
		ccBradesco.deposita(2250.0);
		ContaCorrente ccItau = new ContaCorrente();
		ccItau.deposita(2400.0);
		
		claudio.tributaveis[0] = new ContaCorrente();
		claudio.tributaveis[1] = new ContaCorrente();
		claudio.tributaveis[2] = new SeguroDeVida();
		GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
		g.adciona(claudio.tributaveis);
		System.out.println(g.getTotal());
	}

}
