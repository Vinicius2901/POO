package apresentacao;

import dados.Juiz;
import dados.Processo;
import exceptions.ProcessoSemJuizException;
import negocio.SistemaProcessos;

public class Main {
	private static SistemaProcessos sistema = new SistemaProcessos();
	
	public static void main(String[] args) {
		Juiz juiz1 = new Juiz(5);
		Juiz juiz2 = new Juiz(5);
		Juiz juiz3 = new Juiz(5);
		sistema.cadastrarJuizes(juiz1);
		sistema.cadastrarJuizes(juiz2);
		sistema.cadastrarJuizes(juiz3);
		for( int i = 0; i < 18; i++ ) {
			Processo processo = new Processo();
			processo.setId(i);
			processo.setNome("Processo " + i);
			sistema.cadastrarProcesso(processo);
		}
		
		try {
			sistema.distribuirProcessos();
		}
		catch( ProcessoSemJuizException e ) {
			System.out.println(e.getMessage());
		}
	}
}
