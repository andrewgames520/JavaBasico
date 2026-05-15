package exercicio2;
/*Crie um programa que armazene em variáveis:

nome;
idade;
altura;
cidade.
Depois, exiba uma mensagem organizada no console com essas informações.*/
public class main {

	public static void main(final String[] args) {
		String nome = "Thalles",cidade = "Barretos";
		Double  idade= 19., altura = 1.76;
		System.out.printf("Nome: %s%nIdade: %.0f%nAltura: %.2f%nCidade:%s", nome,idade,altura,cidade);
	}

}
