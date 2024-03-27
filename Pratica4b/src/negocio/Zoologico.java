package negocio;

import dados.Animal;
import dados.Viveiro;

public class Zoologico {
	private Animal[] animais = new Animal[100];
	private Viveiro[] viveiros = new Viveiro[50];
	private int quantVivieros = 0;
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
	
	
}
