package apresentacao;

import java.util.Scanner;

import dados.Cidade;
import dados.Cliente;
import dados.Reserva;
import negocio.ReservaPassagem;

public class Main {
	private static ReservaPassagem reservaPassagem = new ReservaPassagem();
	private static Scanner scan = new Scanner(System.in);
	private static boolean existeCliente = false;
	private static boolean existeCidade = false;
	
	public static void main(String[] args) {
		menu();
	}
	
	public static void exibeOpcoes() {
		System.out.println("Digite o numero da opção que deseja:");
		System.out.println("0 - Encerrar sistema");
		System.out.println("1 - Realizar reservas");
		System.out.println("2 - Cadastrar cliente");
		System.out.println("3 - Mostrar reservas");
		System.out.println("4 - Cadastrar cidade");
		System.out.println("5 - Mostrar clientes");
		System.out.println("6 - Mostrar cidades");
	}
	
	public static void menu() {
		int opt = -1;
		while( opt != 0 ) {
			exibeOpcoes();
			opt = Integer.parseInt(scan.nextLine());
			switch( opt ) {
			case 0:
				System.out.println("Encerrando programa...");
				break;
			case 1:
                realizarReserva();
                break;
            case 2:
                cadastrarCliente();
                break;
            case 3:
                mostrarReservas();
                break;
            case 4:
                cadastrarCidade();
                break;
            case 5:
            	mostrarClientes();
            	break;
            case 6:
            	mostrarCidades();
            	break;
            default:
                System.out.println("Opcao invalida");
                break;
			}
		}
	}
		
	public static void mostrarClientes() {
		if( existeCliente == false ) {
			System.out.println("Nao ha cliente cadastrado");
		}
		else {
			for( int i = 0; i < reservaPassagem.getNumClientes(); i++ ) {
				System.out.println(reservaPassagem.mostrarClientes( i ));
			}
		}
	}
	
	public static Cliente escolherCliente() {
		mostrarClientes();
		
		System.out.println("Digite o CPF do cliente escolhido:");
		String cpf = scan.nextLine();
		Cliente cliente = reservaPassagem.buscaCliente( cpf );
		if( cliente != null ) {
			return cliente;
		}
		return null;
	}
	
	public static Cliente novoCliente() {
		Cliente nCliente = new Cliente();
		System.out.println("Digite o nome do cliente:");
		nCliente.setNome(scan.nextLine());
		
		System.out.println("Digite o CPF do cliente");
		nCliente.setCpf(scan.nextLine());
		
		System.out.println("Digite o endereco do cliente:");
		nCliente.setEndereco(scan.nextLine());
		
		System.out.println("Digite o telefone do cliente:");
		nCliente.setTelefone(Integer.parseInt(scan.nextLine()));
		
		return nCliente;
	}
	
	public static void cadastrarCliente() {
		reservaPassagem.cadastrarCliente(novoCliente());
		existeCliente = true;
	}
	
	public static void mostrarCidades() {
		if( existeCidade == false ) {
			System.out.println("Nao ha cidade cadastrada");
		}
		else {
			for( int i = 0; i < reservaPassagem.getNumCidades(); i++ ) {
				System.out.println(i + ": " + reservaPassagem.mostrarCidades( i ));
			}
		}
	}
	
	public static Cidade escolherCidade() {
		Cidade cidade = new Cidade();
		mostrarCidades();
		System.out.println("Digite o numero da cidade:");
		int index = Integer.parseInt(scan.nextLine());
		cidade = reservaPassagem.mostrarCidades( index );
		
		if( index > reservaPassagem.getNumCidades() ) {
			System.out.println("Numero invalido");
			return null;
		}
		
		return cidade;
	}
	
	public static Cidade novaCidade() {
		Cidade cidade = new Cidade();
		System.out.println("Digite o nome da cidade:");
		cidade.setNome(scan.nextLine());
		
		System.out.println("Digite o estado da cidade:");
		cidade.setEstado(scan.nextLine());
		
		return cidade;
	}
	
	public static void cadastrarCidade() {
		reservaPassagem.cadastrarCidade(novaCidade());
		existeCidade = true;
	}
	
	public static void realizarReserva() {
		
		if( existeCliente == false || existeCidade == false ) {
			System.out.println("Nao ha cliente ou cidade cadastrada");
		}
		else {
			Cliente cliente = new Cliente();
			cliente = escolherCliente();
			
			System.out.println("Digite qual opção deseja: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Reservar passagem de ida");
			System.out.println("2 - Reservar passagem de ida e volta");
			
			int opt = Integer.parseInt(scan.nextLine());
			
			switch( opt ) {
			case 1:
				Reserva reserva = new Reserva();
				System.out.println("Ida:");
				reserva = novaReserva();
				reservaPassagem.reservarIda( cliente, reserva );
				break;
			
			case 2:
				Reserva ida = new Reserva();
				Reserva volta = new Reserva();
				System.out.println("Ida:");
				ida = novaReserva();
				System.out.println("Volta:");
				volta = novaReserva();
				reservaPassagem.reservarVolta( cliente, ida, volta );
				break;
			default:
				break;
		}
		}
	}
	
	public static Reserva novaReserva() {
		Reserva res = new Reserva();
		
		System.out.println("Digite a data do voo:");
		res.setDataVoo(scan.nextLine());
		
		System.out.println("Digite a hora do voo:");
		res.setHoraVoo(scan.nextLine());
		
		System.out.println("Digite o preco do voo:");
		res.setPreco(Float.parseFloat(scan.nextLine()));
		
		System.out.println("Digite a classe do voo:");
		res.setClasseVoo(scan.nextLine());
		
		System.out.println("Digite o numero da poltrona:");
		res.setPoltrona(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Escolha a cidade de origem:");
		res.setOrigem(escolherCidade());
		
		System.out.println("Escolha a cidade de destino:");
		res.setDestino(escolherCidade());
		
		return res;
	}
	
	public static void mostrarReservas() {
		if( existeCliente == false || existeCidade == false ) {
			System.out.println("Nao ha cliente ou cidade cadastrada");
		}
		else {
			Cliente cliente = new Cliente();
			cliente = escolherCliente();
			if( cliente.getQtdReservas() == 0 ) {
				System.out.println("Nao ha reservas feitas nesse CPF ainda");
			}
			else {
				for( int i = 0; i < cliente.getQtdReservas(); i++ ) {
					System.out.println( reservaPassagem.mostrarReservas(cliente.getCpf(), i) );
				}
			}
		}
	}
}
