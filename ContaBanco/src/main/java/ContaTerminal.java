import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Número da agência?: ");
		int agencia = sc.nextInt();
		System.out.print("Número da conta corrente?: ");
		int contaCorrente = sc.nextInt();
		System.out.print("Saldo disponível?: ");
		double saldoDisponivel = sc.nextDouble();
		System.out.print("Seu nome?: ");
		String nome = sc.nextLine();
		
		System.out.print("Olá " +  nome + "obrigado por criar uma conta em nosso banco, "
				+ "sua agência é: " + agencia + " conta: " + contaCorrente + " e seu saldo: " +
				saldoDisponivel + " já está disponível para saque: ");		

	}

}
