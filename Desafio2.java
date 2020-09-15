package desafio;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com qualquer valor inteiro: ");
		int valorQualquer = entrada.nextInt();

		if (valorQualquer <= 0) {
			System.out.println("Valor requerido deve ser maior que zero.");
		} else {
			escreverPiramideInvertida(valorQualquer);
		}

		entrada.close();

	}

	public static void escreverPiramideInvertida(int valorQualquer) {
		for (int linha = valorQualquer; linha > 0; linha--) {
			System.out.println();
			for (int coluna = linha; coluna > 0; coluna--) {
				System.out.print(" " + coluna * coluna);
			}
		}
	}
}
