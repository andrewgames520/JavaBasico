package exercicio8;

import java.util.Scanner;

public class main {
/*8. Cálculo de salário
Conceitos: entrada de dados, double, operações matemáticas.

Crie um programa que leia:

valor da hora trabalhada;
quantidade de horas trabalhadas no mês.
Depois, calcule e exiba o salário bruto do funcionário.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de horas trabalhadas");
		Double horas = scan.nextDouble();
		System.out.println("Digite o valor de cada hora trabalhada");
		Double valor = scan.nextDouble();
		System.out.printf("Salário bruto do funcionário: %.2f%n",horas*valor);
		scan.close();
	}
}
