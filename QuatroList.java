package Atividades;

import java.util.Scanner;

import java.util.ArrayList;

public class QuatroList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<String>();

		int escolha = 0;
		String buscaPessoa;

		do {
			System.out.println("\n======== MENU ========");
			System.out.println("1) Cadastrar nome;");
			System.out.println("2) Pesquisar nome;");
			System.out.println("3) Listar todos os nomes;");
			System.out.println("0) Saior do programa;");
			System.out.println("----------------------");
			System.out.print("Digite sua escolha: ");
			escolha = leia.nextInt();

			switch (escolha) {

			case 1:
				System.out.println("\nDigite o nome a ser inserido:");
				nomes.add(leia.next());

				break;

			case 2:
				System.out.println("\nDigite o nome desejado: ");
				buscaPessoa = leia.next();

				for (int cont2 = 0; cont2 < nomes.size(); cont2++) {
					if (nomes.get(cont2).equals(buscaPessoa)) {
						System.out.println("\nA pessoa está registrada.");
						break;

					} else {
						System.out.println("\nA pessoa não está registrada.");
						break;
					}
				}
				break;

			case 3:
				System.out.println(nomes);
				break;
			}

		} while (escolha != 0);

	}

}
