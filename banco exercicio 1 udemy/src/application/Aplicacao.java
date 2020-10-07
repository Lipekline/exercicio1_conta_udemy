package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;


public class Aplicacao {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.println("Nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("E seu primeiro deposito ? (s/n)");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Digite o valor de deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			
			conta = new Conta(numero, nome, depositoInicial);
		}
		else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println("");
		System.out.println("dados da conta:");
		System.out.println(conta);
		
		System.out.println("");
		System.out.println("digite o valor a ser depositado: ");
		double saldo = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Conta Atualizada: ");
		conta.deposito(saldo);
		
		System.out.println(conta);
		System.out.println("");
		System.out.println("digite um valor a ser sacado: ");;
		double saque = sc.nextDouble();
		System.out.println("");
		System.out.println("Conta Atualizada: ");
		conta.saque(saque);
		
		System.out.println(conta);
		
		
	}

}
