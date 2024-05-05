package apresentacao;

import dados.Circulo;
import dados.FormaGeometrica;
import dados.Losango;
import dados.TrianguloEquilatero;

public class Main {

	public static void main(String[] args) {
		FormaGeometrica forma;
		forma = new TrianguloEquilatero();
		((TrianguloEquilatero)forma).setLado( 3 );
		System.out.println( forma );
		
		forma = new TrianguloEquilatero();
		((TrianguloEquilatero)forma).setLado( 10 );
		System.out.println( forma );
		
		forma = new Losango();
		((Losango)forma).setD(4);
		((Losango)forma).setd(2);
		System.out.println( forma );
		
		forma = new Losango();
		((Losango)forma).setD(8);
		((Losango)forma).setd(4);
		System.out.println( forma );
		
		forma = new Circulo();
		((Circulo)forma).setRaio(1);
		System.out.println( forma );
		
		forma = new Circulo();
		((Circulo)forma).setRaio(4);
		System.out.println( forma );
	}

}
