package persistencia;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dados.Pessoa;

public class PessoaDAO {
	private ArquivoPessoaDAO arquivoPessoaDAO = new ArquivoPessoaDAO();
	private int[] idMax = {12,18,25,59};
	
	public Map<Integer, List<Pessoa>> getAll() {
		Map<Integer, List<Pessoa>> mapPessoas = new HashMap<Integer, List<Pessoa>>();
		for( int i = 0; i < 5; i++ ) {
			List<Pessoa> lista = new LinkedList<Pessoa>();
			mapPessoas.put( i, lista );
		}
		
		List<Pessoa> listPessoas = arquivoPessoaDAO.lePessoas();
		
		for( Pessoa p : listPessoas) {
			int idade = p.getIdade();
			for( int i = 0; i < 5; i++ ) {
				if( i == 4 || idade <= idMax[i] ) {
					int index = 0;
					if( mapPessoas.get(i) != null ) {
						index = Math.abs(Collections.binarySearch(mapPessoas.get(i),p))-1;
					}
					mapPessoas.get(i).add( index, p );
					break;
				}
			}
		}
		return mapPessoas;
	}
}
