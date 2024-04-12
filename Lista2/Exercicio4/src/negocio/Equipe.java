package negocio;

import java.util.ArrayList;
import java.util.List;

public class Equipe<Aluno> {
	private String nome;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
}
