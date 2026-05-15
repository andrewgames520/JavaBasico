package exercicio9;

import java.util.Scanner;

public class main {
/*9. Verificação de maioridade
Conceitos: estruturas condicionais, if e else.

Crie um programa que leia a idade de uma pessoa e informe se ela é maior de idade ou menor de idade.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade");
		Integer idade = scan.nextInt();
		if(idade<18) {
			System.out.println("Menor de idade");
		}else {
			System.out.println("Maior de idade");			
		}
		scan.close();
	}

}
