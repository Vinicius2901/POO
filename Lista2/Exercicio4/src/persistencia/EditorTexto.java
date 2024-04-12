package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class EditorTexto {
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
			System.out.println("Erro na leitura do arquivo");
			System.exit(0);
		}
		return dados;
	}
}
