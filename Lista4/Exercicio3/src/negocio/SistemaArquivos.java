package negocio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dados.Arquivo;
import dados.Documento;
import dados.Musica;
import dados.Qualidade;
import dados.Video;
import exceptions.NomeInvalidoException;

public class SistemaArquivos {
	Map<String, List<Arquivo>> diretorios = new HashMap<String, List<Arquivo>>();
	
	public SistemaArquivos() {
		diretorios.put("Downloads", new LinkedList<Arquivo>());
		diretorios.put("Area de trabalho", new LinkedList<Arquivo>());
	}
	
	public void criarDocumento(String nome, String diretorio, String texto) throws NomeInvalidoException {
		Documento documento = new Documento(nome);
		documento.setTexto(texto);
		diretorios.get(diretorio).add(documento);
	}
	
	public void criarMusica( String nome, String diretorio, int duracao ) throws NomeInvalidoException {
		Musica musica = new Musica(nome);
		musica.setDuracao(duracao);
		diretorios.get(diretorio).add(musica);
	}
	
	public void criarVideo( String nome, String diretorio, Qualidade qualidade ) throws NomeInvalidoException {
		Video video = new Video(nome);
		video.setQualidade(qualidade);
		diretorios.get(diretorio).add(video);
	}
	
	public String toString() {
		String sist = "";
		for( String s : diretorios.keySet() ) {
			sist += s + ":\n\n";
			for( Arquivo a : diretorios.get(s) ) {
				sist += "\t" + a;
			}
		}
		return sist;
	}
}
