package dados;

import java.util.ArrayList;
import java.util.List;

import exceptions.PilhaCheiaException;
import exceptions.PilhaVaziaException;

public class Pilha<T> {
	private int limite;
	private List<T> elementos;
	
	public int getLimite() {
		return limite;
	}
	
	public Pilha( int limite ) {
		this.limite = limite;
		elementos = new ArrayList<T>();
	}
	
	public void inserir( T object ) throws PilhaCheiaException {
		if( elementos.size() == limite ) {
			throw new PilhaCheiaException("A pilha esta cheia");
		}
		else {
			elementos.add(object);
		}
	}
	
	public void remover() throws PilhaVaziaException {
		if( elementos.size() == 0 ) {
			throw new PilhaVaziaException("A pilha esta vazia");
		}
		else {
			elementos.remove(elementos.size()-1);
		}
	}
	
	public int getSize() {
		return elementos.size();
	}
	
}
