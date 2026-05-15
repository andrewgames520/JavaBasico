package exercicio10;

import java.util.Scanner;

public class main {
/*10. Número positivo, negativo ou zero
Conceitos: condicionais encadeadas.

Crie um programa que leia um número inteiro e informe se ele é:

positivo;
negativo;
igual a zero.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero");
		Integer n1= scan.nextInt();
		if(n1<0) {
			System.out.println("Numero negativo");
		}else if(n1==0) {
			System.out.println("O numero é zero");
		}else if(n1>0) {
			System.out.println("Numero positivo");
		}
		scan.close();

	}

}
