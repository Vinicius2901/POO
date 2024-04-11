package apresentacao;

import java.util.Scanner;

import java.util.List;

import dados.Contato;
import negocio.ListaTelefonica;

public class Main {
	private static ListaTelefonica lista = new ListaTelefonica();
	private static Scanner scan = new Scanner(System.in);
	
	private static void imprimeMenu() {
		System.out.println("Digite a opcao que deseja:");
		System.out.println("(0) Encerrar programa");
		System.out.println("(1) Adicionar contato");
		System.out.println("(2) Remover contato");
		System.out.println("(3) Mostrar todos os contatos");
	}
	
	public static void main(String[] args) {
		int opt = -1;
		while( opt != 0 ) {
			imprimeMenu();
			opt = Integer.parseInt(scan.nextLine());
			switch( opt ) {
			case 0:
				System.out.println("Encerrando programa...");
				break;

			case 1:
				adicionarContato();
				break;
				
			case 2:
				removerContato();
				break;
				
			case 3:
				exibirContatos();
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		}
	}
		
		public static void exibirContato( char letra ) {
			List<Contato> listaDeContatos = lista.buscarContatos( letra );
			for( int i = 0; i < listaDeContatos.size(); i++ ) {
				System.out.println("Codigo: " + i);
				System.out.println(listaDeContatos.get(i));
			}
		}
		
		public static void exibirContatos() {
			lista.listarContatos().forEach((chave, contatos) -> {
				System.out.println(chave + ": ");
				contatos.forEach( contato -> {
					System.out.println("\t" + contato);
				}
				);
			}
			);
		}
		
		public static Contato novoContato() {
			Contato c = new Contato();
			System.out.println("Digite o nome do contato:");
			c.setNome(scan.nextLine());
			System.out.println("Digite o numero do contato:");
			c.setTelefone(Integer.parseInt(scan.nextLine()));
			
			return c;
		}
		
		public static void adicionarContato() {
			lista.adicionarContato( novoContato() );
		}
		
		public static void removerContato() {
			
		}
}