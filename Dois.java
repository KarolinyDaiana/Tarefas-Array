package Atividades;

import java.util.Scanner;

public class Dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int[] numeros = new int[6];
		int par = 0, impar = 0;

		for (int cont1 = 0; cont1 < 6; cont1++) {
			System.out.println("Digite o " + (cont1 + 1) + " n�mero:");
			numeros[cont1] = leia.nextInt();

			if (numeros[cont1] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("\nForam inseridos " + par + " n�meros pares, s�o eles:");

		for (int contPar = 0; contPar < 6; contPar++) {

			if (numeros[contPar] % 2 == 0) {
				System.out.println(numeros[contPar]);
			}
		}

		System.out.println("\nForam inseridos " + impar + " n�meros impares, s�o eles:");

		for (int contImpar = 0; contImpar < 6; contImpar++) {

			if (numeros[contImpar] % 2 != 0) {
				System.out.println(numeros[contImpar]);
			}
		}
	}

}
