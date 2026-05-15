package exercicio6;

import java.util.Scanner;

public class main {
/*6. Leitura de dados com Scanner
Conceitos: entrada de dados, Scanner.

Crie um programa que solicite ao usuário:

nome;
idade;
curso.
Depois, exiba uma mensagem como:

Olá, Ana! Você tem 20 anos e está matriculada no curso de Engenharia de Software.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome");
		String nome = scan.nextLine();
		System.out.println("Digite a idade");
		Integer idade = scan.nextInt();
		scan.nextLine();
		System.out.println("Digite o curso");
		String curso = scan.nextLine();
		System.out.printf("Olá, %s! Você tem %d anos e está matriculada no curso de %s.", nome, idade, curso);
		scan.close();
	}

}
