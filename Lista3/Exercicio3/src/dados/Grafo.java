package dados;


public class Grafo extends Digrafo {
	public void adicionarAresta( int origem, int destino ) {
		matrizAdjacencia.get(origem).set( destino, 1 );
		matrizAdjacencia.get(destino).set( origem, 1 );
	}
}
