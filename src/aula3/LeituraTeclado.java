package aula3;
import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lendoLinha = sc.nextLine();
		System.out.println("A linha de entrada foi: " + lendoLinha );
		System.out.println("Insira uma idade");
		int valor = sc.nextInt();
		System.out.println("A idade é: " + valor);
		sc.close();
	}

}
