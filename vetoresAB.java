package exercicios;

import java.util.Scanner;

public class vetoresAB {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); // Declarando o Scanner

		int[] A = new int[6]; // Iniciando o Array A
		int[] B = new int[6]; // Iniciando o Array B

		for (int X = 0; X < 5;) { // Iniciando um Loop (enquanto X for menor que 5, faça)
			X++; // Contador que adicionar 1 ao valor de X
			System.out.println("Digite o " + X + " elemento de A:"); // Imprimindo uma mensagem
			A[X] = leitor.nextInt(); // Recebendo uma resposta em uma variavel
			System.out.println("Digite o " + X + " elemento de B:"); // Imprimindo uma mensagem
			B[X] = leitor.nextInt(); // Recebendo uma resposta em uma variavel

		}

		int C = 0; // Declarando uma variavel C
		for (int X = 1; X <= 5;) { // Iniciando um Loop (enquanto x for menor/igual a 5, faça)
			C = C + A[X] * B[X]; // Conta para obter o valor de C
			X++; // Contador que adicionar 1 ao valor de X
		}
		System.out.println("Valor de C: " + C); // Imprimindo uma mensagem
	}
}
