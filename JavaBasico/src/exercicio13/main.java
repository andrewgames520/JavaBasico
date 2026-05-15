package exercicio13;

import java.util.Scanner;

public class main {
	private String nome;
	private Integer idade;
	private Integer registro;
public void usuario( String nome, Integer idade, Integer registro) {
		this.nome = nome;
		this.idade = idade;
		this.registro = registro;
	}


/*13. Menu com switch
Conceitos: switch, menus simples.

Crie um programa que exiba o seguinte menu:

1 - Cadastrar usuário
2 - Listar usuários
3 - Sair
Leia a opção escolhida e exiba uma mensagem correspondente.*/
	
	public String getNome() {
	return nome;
}


public Integer getIdade() {
	return idade;
}


public Integer getRegistro() {
	return registro;
}

	List<String> listaNomes = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("1 - Cadastrar usuário\r\n"
				+ "2 - Listar usuários\r\n"
				+ "3 - Sair");
		Integer opcao = scan.nextInt();
		switch (opcao) {
		case 1:
		
		}
		scan.close();
	}

}
