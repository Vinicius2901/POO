package apresentacao;

import dados.Digrafo;
import dados.Grafo;

public class Main {
	public static void main(String[] args) {
		Digrafo digrafo = new Digrafo();
		digrafo.adicionarVertice();
		digrafo.adicionarVertice();
		digrafo.adicionarVertice();
		digrafo.adicionarAresta(0, 0);
		digrafo.adicionarAresta(0, 1);
		System.out.println(digrafo);
		
		Grafo grafo = new Grafo();
		for( int i = 0; i < 3; i++ ) {
			grafo.adicionarVertice();
		}
		grafo.adicionarAresta(0, 0);
		grafo.adicionarAresta(0, 1);
		System.out.println( grafo );
	}
}
