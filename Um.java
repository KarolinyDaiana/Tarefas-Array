package Atividades;

import java.util.Scanner;

public class Um {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		double[] totalVendas = new double[5], salario = new double[5];
		int[] percentual = new int[5];
		String[] nomes = new String[5];

		double total = 0.0, maior = 0.0, menor = 9999999.99;
		int posicaoMaior = 0, posicaoMenor = 0;

		for (int cont1 = 0; cont1 < nomes.length; cont1++) {
			System.out.println("Qual o nome do " + (cont1 + 1) + "º vendedor?");
			nomes[cont1] = leia.next();

			System.out.println("Qual o total de vendas de " + nomes[cont1] + "?");
			totalVendas[cont1] = leia.nextDouble();
			total = total + totalVendas[cont1];

			System.out.println("Qual o percentual de comissão de " + nomes[cont1] + "?");
			percentual[cont1] = leia.nextInt();
		}

		for (int cont2 = 0; cont2 < nomes.length; cont2++) {
			salario[cont2] = totalVendas[cont2] + (totalVendas[cont2] * percentual[cont2] / 100);

			if (salario[cont2] > maior) {
				maior = salario[cont2];
				posicaoMaior = cont2;

			} else if (salario[cont2] < menor) {
				menor = salario[cont2];
				posicaoMenor = cont2;
			}
		}

		System.out.println("Relatório: ");

		for (int cont3 = 0; cont3 < nomes.length; cont3++) {
			System.out.println("Vendedor " + nomes[cont3] + " receberá R$" + salario[cont3] + ".");
		}

		System.out.println("\n\nO total de vendas de todos os vendedores foi de R$" + total + ".");
		System.out.println(
				"\nO vendedor " + nomes[posicaoMaior] + " recebeu o maior salário: R$" + salario[posicaoMaior] + ".");
		System.out.println(
				"\nO vendedor " + nomes[posicaoMenor] + " recebeu o menor salário: R$" + salario[posicaoMenor] + ".");
	}

}
