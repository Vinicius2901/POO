package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Digrafo {
	protected Map<Integer, List<Integer>> matrizAdjacencia;
	
	public Digrafo( int nVertices ) {
		matrizAdjacencia = new HashMap<Integer, List<Integer>>();
		for( int i = 0; i <= nVertices; i++ ) {
			matrizAdjacencia.put( i, new ArrayList<Integer>() );
		}
	}
	
	public Digrafo() {
		matrizAdjacencia = new HashMap<Integer, List<Integer>>();
	}
	
	public void adicionarVertice() {
		int tam = matrizAdjacencia.size();
		for( int i = 0; i <= tam; i++ ) {
			if( i == matrizAdjacencia.size() ) {
				matrizAdjacencia.put( i, new ArrayList<Integer>(Collections.nCopies(i, 0)) );
			}
			matrizAdjacencia.get(i).add(0);
		}
	}
	
	public void adicionarAresta( int origem, int destino ) {
		matrizAdjacencia.get(origem).set( destino, 1 );
	}
	
	public String toString() {
		String digrafo = "";
		for( int i : matrizAdjacencia.keySet() ) {
			digrafo += i + ":";
			for( int j : matrizAdjacencia.get(i) ) {
				digrafo += "\t" + j;
			}
			digrafo += "\n";
		}
		return digrafo;
	}
}
