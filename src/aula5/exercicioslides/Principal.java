package aula5.exercicioslides;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add(new Urso());
		lista.add(new Carro());
		lista.add(new Doce());
		corram(lista);
	}
	public static void corram(List lista) {
		for(int i = 0 ; i < lista.size(); i++) {
			if(lista.get(i) instanceof Corredor) {
				Corredor corredor = (Corredor)lista.get(i);
				corredor.correr();
			}
		}
	}

}
