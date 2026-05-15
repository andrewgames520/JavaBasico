package exercicio4;

import java.util.Scanner;

public class main {
	/*4. Conversão de temperatura
Conceitos: operadores aritméticos, uso de double.

Crie um programa que receba uma temperatura em Celsius e converta para Fahrenheit usando a fórmula:

F = C * 1.8 + 32*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		Double temp = scan.nextDouble();
		System.out.println("Temperatura convertida para Fahrenheit");
		System.out.println(temp*1.8+32 + "°F");
		scan.close();
	}

}
