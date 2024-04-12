package apresentacao;

import java.util.Scanner;

import dados.Pessoa;
import negocio.ListaPessoas;

public class Main {
	private static ListaPessoas pessoas = new ListaPessoas();
	private static Scanner scan = new Scanner(System.in);
	private static String[] faixaEtaria = {"1 ate 12: criancas;", "13 ate 18: adolescentes;",
			"19 ate 25: jovens;", "26 ate 59: adultos;", "60 ou mais: idosos;"};
	
	public static void imprimeMenu() {
		System.out.println("Escolha uma das opcoes abaixo:");
		System.out.println("(0) Encerrar programa");
		System.out.println("(1) Cadastrar pessoa");
		System.out.println("(2) Mostrar pessoas");
	}
	
	public static void main(String[] args) {
		pessoas.listarPessoas();
		int opt = -1;
		while( opt != 0 ) {
			imprimeMenu();
			opt = Integer.parseInt(scan.nextLine());
			switch( opt ) {
			case 0:
				System.out.println("Encerrando programa...");
				break;
			case 1:
				addPessoas();
				break;
			case 2:
				mostraPessoas();
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		}
	}
	
	public static Pessoa novaPessoa() {
		Pessoa p = new Pessoa();
		System.out.println("Digite o nome da pessoa:");
		p.setNome(scan.nextLine());
		System.out.println("Digite a idade da pessoa");
		p.setIdade(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o CPF da pessoa:");
		p.setCpf(scan.nextLine());
		System.out.println("Digite o nome da cidade da pessoa");
		p.setCidade(scan.nextLine());
		
		return p;
	}
	
	public static void addPessoas() {
		pessoas.addPessoas( novaPessoa() );
	}
	
	public static void mostraPessoas() {
		for( int i = 0; i < 5; i++ ) {
			System.out.println( faixaEtaria[i] );
			pessoas.buscarPessoas().get(i).forEach( pessoa -> {
				System.out.println( pessoa );
			});
		}
	}
}