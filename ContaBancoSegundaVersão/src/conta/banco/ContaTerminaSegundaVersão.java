package conta.banco;

import java.util.Scanner;

public class ContaTerminaSegundaVersão {

		public static void main(String[] args){
			 
			Scanner sc = new Scanner(System.in);
				System.out.print("Seu nome?: ");
				String nome = sc.nextLine();
				System.out.print("Numero da agencia?: ");
				int agencia = sc.nextInt();
				System.out.print("Numero da conta corrente?: ");
				int contaCorrente = sc.nextInt();
				System.out.print("Saldo disponivel?: ");
				double saldoDisponivel = sc.nextDouble();
			
			
				System.out.print("Ola " +  nome + "obrigado por criar uma conta em nosso banco, "
					+ "sua agencia e: " + agencia + " conta: " + contaCorrente + " e seu saldo: " +
					saldoDisponivel + " ja esta disponivel para saque: ");		
		}

}


