package dados;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Matriz<T> {
	private int linhas, colunas;
	private List<List<T>> matriz;
	
	public Matriz( int l, int c ) {
		this.linhas = l;
		this.colunas = c;
		matriz = new ArrayList<List<T>>(l);
		for( int i = 0; i < this.linhas; i++ ) {
			matriz.add( new ArrayList<T>(Collections.nCopies(this.colunas, null)));
		}
	}
	
	public boolean set( T objeto, int i, int j ) {
		if( i > linhas || j > colunas ) {
			return false;
		}
		matriz.get(i).set(j, objeto);
		return true;
	}
	
	public T get( int i, int j ) {
		if( i > linhas || j > colunas ) {
			return null;
		}
		return matriz.get(i).get(j);
	}
	
	public List<T> getLinha( int linha ) {
		if( linha > this.linhas ) {
			return null;
		}
		return matriz.get(linha);
	}
	
	public List<T> getColuna( int coluna ) {
		if( coluna > this.colunas ) {
			return null;
		}
		List<T> colunaTemp = new ArrayList<T>();
		for( int i = 0; i < linhas; i++ ) {
			colunaTemp.add(matriz.get(i).get(coluna));
		}
		return colunaTemp;
	}
	
	public List<T> getElementosQuadrante( Quadrante quadrante ) {
		List<T> elemTemp = new ArrayList<T>();
		for( int i = 0; i < linhas; i++ ) {
			for( int j = 0; j < colunas; j++ ) {
				switch( quadrante ) {
				case SEGUNDO:
					if( i <= linhas/2 && j > colunas/2 ) {
						elemTemp.add(matriz.get(i).get(j));
					}
					break;
				case PRIMEIRO:
					if( i <= linhas/2 && j <= colunas/2 ) {
						elemTemp.add(matriz.get(i).get(j));
					}
					break;
				case TERCEIRO:
					if( i > linhas/2 && j <= colunas/2 ) {
						elemTemp.add(matriz.get(i).get(j));
					}
					break;
				case QUARTO:
					if( i > linhas/2 && j > colunas/2 ) {
						elemTemp.add(matriz.get(i).get(j));
					}
					break;
				}
			}
		}
		return elemTemp;
	}
	
	
		
}