package Atividades;

import java.util.Random;

public class Tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random aleatorio = new Random();

		double[] temperatura = new double[121];
		double maior = 0.0, menor = 99.9, total = 0, media = 0;

		for (int cont1 = 0; cont1 < temperatura.length; cont1++) {
			temperatura[cont1] = aleatorio.nextDouble() * 25 + 15;
			total = total + temperatura[cont1];

			if (temperatura[cont1] > maior) {
				maior = temperatura[cont1];
			} else if (temperatura[cont1] < menor) {
				menor = temperatura[cont1];
			}
		}

		System.out.println("A maior temperatura foi de " + maior + "° Celsius.");
		System.out.println("A menor temperatura foi de " + menor + "° Celsius.");

		media = total / 121;
		System.out.println("A média das temperaturas foi de " + media + "° Celsius.");

	}

}
