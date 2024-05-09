import java.util.Locale;
import java.util.Scanner;

/**
 Desafio para exercitar conteúdo apresentado no módulo de Sintaxe. 
 */

					

public class ContaTerminal {

	public static void main(String[] args) {

		Double saldo = 237.48;         


		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o número da sua conta");
		int numero = scanner.nextInt();

		System.out.println("Por favor, digite o número da agência");
		int agencia = scanner.nextInt();

		System.out.println("Por favor, digite o seu nome");
		String nomecliente = scanner.next();

		System.out.println("Olá " + nomecliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque.");

	}

}
