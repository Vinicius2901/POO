package negocio;

import java.util.ArrayList;
import java.util.List;

import dados.Aluno;

public class Turma {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public void adicionarAluno( Aluno aluno ) {
		alunos.add(aluno);
	}
	
	private void ordenaAlunosPorMedia() {
		for( int i = 0; i < alunos.size() - 1; i++ ) {
			Aluno aux = alunos.get(i);
			for( int j = i + 1; j < alunos.size(); j++ ) {
				if( alunos.get(j).calcularMedia() < aux.calcularMedia() ) {
					aux = alunos.get(j);
					alunos.set( j, alunos.get(i) );
					alunos.set( i, aux );
				}
			}
		}
	}
	
	public List<Equipe<Aluno>> separarEmEquipes() {
		ordenaAlunosPorMedia();
	}
}
