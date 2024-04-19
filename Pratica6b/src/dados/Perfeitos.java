package dados;

public class Perfeitos extends Gerador {
	public void gerar( int n ) {
		int perfeito = 6;
		while( sequencia.size() < n ) {
			int div = 1;
			for( int i = 2; i <= Math.sqrt(perfeito); i++ ) {
				if( perfeito % i == 0 ) {
					div += i;
					if( i != Math.sqrt(perfeito)) {
						div += perfeito/i;
					}
				}
			}
			if( div == perfeito ) {
				sequencia.add( perfeito );
			}
			perfeito++;
		}
	}
}
