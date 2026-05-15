package exercicio7;

import java.util.Scanner;

public class main {
/*7. Calculadora de soma e subtração
Conceitos: entrada de dados, operadores aritméticos.

Crie um programa que leia dois números inteiros e exiba:

soma;
subtração;
multiplicação;
divisão.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro numero inteiro");
		Integer n1 = scan.nextInt();
		System.out.println("Digite o segundo numero inteiro");
		Integer n2 = scan.nextInt();
		System.out.printf("Soma dos numeros: %d%nSubtração dos numeros: %d%nMultiplicação dos numeros: %d%n", n1+n2,n1-n2,n1*n2);
		scan.close();
		if(n2==0) {
			System.out.println("Impossivel divisão por zero");
			return;
		}
		System.out.printf("Divisão dos numeros: %.2f", Double.valueOf(n1/n2));
	}

}
