package negocio;

import java.util.ArrayList;
import java.util.List;

import dados.Aluno;
import persistencia.AlunoDAO;

public class Turma {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private AlunoDAO alunoDAO = new AlunoDAO();
	
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
		List<Equipe<Aluno>> grupos = new ArrayList<Equipe<Aluno>>();;
		int count = 0;
		int aux = 1;
		int ngrupo = 0;
		for( int i = 0; i <= alunos.size()/2; i += 2 ) {
			ngrupo++;
			Equipe<Aluno> equipeTemp = new Equipe<Aluno>();
			List<Aluno> alunosTemp = new ArrayList<Aluno>();
			switch( alunos.size() % 3 ) {
			case 0:
				alunosTemp.add( alunos.get(i));
				alunosTemp.add( alunos.get(i+1));
				alunosTemp.add( alunos.get(alunos.size() - aux));
				aux++;
				count += 3;
				equipeTemp.setNome("Equipe" + ngrupo);
				equipeTemp.setAlunos(alunosTemp);
				grupos.add(equipeTemp);
				break;
			case 1:
				if( count < alunos.size() - 4 ) {
					alunosTemp.add(alunos.get(i));
					alunosTemp.add(alunos.get(i+1));
					alunosTemp.add(alunos.get(alunos.size() - aux));
					aux++;
					count += 3;
					equipeTemp.setNome("Equipe" + ngrupo);
					equipeTemp.setAlunos(alunosTemp);
					grupos.add(equipeTemp);
				}
				else {
					alunosTemp.add( alunos.get(i));
					alunosTemp.add( alunos.get(i+1));
					alunosTemp.add( alunos.get(alunos.size()-aux));
					aux++;
					alunosTemp.add( alunos.get(alunos.size() - aux));
					aux++;
					count += 4;
					equipeTemp.setNome("Equipe" + ngrupo);
					equipeTemp.setAlunos(alunosTemp);
					grupos.add(equipeTemp);
				}
				break;
			case 2:
				if( count < alunos.size() - 5 ) {
					alunosTemp.add( alunos.get(i));
					alunosTemp.add( alunos.get(i+1));
					alunosTemp.add( alunos.get(alunos.size()-aux));
					aux++;
					alunosTemp.add( alunos.get(alunos.size() - aux));
					aux++;
					count += 4;
					equipeTemp.setNome("Equipe" + ngrupo);
					equipeTemp.setAlunos(alunosTemp);
					grupos.add(equipeTemp);
				}
				else {
					alunosTemp.add( alunos.get(i));
					alunosTemp.add( alunos.get(i+1));
					alunosTemp.add( alunos.get(alunos.size() - aux));
					aux++;
					count += 3;
					equipeTemp.setNome("Equipe" + ngrupo);
					equipeTemp.setAlunos(alunosTemp);
					grupos.add(equipeTemp);
				}
				break;
			}
		}
		return grupos;
	}
	
	public List<Aluno> buscarAlunos() {
		return alunos;
	}
	
	public void listarAlunos() {
		alunos = alunoDAO.getAll();
	}
}
