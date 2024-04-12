package persistencia;

import java.util.LinkedList;
import java.util.List;

import dados.Pessoa;

public class ArquivoPessoaDAO {
	
	private EditorTexto editorArquivo = new EditorTexto();
	private String caminho = "C:\\Users\\vinic\\OneDrive\\Documents\\UDESC\\POO\\Lista2\\Exercicio1\\pessoas.txt";
	
	private Pessoa fromCSV(String s) {
		String atributos[] = s.split(",");
		
		Pessoa p = new Pessoa();
		p.setNome(atributos[0]);
		p.setIdade(Integer.parseInt(atributos[1]));
		p.setCpf(atributos[2]);
		p.setCidade(atributos[3]);
		return p;
	}
	
	private List<Pessoa> stringToListaPessoa( List<String> pessoa ) {
		List<Pessoa> pessoas = new LinkedList<Pessoa>();
		
		for( String s: pessoa ) {
			pessoas.add(fromCSV(s));
		}
		
		return pessoas;
	}
	
	public List<Pessoa> lePessoas() {
		return stringToListaPessoa(editorArquivo.leTexto(caminho));
	}
}
