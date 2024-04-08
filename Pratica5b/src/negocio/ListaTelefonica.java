package negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dados.Contato;

public class ListaTelefonica {
	private Map<Character, List<Contato>> contatos = new HashMap<Character, List<Contato>>();
	
	public ListaTelefonica() {
		for( char i = 'A'; i <= 'Z'; i++ ) {
			List<Contato> lista = new ArrayList<Contato>();
			contatos.put( i, lista );
		}
	}
	
	public void adicionarContato( Contato contato ) {
		contato.getNome().toUpperCase();
		char primeiro = contato.getNome().charAt(0);
		if( primeiro >= 'A'  && primeiro <= 'Z' ) {
			contatos.get(primeiro).add(contato);
		}
	}
	
	public Boolean removerContato( Contato contato ) {
		contato.getNome().toUpperCase();
		char primeiro = contato.getNome().charAt(0);
		if( primeiro >= 'A' && primeiro <= 'Z' ) {
			return contatos.get(primeiro).remove(contato);		
		}
		return false;
	}
	
	public List<Contato> buscarContatos( char letra ) {
		if( letra >= 'A' && letra <= 'Z' ) {
			return contatos.get(letra);
		}
		return null;
	}
	
	public Map<Character, List<Contato>> buscarContatos() {
		return contatos;
	}
}
