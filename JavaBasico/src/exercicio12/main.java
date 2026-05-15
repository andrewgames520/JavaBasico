package exercicio12;

import java.util.Scanner;

public class main {
/*12. Desconto em compra
Conceitos: condicionais, porcentagem.

Crie um programa que leia o valor de uma compra.

Aplique as seguintes regras:

compras acima de R$ 500,00 recebem 15% de desconto;
compras entre R$ 200,00 e R$ 500,00 recebem 10% de desconto;
compras abaixo de R$ 200,00 não recebem desconto.
Exiba o valor final da compra.*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da compra");
		Double valor = scan.nextDouble();
		if(valor<200) {
			System.out.printf("Valor final da compra: %.2f",valor);
		}else if(valor<=500) {
			System.out.printf("Valor final da compra: %.2f",valor*0.90);
		}else {
			System.out.printf("Valor final da compra: %.2f",valor*0.85);			
		}
		scan.close();

	}

}
