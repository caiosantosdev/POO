package aula5.explicacao;

public class Aeroporto {

	public static void main(String[] args) {
		Aviao v = new Aviao();
		Aeroporto galeao = new Aeroporto();
		galeao.darPermissaoParaPouso(v);
		Gaivota x = new Gaivota();
		galeao.darPermissaoParaPouso(x);
		
	}
	public void darPermissaoParaPouso(Voador v) {
		v.pousar();
	}

}
