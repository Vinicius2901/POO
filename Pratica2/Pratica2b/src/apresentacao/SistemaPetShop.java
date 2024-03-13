package apresentacao;

import java.util.Scanner;

import dados.Endereco;
import dados.Veterinario;
import dados.Animais;
import dados.Dono;

public class SistemaPetShop {
	
	private static Veterinario[] veterinarios = new Veterinario[50];
	private static int quantidadeDeVeterinarios = 0;
	static Scanner scan = new Scanner(System.in);
	private static int index;
	
	public static void main(String[] args) {
		int opcao = -1;
		while (opcao != 0) {
			menu();
			opcao = Integer.parseInt( scan.nextLine());
			switch(opcao) {
				case 0 :
				break;
				case 1 :
					cadastrarVeterinarios();
				break;
				
				case 2:
					mostrarVeterinarios();
				break;
				case 3:
					cadastrarEnderecoVeterinario();
				break;
				case 4:
					cadastrarAnimalVet();
				break;
				case 5:
					mostrarAnimais();
				break;
				case 6:
					cadastrarDonoAnimal();
				break;
				default:
					System.out.println("Opção não valida");
				
			}
		}
	}
	
	public static void menu() {
		System.out.println("Escolha uma opção:");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar veterinario");
		System.out.println("2 - Exibir veterinario");
		System.out.println("3 - Cadastrar endereço do veterinario");
		System.out.println("4 - Cadastrar animal");
		System.out.println("5 - Exibir animal");
		System.out.println("6 - Cadastrar dono");
	}
	
	public static void cadastrarVeterinarios() {
		
		if( quantidadeDeVeterinarios < 50 ) {
			
			Veterinario vet = new Veterinario(5);
			System.out.println("\nDigite o nome do veterinario: ");
			vet.setNome(scan.nextLine());
			System.out.println("\nDigite o salario do veterinario: ");
			vet.setSalario(Float.parseFloat(scan.nextLine()));
			veterinarios[quantidadeDeVeterinarios] = vet;
			quantidadeDeVeterinarios++;
		}
	}
	
	public static void mostrarVeterinarios() {
		
		if( quantidadeDeVeterinarios == 0 ) {
			System.out.println("\nNao ha veterinarios cadastrados.");
		}
		else {
			for( int i = 0; i < quantidadeDeVeterinarios; i++ ) {
				
				System.out.print("\n" + i + ":");
				System.out.println( veterinarios[i].toString() );
			}
		}
	}
	
	public static Endereco cadastrarEndereco() {
		Endereco end = new Endereco();
		
		System.out.println("Digite a rua: ");
		end.setRua(scan.nextLine());
		
		System.out.println("Digite o numero da casa: ");
		end.setNumero(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Digite o bairro: ");
		end.setBairro(scan.nextLine());
		
		System.out.println("Digite a cidade: ");
		end.setCidade(scan.nextLine());
		
		System.out.println("Digite o estado: ");
		end.setBairro(scan.nextLine());
		
		System.out.println("Digite o CEP: ");
		end.setCep(Integer.parseInt(scan.nextLine()));
		
		return end;
	}
	
	public static void cadastrarEnderecoVeterinario() {
		
		mostrarVeterinarios();
		System.out.println("\nDigite o numero do veterinario que deseja acrescentar um endereco: ");
		index = Integer.parseInt(scan.nextLine());
		
		if( index <= quantidadeDeVeterinarios ) {
			
			veterinarios[index].setEndereco(cadastrarEndereco());
		}
		
		else {
			
			System.out.println("O veterinario nao existe");
		}
	}
	
	public static void cadastrarAnimalVet() {
		mostrarVeterinarios();
		System.out.println("\nDigite o numero do veterinario que deseja acrescentar um animal: ");
		index = Integer.parseInt(scan.nextLine());
		if(veterinarios[index] != null) {
			veterinarios[index].setAnimais(cadastrarAnimal());
		}
	}
	
	public static Animais cadastrarAnimal() {
		Animais animal = new Animais();
		
		System.out.println("Digite o nome do animal: ");
		animal.setNome(scan.nextLine());
		System.out.println("Digite a especie do animal: ");
		animal.setEspecie(scan.nextLine());
		System.out.println("Coloque uma descrição do animal: ");
		animal.setDescricao(scan.nextLine());
		
		return animal;
	}
	
	public static void mostrarAnimais() {
		mostrarVeterinarios();
		System.out.println("Digite o numero do veterinario: ");
		index = Integer.parseInt(scan.nextLine());
		Animais[] animais = new Animais[5];
		animais = veterinarios[index].getAnimais();
		int quantidadeAnimal = veterinarios[index].getQuantidadeAnimais();
		for( int i = 0; i < quantidadeAnimal; i++ ) {
			System.out.println("O veterinario '" + index + "' cuida dos seguintes animais: " + animais[i].toString());
		}
	}
	
	public static Animais escolherAnimal() {
		mostrarVeterinarios();
		System.out.println("Digite o numero do veterinario: ");
		index = Integer.parseInt(scan.nextLine());
		Animais[] animais = new Animais[5];
		animais = veterinarios[index].getAnimais();
		int quantidadeAnimal = veterinarios[index].getQuantidadeAnimais();
		for( int i = 0; i < quantidadeAnimal; i++ ) {
			System.out.print(i + ": ");
			System.out.println(animais[i].toString());
		}
		System.out.println("Escolha o numero do animal: ");
		int escolha = Integer.parseInt(scan.nextLine());
		if( escolha < quantidadeAnimal && escolha >= 0 ) {
			return veterinarios[index].getAnimais()[escolha];
		}
		return null;
		
	}
	
	public static Dono cadastrarDono() {
		Dono dono = new Dono();
		System.out.println("Digite o nome do dono: ");
		dono.setNome(scan.nextLine());
		System.out.println("Digite o endereco do dono: ");
		dono.setEndereco(cadastrarEndereco());
		System.out.println("Digite o CPF do dono: ");
		dono.setCpf(scan.nextLine());
		return dono;
	}
	
	public static void cadastrarDonoAnimal() {
		Animais animal = escolherAnimal();
		if(animal != null) {
			animal.setDono(cadastrarDono());
		}
	}
	
}