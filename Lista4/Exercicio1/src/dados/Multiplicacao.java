package dados;

public class Multiplicacao extends Soma {
	public int executar( int valor1, int valor2 ) {
		int mult = 0;
		for( int i = 0; i < valor2; i++ ) {
			mult += super.executar( valor1, 0 );
		}
		return mult;
	}
}
