package dados;

import java.util.Arrays;
import java.util.Random;

public class Sorteador {
	private Pessoa[] listaDePessoas = new Pessoa[10];
	private Random gerador = new Random();
	private int qtdPessoas = 0;
	
	public void adcPessoa( Pessoa pessoa ) {
		this.listaDePessoas[qtdPessoas] = pessoa;
		qtdPessoas++;
	}
	
	
	public Pessoa sortearProximo() {
		int nGerado = gerador.nextInt(qtdPessoas);
		Pessoa sorteado = new Pessoa();
		for( int i = 0; i < qtdPessoas && i < 9; i++ ) {
			if( i == nGerado ) {
				sorteado = listaDePessoas[i];
				listaDePessoas[i] = listaDePessoas[i+1];
			}
			else if( i > nGerado && i < qtdPessoas-1 ) {
				listaDePessoas[i] = listaDePessoas[i+1];
			}
		}
		listaDePessoas[qtdPessoas-1] = null;
		qtdPessoas--;
		return sorteado;
	}
	
	public String toString() {
		String sorteador = "";
		sorteador += "\nPessoas: " + Arrays.toString(listaDePessoas);
		return sorteador;
	}
}
