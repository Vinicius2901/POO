package negocio;

import dados.Pessoa;
import dados.Sorteador;

public class Main {
	private static Sorteador sorteador = new Sorteador();
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		Pessoa pessoa5 = new Pessoa();
		Pessoa pessoa6 = new Pessoa();
		Pessoa pessoa7 = new Pessoa();
		Pessoa pessoa8 = new Pessoa();
		Pessoa pessoa9 = new Pessoa();
		Pessoa pessoa10 = new Pessoa();
		
		pessoa1.setNome("Vinicius");
		pessoa1.setCpf("11111111111");
		pessoa1.setIdade(19);
		
		pessoa2.setNome("Renan");
		pessoa2.setCpf("22222222222");
		pessoa2.setIdade(23);
		
		pessoa3.setNome("Douglas");
		pessoa3.setCpf("33333333333");
		pessoa3.setIdade(50);
		
		pessoa4.setNome("Vinicius");
		pessoa4.setCpf("11111111112");
		pessoa4.setIdade(19);
		
		pessoa5.setNome("Renan");
		pessoa5.setCpf("22222222232");
		pessoa5.setIdade(23);
		
		pessoa6.setNome("Douglas");
		pessoa6.setCpf("33333333433");
		pessoa6.setIdade(50);
		
		pessoa7.setNome("Vinicius");
		pessoa7.setCpf("11111115111");
		pessoa7.setIdade(19);
		
		pessoa8.setNome("Renan");
		pessoa8.setCpf("22222262222");
		pessoa8.setIdade(23);
		
		pessoa9.setNome("Douglas");
		pessoa9.setCpf("33333733333");
		pessoa9.setIdade(50);
		
		pessoa10.setNome("Douglas");
		pessoa10.setCpf("33383333333");
		pessoa10.setIdade(50);
		
		sorteador.adcPessoa(pessoa1);
		sorteador.adcPessoa(pessoa2);
		sorteador.adcPessoa(pessoa3);
		sorteador.adcPessoa(pessoa4);
		sorteador.adcPessoa(pessoa5);
		sorteador.adcPessoa(pessoa6);
		sorteador.adcPessoa(pessoa7);
		sorteador.adcPessoa(pessoa8);
		sorteador.adcPessoa(pessoa9);
		sorteador.adcPessoa(pessoa10);
	
		
		System.out.println("Lista antes:");
		System.out.println(sorteador);
		
		System.out.println("\n\nSorteado:");
		System.out.println(sorteador.sortearProximo());
		
		System.out.println("\n\nLista depois:");
		System.out.println(sorteador);
		
		
	}
}
