package exercicio3;

import java.util.Scanner;

public class main {
/*3. Cálculo de média simples
Conceitos: variáveis ​​numéricas, operadores aritméticos.

Crie um programa que armazene três notas de um aluno e calcule a média aritmética.

Ao final, exiba:

A média do aluno é: X*/
	public static void main(String[] args) {
		
		Double[] notas = new Double[3]; 
		Double media =0.;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d:",i+1);
			notas[i]= scan.nextDouble();
			media += notas[i];
		}
		System.out.println("A média do aluno é: " + media/3);
		scan.close();
	}
}
