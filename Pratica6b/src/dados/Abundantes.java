package dados;

public class Abundantes extends Gerador {
	public void gerar( int n ) {
		int numero = 12;
		while( sequencia.size() < n ) {
			int cont = 1;
			for( int i = 2; i < Math.abs(Math.sqrt(numero)); i++ ) {
				if( numero % i == 0 ) {
					cont += i;
					if( cont != Math.abs(Math.sqrt(numero))) {
						cont += numero/i;
					}
				}
			}
			if( cont > numero ) {
				sequencia.add( numero );
			}
			numero++;
		}
	}
}