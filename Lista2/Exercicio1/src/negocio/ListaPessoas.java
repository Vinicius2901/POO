package negocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dados.Pessoa;
import persistencia.PessoaDAO;

public class ListaPessoas {
	private Map<Integer, List<Pessoa>> pessoas = new HashMap<Integer, List<Pessoa>>();
	private int[] idadeFinal = {12, 18, 25, 59};
	private PessoaDAO pessoaDAO = new PessoaDAO();
	
	
	public ListaPessoas() {
		for( int i = 0; i < 5; i++ ) {
			List<Pessoa> lista = new ArrayList<Pessoa>();
			pessoas.put( i, lista);
		}
	}
	
	public void addPessoas( Pessoa pessoa ) {
		 for(int i = 0; i < 5; i++){
	            if( i == 4 || pessoa.getIdade() <= idadeFinal[i] ){
	            	int index = 0;
	            	if( pessoas.get(i) != null ) {
	            		index = Math.abs(Collections.binarySearch(pessoas.get(i),pessoa))-1;
	            	}
	            	pessoas.get(i).add(index, pessoa);
	            	break;
	            }
		 }
	}
	
	public Map<Integer, List<Pessoa>> buscarPessoas() {
		return pessoas;
	}
	
	public void listarPessoas() {
		pessoas =  pessoaDAO.getAll();
	}
}