package aula6.exercicio;

import java.util.Scanner;
import java.util.List;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		Utils utils = new Utils();
		Scanner scan = new Scanner(System.in);
		String [] string = new String[2];
		for(int i = 0 ; i < string.length ; i ++) {
			System.out.println("Insira uma String do tipo: "
								+ "id#nome#salario#tipo");
			string[i] = scan.nextLine();
		}
		List lista = utils.retornaDados(string);
		utils.mediaSalarios(lista);
		scan.close();
	}
}
