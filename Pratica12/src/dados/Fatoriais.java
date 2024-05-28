package dados;

public class Fatoriais extends Gerador {

	public void gerar( int n ) {
		int result = 1;
		for( int i = 1; i <= n; i++ ) {
			for( int j = i; j <= i; j++ ) {
				result *= j;
			}
			sequencia.add( result );
		}
	}

}
