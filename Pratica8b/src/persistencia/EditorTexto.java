package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.FileReader;

public class EditorTexto {
	public void gravaTexto( String caminho, List<String> dados ) { // exclusao de um contato.
		Writer arquivo;
		
		try {
			arquivo = new FileWriter(caminho);
			for( String i : dados ) {
				arquivo.write( i + "\n");
			}
			arquivo.close();
		}
		catch( IOException e ) {
			System.err.println("Erro na escrita do arquivo.");
			System.exit(0);
		}
	}
	
	public void gravaTexto( String caminho, String linha ) { // Adicao de contato.
		Writer arquivo;
		try {
			arquivo = new FileWriter( caminho, true ); // True indica que o arquvio sera aberto para alteração apenas no final.
			arquivo.write( linha + "\n" );
			arquivo.close();
		}
		catch( IOException e ) {
			System.err.println("Erro na escrita do arquivo.");
			System.exit(0);
		}
	}
	
	public List<String> leTexto( String caminho ) {
		List<String> dados = new ArrayList<String>();
		Reader arquivo;
		BufferedReader r;
		
		try {
			arquivo = new FileReader(caminho);
			r = new BufferedReader(arquivo);
			
			String s = r.readLine();
			
			while( s != null ) {
				dados.add(s);
				s = r.readLine();
			}
			arquivo.close();
		}
		catch( IOException e ) {
			System.err.println("Erro na leitura do arquivo.");
			System.exit(0);
		}
		return dados;
	}
}
