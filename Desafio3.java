package desafio;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[100];
		int contador = 0;
		int maiorValor = 0, acumulador = 0;
		double resultado = 0;
		int menorImpar = 999;

		System.out.println("Entre com um número qualquer:");
		int num = entrada.nextInt();

		while (num > 0) {
			numeros[num]++; // a posição num do vetor númeors está recebendo + 1.
			contador++;// conta quantos numeros foram digitados

			if (num > maiorValor) {
				maiorValor = num;
			}
			acumulador += num; // acumulador, acumula e soma o valores digitados.
			resultado = acumulador / contador;

			if (num % 2 != 0 && num < menorImpar) {
				menorImpar = num;
			}

			System.out.println("Entre com um número qualquer:");
			num = entrada.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] != 0) {
				System.out.println("O número " + i + " foi digitado " + numeros[i] + " vez(es).");
			}
		}
		System.out.println();
		System.out.println("Foram lidos " + contador + " números.");
		System.out.println("Maior valor digitado: " + maiorValor + ".");
		System.out.println("Média dos números lidos: " + resultado + ".");
		System.out.println("Menor número ímpar lido: " + menorImpar + ".");

		entrada.close();
	}
}
