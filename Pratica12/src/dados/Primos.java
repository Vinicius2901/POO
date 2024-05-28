package dados;

public class Primos extends Gerador {
	public void gerar( int n ) {
		int primo = 2;
		while ( sequencia.size() < n ) {
			int cont = 0;
			for( int i = 1; i <= Math.abs(Math.sqrt(primo)); i++ ) {
				if( primo % i == 0 ) {
					cont++;
					if( i != Math.abs(Math.sqrt(primo))) {
						cont++;
					}
				}
			}
			if( cont == 2 ) {
				sequencia.add( primo );
			}
			primo++;
		}
	}
}
