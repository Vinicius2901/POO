package dados;

public class Quadrados extends Gerador {
	public void gerar( int n ) {
		while( sequencia.size() < n ) {
			for( int i = 1; i <= n; i++ ) {
				sequencia.add( i * i );
			}
		}
	}
}
