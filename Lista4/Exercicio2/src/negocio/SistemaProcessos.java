package negocio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import dados.Juiz;
import dados.Processo;
import exceptions.PilhaCheiaException;
import exceptions.ProcessoSemJuizException;

public class SistemaProcessos {
	List<Processo> processos = new ArrayList<>();
	List<Juiz> juizes = new ArrayList<>();
	Random rand = new Random();
	
	public void cadastrarProcesso( Processo p ) {
		processos.add(p);
	}
	
	public void cadastrarJuizes( Juiz j ) {
		juizes.add(j);
	}
	
	public void distribuirProcessos() throws ProcessoSemJuizException {
	    List<Integer> indicesDisponiveis = new LinkedList<Integer>();
	    for (Juiz j : juizes) {
	        if (j.getProcessos().getSize() < j.getProcessos().getLimite()) {
	            indicesDisponiveis.add(juizes.indexOf(j));
	        }
	    }

	    for (Processo p : processos) {
	        if (indicesDisponiveis.isEmpty()) {
	            throw new ProcessoSemJuizException("Nao ha juizes disponiveis para receber mais processos.");
	        }
	        
	        int juizR = rand.nextInt(indicesDisponiveis.size());
	        Juiz juizTmp = juizes.get(indicesDisponiveis.get(juizR));
	        try {
	            juizTmp.cadastrarProcesso(p);
	            if( juizTmp.getProcessos().getLimite() == juizTmp.getProcessos().getSize() ) {
	            	indicesDisponiveis.remove(juizR);
	            }
	        } catch (PilhaCheiaException e) {
	        	System.out.println( e.getMessage() );
	        }
	    }
	}

}
