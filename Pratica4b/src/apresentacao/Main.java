package apresentacao;

import java.util.Scanner;

import dados.Animal;
import dados.Aquario;
import dados.Peixe;
import dados.Viveiro;
import negocio.Zoologico;

public class Main {
	private static Zoologico zoo = new Zoologico();
	private static Scanner scan = new Scanner(System.in);
	
	public static void imprimeMenu() {
		System.out.println("Escolha uma das opcoes abaixo:");
		System.out.println("(0) Sair do programa");
		System.out.println("(1) Cadastrar viveiro");
		System.out.println("(2) Cadastrar animal");
		System.out.println("(3) Mostrar viveiros");
		System.out.println("(4) Mostrar animais");
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
				cadastrarViveiro();
				break;
			case 2:
				cadastrarAnimal();
				break;
			case 3:
				mostrarViveiros();
				break;
			case 4:
				mostrarAnimais();
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
					
			}
		}
	}
	
	public static void mostrarViveiros() {
		Viveiro[] viveiros = zoo.getViveiros();
		
		for( int i = 0; i < zoo.getQuantViveiros(); i++ ) {
			System.out.println( viveiros[i] );
		}
		System.out.println();
	}
	
	public static void mostrarAnimais() {
		Animal[] animais = zoo.getAnimais();
		
		for( int i = 0; i < zoo.getQuantAnimais(); i++ ) {
			System.out.println( animais[i] );
		}
		System.out.println();
	}
	
	public static void mostrarSoAquarios() {
		Aquario[] aquarios = zoo.getSoAquarios();
		
		for( int i = 0; i < aquarios.length; i++ ) {
			System.out.println( i + ":\n" + aquarios[i] );
		}
	}
	
	public static void mostrarSoViveiros() {
		Viveiro[] viveiros = zoo.getSoViveiros();
		
		for( int i = 0; i < viveiros.length; i++ ) {
			System.out.println( i + ":\n" + viveiros[i] );
		}
	}
	
	public static Viveiro novoViveiro() {
		System.out.println("Digite a quantidade maxima de animais do viveiro:");
		int size = -1;
		while( size < 1 ) {
			size = Integer.parseInt(scan.nextLine());
		}
		Viveiro viv = new Viveiro( size );
		System.out.println("Digite o nome do viveiro:");
		viv.setNome(scan.nextLine());
		System.out.println("Digite o comprimento do viveiro:");
		viv.setComprimento(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite a largura do viveiro:");
		viv.setLargura(Integer.parseInt(scan.nextLine()));
		
		return viv;
	}
	
	private static Aquario novoAquario() {
		System.out.println("Digite a quantidade maxima de peixes do aquario");
		int size = -1;
		while( size < 1 ) {
			size = Integer.parseInt(scan.nextLine());
		}
		Aquario aq = new Aquario( size );
		System.out.println("Digite o nome do aquario:");
		aq.setNome(scan.nextLine());
		System.out.println("Digite o comprimento do aquario:");
		aq.setComprimento(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite a largura do aquario:");
		aq.setLargura(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite a altura do aquario:");
		aq.setAltura(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite a temperatura do aquario:");
		aq.setTemperatura(Integer.parseInt(scan.nextLine()));
		
		return aq;
	}
	
	private static void cadastrarViveiro() {
		System.out.println("Digite o numero da opcao que deseja:");
		System.out.println("(1) para Viveiro");
		System.out.println("(2) para Aquario");
		int escolha = Integer.parseInt(scan.nextLine());
		switch( escolha ) {
		case 1:
			zoo.cadastrarViveiros(novoViveiro());
			break;
		case 2:
			zoo.cadastrarViveiros(novoAquario());
			break;
		default:
			System.out.println("Opcao invalida!");
			break;
		}
	}
	
	private static Animal novoAnimal() {
		Animal an = new Animal();
		
		System.out.println("Digite o nome do animal:");
		an.setNome(scan.nextLine());
		System.out.println("Digite a cor do animal:");
		an.setCor(scan.nextLine());
		System.out.println("Digite a especie do animal:");
		an.setEspecie(scan.nextLine());
		System.out.println("Digite a idade do animal:");
		an.setIdade(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o comprimento do animal:");
		an.setComprimento(Float.parseFloat(scan.nextLine()));
		System.out.println("Digite a largura do animal:");
		an.setLargura(Float.parseFloat(scan.nextLine()));
		System.out.println("Digite a altura do animal:");
		an.setAltura(Float.parseFloat(scan.nextLine()));
		
		mostrarSoViveiros();
        System.out.println("Digite o número do viveiro:");
        int vi = Integer.parseInt(scan.nextLine());
        while(vi >= zoo.getSoViveiros().length) {
        	System.out.println("Número inválido!");
        	System.out.println("Digite o número do viveiro:");
            vi = Integer.parseInt(scan.nextLine());
        }
        while(!zoo.alocarAnimal(an, zoo.getSoViveiros()[vi])) {
        	System.out.println("Não foi possível alocar nesse viveiro");
        	mostrarSoViveiros();
            System.out.println("Digite o número do viveiro:");
            vi = Integer.parseInt(scan.nextLine());
            while(vi >= zoo.getSoViveiros().length) {
            	System.out.println("Número inválido!");
            	System.out.println("Digite o número do viveiro:");
                vi = Integer.parseInt(scan.nextLine());
            }
        }
		
		return an;
	}
	
	private static Peixe novoPeixe() {
		Peixe pe = new Peixe();
		
		System.out.println("Digite o nome do animal:");
		pe.setNome(scan.nextLine());
		System.out.println("Digite a cor do animal:");
		pe.setCor(scan.nextLine());
		System.out.println("Digite a especie do animal:");
		pe.setEspecie(scan.nextLine());
		System.out.println("Digite a idade do animal:");
		pe.setIdade(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o comprimento do animal:");
		pe.setComprimento(Float.parseFloat(scan.nextLine()));
		System.out.println("Digite a largura do animal:");
		pe.setLargura(Float.parseFloat(scan.nextLine()));
		System.out.println("Digite a altura do animal:");
		pe.setAltura(Float.parseFloat(scan.nextLine()));
		System.out.println("Digite a temperatura ideal para o peixe:");
		pe.setTemperaturaIdeal(Float.parseFloat(scan.nextLine()));
		
		mostrarSoAquarios();
        System.out.println("Digite o número do aquario:");
        int aq = Integer.parseInt(scan.nextLine());
        while(aq >= zoo.getSoAquarios().length) {
        	System.out.println("Número inválido!");
        	System.out.println("Digite o número do aquario:");
            aq = Integer.parseInt(scan.nextLine());
        }
        while(!zoo.alocarAnimal(pe, zoo.getSoAquarios()[aq])) {
        	System.out.println("Não foi possível alocar nesse aquario");
        	mostrarSoAquarios();
            System.out.println("Digite o número do aquario:");
            aq = Integer.parseInt(scan.nextLine());
            while(aq >= zoo.getSoAquarios().length) {
            	System.out.println("Número inválido!");
            	System.out.println("Digite o número do aquario:");
                aq = Integer.parseInt(scan.nextLine());
            }
        }
		
		return pe;
	}
	
	private static void cadastrarAnimal() {
		if( zoo.getViveiros().length > 0 ) {
			System.out.println("Digite o numero da opcao que deseja:");
			System.out.println("(1) para Animal terrestre");
			System.out.println("(2) para Peixe");
			int opc = Integer.parseInt(scan.nextLine());
			
			switch( opc ) {
			case 1:
				zoo.cadastrarAnimais(novoAnimal());
				break;
			case 2:
				zoo.cadastrarAnimais(novoPeixe());
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		}
		else {
			System.out.println("Não há viveiros cadastrados!");
		}
	}
}
