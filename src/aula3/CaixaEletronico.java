package aula3;
import java.util.Scanner;


public class CaixaEletronico {
	public static void main(String[] args) {
		Conta x = new Conta();
		x.depositar(15);
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto quer sacar?");
		int val = scan.nextInt();
		x.debitar(val);
		System.out.println("liberado " + val + " em dinheiro");
		System.out.println("saldo: " + x.getSaldo() );
		scan.close();
	}
}
