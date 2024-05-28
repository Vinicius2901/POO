package dados;

public class Fibonacci extends Gerador {
	public void gerar( int n ) {
		int fi1 = 0;
		int fi2 = 1;
		
		sequencia.add( fi1 );
		sequencia.add( fi2 );
		
		for( int i = 2; i <= n; i++ ) {
			sequencia.add(sequencia.get(sequencia.size() - 1) + sequencia.get(sequencia.size() - 2));
		}
	}
	
}
