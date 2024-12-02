package caixa;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Caixa caixaBanco = new Caixa();

		int escolha;

		System.out.println("Bem-vindo");

		do {

			System.out.println("1. Depositar ou adicionar fundos");
			System.out.println("2. Sacar dinheiro");
			System.out.println("3. Consultar o saldo");
			System.out.println("4. Sair");

			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Qual é o valor?");
				double valor = scanner.nextDouble();
				caixaBanco.setSaldo(valor);
				break;
			case 2:
				System.out.println("Qual é o valor a ser retirado?");
				double valorSaque = scanner.nextDouble();
				if (valorSaque <= caixaBanco.getSaldo()) {
					caixaBanco.Sacar(valorSaque);
				} else {
					System.out.println("Você não possui saldo o suficiente para realizar essa operação");
				}
				break;
			case 3:
				System.out.printf("O valor em sua conta é de R$ %.2f %n", caixaBanco.getSaldo());
				break;
			}

		} while (escolha != 4);

		scanner.close();
	}

}
