package Atividades;

import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int escolha = 0, numeroCadastros = 0;
		String buscaPessoa;

		System.out.println("Quantas pessoas deseja cadastrar?");
		numeroCadastros = leia.nextInt();

		String[] nomes = new String[numeroCadastros];

		System.out.println("\n======== MENU ========");
		System.out.println("1) Cadastrar nome;");
		System.out.println("2) Pesquisar nome;");
		System.out.println("3) Listar todos os nomes;");
		System.out.println("0) Saior do programa;");
		System.out.println("----------------------");

		do {
			System.out.print("Digite sua escolha: ");
			escolha = leia.nextInt();

			switch (escolha) {

			case 1:

				for (int cont1 = 0; cont1 < numeroCadastros; cont1++) {
					System.out.println("Digite o nome da " + (cont1 + 1) + "ª pessoa");
					nomes[cont1] = leia.next();
				}
				break;

			case 2:
				System.out.println("Digite o nome desejado: ");
				buscaPessoa = leia.next();

				for (int cont2 = 0; cont2 < numeroCadastros; cont2++) {
					if (nomes[cont2].equals(buscaPessoa)) {
						System.out.println("A pessoa está registrada.");
						break;

					} else {
						System.out.println("A pessoa não está registrada.");
						break;
					}
				}
				break;

			case 3:
				for (int cont3 = 0; cont3 < numeroCadastros; cont3++) {
					System.out.println(nomes[cont3]);
				}
				break;

			}
		} while (escolha != 0);
	}

}
