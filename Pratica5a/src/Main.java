import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		Map<Integer, List<Integer>> tabMap = new HashMap<Integer, List<Integer>>();
		tabMap = nETabuada();
		
		/*tabMap.forEach(
			( chave, tabuada) -> {
				
				System.out.print("Tabuada de " + chave + ": ");
				
				for( int x: tabuada ) {
					System.out.print( x + " ");
				}
				System.out.println();	
			}
		);*/
		// OU
		
		for( Integer tab : tabMap.keySet() ) {
			System.out.print("Tabuada de " + tab + ": ");
			for( int valor : tabMap.get(tab) ) {
				System.out.print(valor + " " );
			}
			System.out.println();
		}
		
	}
	
	
	public static List<Integer> tabuada( int n ) {
		List<Integer> tabuada = new ArrayList<Integer>();
		for( int i = 1; i <= 10; i++ ) {
			tabuada.add( n * i );
		}
		return tabuada;
	}
	
	public static Map<Integer, List<Integer>> nETabuada() {
		Map<Integer, List<Integer>> mapaTabuada = new HashMap<Integer, List<Integer>>();
		for( int i = 1; i <= 10; i++ ) {
			mapaTabuada.put( i, tabuada(i) );
		}
		return mapaTabuada;
	}
}
