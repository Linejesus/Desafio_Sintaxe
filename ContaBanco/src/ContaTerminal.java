import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
		int numero = scanner.nextInt();

		System.out.println("Digite a agência: ");
		String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
		String nome_cliente = scanner.next();

        System.out.println("Digite o saldo: ");
		double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}