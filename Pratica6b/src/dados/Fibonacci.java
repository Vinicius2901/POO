package dados;

public class Fibonacci extends Gerador {
	public void gerar( int n ) {
		int fi1 = 0;
		int fi2 = 1;
		int fn = fi1+fi2;
		
		sequencia.add( fi1 );
		sequencia.add( fi2 );
		sequencia.add( fn );
		
		for( int i = 2; i <= n; i++ ) {
			fi1 = fi2;
			fi2 = fn;
			fn = fi1 + fi2;
			sequencia.add( fn );
		}
	}
	
}
