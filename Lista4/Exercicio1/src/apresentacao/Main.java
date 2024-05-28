package apresentacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dados.MDC;
import dados.Mod;
import dados.Multiplicacao;
import dados.Soma;

public class Main {
	public static void main(String[] args) {
		List<Object> lista = new ArrayList<>();
		lista.add( new Soma() );
		lista.add( new Multiplicacao() );
		lista.add( new MDC() );
		lista.add( new Mod() );
		
		Random r = new Random();
		
		for( Object obj : lista ) {
			int random1 = r.nextInt(100);
			int random2 = r.nextInt(100);
			if( obj instanceof Multiplicacao ) {
				System.out.println(random1 + " * " + random2 + " = " + ((Multiplicacao)obj).executar(random1, random2));
			}
			else if( obj instanceof Soma ) {
				System.out.println(random1 + " + " + random2 + " = " + ((Soma)obj).executar(random1, random2));
			}
			else if( obj instanceof MDC ) {
				System.out.println("MDC(" + random1 + ", " + random2 + ") = " + ((MDC)obj).executar(random1, random2));
			}
			else if( obj instanceof Mod ) {
				System.out.println(random1 + " % " + random2 + " = " + ((Mod)obj).executar(random1, random2));
			}
		}
	}
}
