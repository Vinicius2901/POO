package persistencia;

import java.util.LinkedList;
import java.util.List;

import dados.Aluno;

public class ArquivoAlunoDAO {
	private EditorTexto editorTexto = new EditorTexto();
	private String caminho = "C:\\Users\\vinic\\OneDrive\\Documents\\UDESC\\POO\\Lista2\\Exercicio4\\alunos.txt";
	public Aluno fromCSV( String s ) {
		String atributos[] = s.split(",");
		Aluno a = new Aluno();
		a.setNome(atributos[0]);
		a.setIdade(Integer.parseInt(atributos[1]));
		Double[] notas = {Double.parseDouble(atributos[2]),Double.parseDouble(atributos[3]),
				Double.parseDouble(atributos[4]),Double.parseDouble(atributos[5]),Double.parseDouble(atributos[6])};
		a.setNotas(notas);
		return a;
	}
	
	public List<Aluno> stringToListaAlunos( List<String> aluno ) {
		List<Aluno> alunos = new LinkedList<Aluno>();
		
		for( String s : aluno ) {
			alunos.add(fromCSV(s));
		}
		
		return alunos;
	}
	
	public List<Aluno> leAlunos() {
		return stringToListaAlunos(editorTexto.leTexto(caminho));
	}
}
