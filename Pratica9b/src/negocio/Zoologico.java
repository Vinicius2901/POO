package negocio;

import dados.Animal;
import dados.Aquario;
import dados.Peixe;
import dados.Viveiro;
import exceptions.EspacoIndisponivelException;
import exceptions.TemperaturaInadequadaException;

public class Zoologico {
	private Animal[] animais = new Animal[100];
	private Viveiro[] viveiros = new Viveiro[50];
	private int quantViveiros = 0;
	private int quantAnimais = 0;
	
	public Zoologico( int quantAnimais ) {
		animais = new Animal[quantAnimais];
	}
	public Zoologico() {
		
	}
	public Zoologico( int quantAnimais, int quantViveiros ) {
		animais = new Animal[quantAnimais];
		viveiros = new Viveiro[quantViveiros];
	}
	
	public Animal[] getAnimais() {
		return animais;
	}
	public Viveiro[] getViveiros() {
		return viveiros;
	}
	public int getQuantViveiros() {
		return quantViveiros;
	}
	public int getQuantAnimais() {
		return quantAnimais;
	}
	
	public void cadastrarViveiros( Viveiro viveiro ) {
		viveiros[quantViveiros] = viveiro;
		quantViveiros++;
	}
	
	public void cadastrarAnimais( Animal animal ) {
		animais[quantAnimais] = animal;
		quantAnimais++;
	}
	
	public Viveiro[] getSoViveiros() {
		int cont = 0;
		for( int i = 0; i < quantViveiros; i++ ) {
			if(!(viveiros[i] instanceof Aquario) ) {
				cont++;
			}
		}
		Viveiro[] apenasViv = new Viveiro[cont];
		int aux = 0;
		
		for( int i = 0; i < quantViveiros; i++ ) {
			if(!(viveiros[i] instanceof Aquario ) ) {
				apenasViv[aux] = viveiros[i];
				aux++;
			}
		}
		return apenasViv;
	}
	
	public Aquario[] getSoAquarios() {
		int cont = 0;
		for( int i = 0; i < quantViveiros; i++ ) {
			if( viveiros[i] instanceof Aquario ) {
				cont++;
			}
		}
		Aquario[] apenasAq = new Aquario[cont];
		int aux = 0;
		
		for( int i = 0; i < quantViveiros; i++ ) {
			if( viveiros[i] instanceof Aquario ) {
				apenasAq[aux] = (Aquario) viveiros[i];
				aux++;
			}
		}
		return apenasAq;
	}
	
	public void alocarAnimal( Animal animal, Viveiro viveiro ) throws EspacoIndisponivelException, TemperaturaInadequadaException {
		if( viveiro instanceof Aquario ) {
			if( animal instanceof Peixe ) {
				Aquario aquario = (Aquario) viveiro;
				Peixe peixe = (Peixe) animal;
				
				float espacoDisponivel = aquario.espacoDisponivel();
				float temperaturaAquario = aquario.getTemperatura();
				
				if( espacoDisponivel * 0.7 > peixe.calculaEspacoOcupado() ) {
					if( Math.abs(temperaturaAquario - peixe.getTemperaturaIdeal()) < 3 ) {
						aquario.adicionaAnimal(peixe);
					}
					else {
						throw new TemperaturaInadequadaException("Temperatura do aquario nao e adequada ao peixe");
					}
				}
				else  {
					throw new EspacoIndisponivelException("Nao ha espaco para o peixe nesse aquario");
				}
			}
		}
		else if(!(viveiro instanceof Aquario)) {
			if(!(animal instanceof Peixe)) {
				float espacoDisponivel = viveiro.espacoDisponivel();
				if( espacoDisponivel * 0.7 > animal.calculaEspacoOcupado() ) {
					viveiro.adicionaAnimal(animal);
				}
				else {
					throw new EspacoIndisponivelException("Nao ha espaco para o animal nesse viveiro");
				}
			}
			
		}
		
	}
}
