package exercicio5;



public class main {
/*Conceitos: variáveis, operadores, organização de cálculos.

Crie um programa que calcule:

área de um retângulo;
área de um triângulo;
área de um círculo.
Use valores fixos nas variáveis e exiba os três resultados.*/
	public static void main(String[] args) {
		Double largura =5.;
		Double comprimento = 10.;
		System.out.println("Area do retangulo: ");
		System.out.println(largura*comprimento);
		Double base = 10.;
		Double altura = 7.;
		System.out.printf("Area do triangulo: %.2f%n", (base*altura)/2);
		Double raio = 8.;
		System.out.printf("Area do circulo %.2f%n", Math.PI*Math.pow(raio, 2));
	}

}
