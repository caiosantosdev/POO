package aula5.exercicio;

public class GerenciadorDeImpostoDeRenda {
	Cliente cliente = new Cliente();
	double total;
	ContaCorrente ccBradesco = new ContaCorrente();
	
	public void adciona(Tributavel t) {
		total+=t.calculaTributos();
	}
	public void adciona(Tributavel[] t) {
		for(int i = 0 ; i < t.length ; i++) {
			if(t[i] != null) {
				total+=t[i].calculaTributos();				
			}
		}
	}
	public double getTotal() {
		return total;
	}
}
