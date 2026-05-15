package exercicio11;

import java.util.Scanner;

public class main {
/*11. Aprovação de aluno
Conceitos: condicionais, operadores relacionais.

Crie um programa que leia duas notas de um aluno, calcule a média e informe:

Aprovado, se a média for maior ou igual a 7;
Recuperação, se a média for maior ou igual a 5 e menor que 7;
Reprovado, se a média for menor que 5.
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		Double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota");
		Double n2 = scan.nextDouble();
		Double media = (n1+n2)/2;
		if(media<5) {
			System.out.println("Reprovado");
		}else if(media<7) {
			System.out.println("Recuperação");
		}else
			System.out.println("Aprovado");
		scan.close();
		

	}

}
