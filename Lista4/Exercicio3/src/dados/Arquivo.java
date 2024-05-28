package dados;

import exceptions.NomeInvalidoException;

public abstract class Arquivo {
	protected String nome, extensao;
	
	public Arquivo( String nome ) throws NomeInvalidoException {
		if( nome.contains("\n") ) {
			throw new NomeInvalidoException("Nome possui quebra de linha");
		}
		if( nome.contains("(") || nome.contains(")") ) {
			throw new NomeInvalidoException("Nome possui parenteses");
		}
		if( nome.contains("[") || nome.contains("]") ) {
			throw new NomeInvalidoException("Nome possui colchetes");
		}
		if( nome.contains("\"") || nome.contains("\'") ) {
			throw new NomeInvalidoException("Nome possui aspas simples e/ou duplas");
		}
		if( nome.length() < 10 ) {
			throw new NomeInvalidoException("Nome nao possui tamanho suficiente");
		}
		if( nome.length() > 256 ) {
			throw new NomeInvalidoException("Nome possui tamanho muito grande");
		}
		this.nome = nome;
	}
	public String toString() {
		return nome + extensao;
	}
}
