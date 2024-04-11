package persistencia;

import java.util.LinkedList;
import java.util.List;

import dados.Contato;

public class ArquivoContatoDAO {
	private EditorTexto editorArquivo = new EditorTexto();
	private String caminho = "C:\\Users\\roniz\\OneDrive\\Documentos\\Vinicius\\UDESC\\POO\\Pratica5b\\contatos.csv";
	
	private String toCSV( Contato contato ) {
		String c = "";
		c += contato.getNome() + ",";
		c += contato.getTelefone();
		
		return c;
	}
	
	private Contato fromCSV(String s) {
		String atributos[] = s.split(",");
		
		Contato c = new Contato();
		c.setNome(atributos[0]);
		c.setTelefone(Integer.parseInt(atributos[1]));
		return c;
	}
	
	private List<Contato> stringToListaContato(List<String> contatos ) {
		List<Contato> listaContatos = new LinkedList<Contato>();
		
		for(String c : contatos) {
			listaContatos.add(fromCSV(c));
		}
		return listaContatos;
	}
	
	private List<String> listaContatosToString( List<Contato> contatos ) {
		List<String> listaContatos = new LinkedList<String>();
		
		for( Contato c : contatos ) {
			listaContatos.add(toCSV(c));
		}
		return listaContatos;
	}
	
	public List<Contato> leContatos() {
		return stringToListaContato(editorArquivo.leTexto(caminho));
	}
	
	public void salvaContatos( List<Contato> contatos ) {
		editorArquivo.gravaTexto(caminho, listaContatosToString(contatos));
	}
	
	public void salvaContato(Contato contato) {
		editorArquivo.gravaTexto(caminho, toCSV(contato));
	}
}
