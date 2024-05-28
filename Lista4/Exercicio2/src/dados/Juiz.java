package dados;

import exceptions.PilhaCheiaException;

public class Juiz {
	private String nome;
	private Pilha<Processo> processos;
	
	public String getNome() {
		return nome;
	}
	
	public Pilha<Processo> getProcessos() {
		return processos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Juiz( int limite ) {
		processos = new Pilha<Processo>(limite);
	}
	
	public void cadastrarProcesso( Processo p ) throws PilhaCheiaException {
		processos.inserir(p);
	}
}
