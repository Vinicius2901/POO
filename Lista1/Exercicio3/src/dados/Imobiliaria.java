package dados;

import java.util.Arrays;

public class Imobiliaria {
	private String nome;
	private Imovel[] listaDeImoveis = new Imovel[10];
	private int qtdImoveis = 0;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public void adcImovel( Imovel imovel ) {
		this.listaDeImoveis[qtdImoveis] = imovel;
		this.qtdImoveis++;
	}
	
	public String toString() {
		String imobiliaria = "";
		imobiliaria += "\nImobiliaria: " + nome;
		imobiliaria += "\nImoveis:\n" + Arrays.toString(listaDeImoveis);
		return imobiliaria;
	}
	
	public Imovel[] filtrarPorArea( float x ) {
		Imovel[] listaOrdenada = new Imovel[qtdImoveis];
		for( int i = 0; i < qtdImoveis; i++ ) {
			listaOrdenada[i] = this.listaDeImoveis[i];
		}
		for( int i = 0; i < qtdImoveis-1; i++ ) {
			Imovel menor = new Imovel();
			menor = listaOrdenada[i];
			for( int j = i+1; j < qtdImoveis; j++ ) {
				if( listaOrdenada[j].calculaArea() < menor.calculaArea() ) {
					menor = listaOrdenada[j];
					listaOrdenada[j] = listaOrdenada[i];
					listaOrdenada[i] = menor;
				}
			}
		}
		
		Imovel[] maiorQueX = new Imovel[10];
		int cont = 0;
		for( int i = 0; i < qtdImoveis; i++ ) {
			if( listaOrdenada[i].calculaArea() >= x ) {
				maiorQueX[cont] = listaOrdenada[i];
				cont++;
			}
		}
		return maiorQueX;
	}
}
