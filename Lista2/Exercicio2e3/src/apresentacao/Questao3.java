package apresentacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import dados.Matriz;
import dados.Quadrante;

public class Questao3 {
	private static Scanner scan = new Scanner(System.in);
	private static Matriz<Integer> matriz = new Matriz<Integer>(5,5);
	
	public static void main(String[] args) {
		int n = 0;
		for( int i = 0; i < 5 && n != -1; i++ ) {
			for( int j = 0; j < 5; j++ ) {
				System.out.println("Digite um numero da matriz (digite -1 para sair)");
				n = Integer.parseInt(scan.nextLine());
				if( n == -1 ) {
					break;
				}
				matriz.set( n, i, j );
			}
		}
		Map<Integer, Quadrante> quadrantes = new HashMap<Integer, Quadrante>();
		quadrantes.put( 0, Quadrante.PRIMEIRO );
		quadrantes.put( 1, Quadrante.SEGUNDO );
		quadrantes.put( 2, Quadrante.TERCEIRO );
		quadrantes.put( 3, Quadrante.QUARTO );
		List<Integer> aux = new ArrayList<Integer>();
		int menor = -1;
		for( int i = 0; i < 4; i++ ) {
			List<Integer> iQuadrante = matriz.getElementosQuadrante(quadrantes.get(i));
			if( iQuadrante.get(0) != null ) {
				menor = iQuadrante.get(0);
				for( int j = 0; j < iQuadrante.size(); j++ ) {
					if( iQuadrante.get(j) != null && iQuadrante.get(j) < menor ) {
						menor = iQuadrante.get(j);
					}
				}
			}
			aux.add(menor);
			menor = -1;
		}
		for( int i = 0; i < 4; i++ ) {
			if( aux.get(i) != -1 ) {
				menor = aux.get(i);
			}
		}
		for( int i = 0; i < 4; i++ ) {
			if( aux.get(i) != -1 && aux.get(i) < menor ) {
				menor = aux.get(i);
			}
		}
		if( menor == -1 ) {
			System.out.println("A matriz e nula");
		}
		else {
			System.out.println( "Menor termo da matriz: " + menor );
		}
	}
}
