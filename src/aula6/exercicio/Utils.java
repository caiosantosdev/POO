package aula6.exercicio;

import java.util.List;
import java.util.ArrayList;

public class Utils {
	public static boolean existe(List x, Funcionario y) {
		if(x.contains(y) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	public List<Funcionario> retornaDados(String [] array_funcionarios) {
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		for(int i = 0 ; i < array_funcionarios.length ; i++) {
			String [] aux = array_funcionarios[i].split("#");
			Funcionario funcionario = null;
			if(aux[3].equalsIgnoreCase("A")) {
				funcionario =  new AnalistaSistemas(aux[0]);
			}
			else if(aux[3].equalsIgnoreCase("P")) {
				funcionario =  new Programador(aux[0]);
			}
			funcionario.setNome(aux[1]);
			funcionario.setSalario(Double.parseDouble(aux[2]));
			listaFuncionarios.add(funcionario);
		}
		for(int k = 0 ; k < listaFuncionarios.size() ; k++) {
			System.out.println(((Funcionario)listaFuncionarios.get(k)).getNome());
			System.out.println(((Funcionario)listaFuncionarios.get(k)).getSalario());
		}
		return listaFuncionarios;
	}
	public void mediaSalarios(List x) {
		int amountAnalistas = 0;
		int amountProgramadores = 0;
		double mediaAnalistas = 0;
		double mediaProgramadores = 0;
		for(int i = 0 ; i < x.size() ; i++) {
			if(x.get(i) instanceof AnalistaSistemas) {
				amountAnalistas+=1;
				mediaAnalistas+=((Funcionario)x.get(i)).getSalario();
			}
			else if(x.get(i) instanceof Programador) {
				amountProgramadores+=1;
				mediaProgramadores+=((Funcionario)x.get(i)).getSalario();
			}
		}
		mediaAnalistas = mediaAnalistas/amountAnalistas;
		mediaProgramadores = mediaProgramadores/amountProgramadores;
		System.out.println("A media salarial dos analistas é de R$ " + mediaAnalistas);
		System.out.println("A media salarial dos Programadores é de R$ " + mediaProgramadores);
	}
}
