package negocio;

import java.util.Scanner;

import dados.Aluguel;
import dados.Carro;
import dados.Cliente;
import dados.Endereco;
import dados.Moto;

public class Sistema {
	private static Aluguel[] alugueis = new Aluguel[10];
	private static Cliente[] clientes = new Cliente[10];
	private static Moto[] motos = new Moto[10];
	private static Carro[] carros = new Carro[10];
	private static int qtdAluguel = 0;
	private static int qtdClientes = 0;
	private static int qtdMotos = 0;
	private static int qtdCarros = 0;
	private static Scanner scan = new Scanner( System.in );
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		Aluguel aluguel = new Aluguel();
		cliente.setCpf("11111111111");
		cliente.setNome("Vinicius");
		cliente.setIdade(19);
		endereco.setRua("Agata");
		endereco.setNumero(1005);
		endereco.setCep("89220780");
		endereco.setCidade("Joinville");
		endereco.setBairro("Iririu");
		endereco.setEstado("Santa Catarina");
		cliente.setEndereco(endereco);
		clientes[0] = cliente;
		qtdClientes++;
		aluguel.setCliente(cliente);
		Moto moto = new Moto( "RGB12F3" );
		moto.setAno(2020);
		moto.setCor("Preta");
		moto.setMarca("Honda");
		moto.setModelo("Sahara 300");
		aluguel.setMoto(moto);
		aluguel.seteMoto(true);
		moto.setAlugado(true);
		qtdMotos++;
		motos[0] = moto;
		aluguel.seteCarro(false);
		aluguel.setInicioAluguel("21/03/2024");
		aluguel.setRetornoAluguel("30/03/2024");
		alugueis[0] = aluguel;
		qtdAluguel++;
		
		Cliente cliente1 = new Cliente();
		Endereco endereco1 = new Endereco();
		Aluguel aluguel1 = new Aluguel();
		
		cliente1.setCpf("22222222222");
		cliente1.setNome("Duda");
		cliente1.setIdade(18);
		endereco1.setRua("Timbo");
		endereco1.setNumero(2667);
		endereco1.setCep("89221456");
		endereco1.setCidade("Joinville");
		endereco1.setBairro("Costa e Silva");
		endereco1.setEstado("Santa Catarina");
		cliente1.setEndereco(endereco1);
		clientes[1] = cliente1;
		aluguel1.setCliente(cliente1);
		qtdClientes++;
		Carro carro = new Carro( "QJR01B2" );
		carro.setAno(2022);
		carro.setCor("Prata");
		carro.setMarca("Honda");
		carro.setModelo("Civic");
		aluguel1.setCarro(carro);
		aluguel1.seteCarro(true);
		carro.setAlugado(true);
		qtdCarros++;
		carros[0] = carro;
		aluguel1.seteMoto(false);
		aluguel1.setInicioAluguel("21/03/2024");
		aluguel1.setRetornoAluguel("30/03/2024");
		alugueis[1] = aluguel1;
		qtdAluguel++;
		
		Carro carro1 = new Carro( "QDE01A2" );
		carro1.setAno(2017);
		carro1.setCor("Branco");
		carro1.setMarca("Audi");
		carro1.setModelo("Q3");
		carro1.setAlugado(false);
		carros[1] = carro1;
		qtdCarros++;
		
		Moto moto1 = new Moto( "QFY80G0" );
		moto1.setAno(2023);
		moto1.setCor("Branca");
		moto1.setMarca("Honda");
		moto1.setModelo("Sahara 300");
		moto1.setAlugado(false);
		motos[1] = moto1;
		qtdMotos++;
		
		System.out.println("\nLista de motos:");
		for( int i = 0; i < qtdMotos; i++ ) {
			System.out.println( motos[i] );
		}
		System.out.println("");
		
		System.out.println("\nLista de carros:");
		for( int i = 0; i < qtdCarros; i++ ) {
			System.out.println( carros[i] );
		}
		System.out.println("");
		
		System.out.println("\nLista de Clientes:");
		for( int i = 0; i < qtdClientes; i++ ) {
			System.out.println( clientes[i] );
		}
		System.out.println("");
		
		System.out.println("\nLista de Alugueis:");
		for( int i = 0; i < qtdAluguel; i++ ) {
			System.out.println( alugueis[i] );
		}
		System.out.println("");
		
		Cliente cpf = new Cliente();
		System.out.println("Digite o cpf do cliente: ");
		cpf.setCpf(scan.nextLine());
		for( int i = 0; i < qtdClientes; i++ ) {
			if( cpf.equals(clientes[i])) {
				System.out.println( clientes[i] );
			}
		}
		
	}
}
