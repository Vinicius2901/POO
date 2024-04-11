package dados;

public class Contato {
	private String nome;
	private long telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		String contato = "";
		contato += nome + ": " + telefone + "\n";
		return contato;
	}
	
	public boolean equals( Object o ) {
		if( o instanceof Contato ) {
			Contato c = (Contato) o;
			if( c.telefone == this.telefone ) {
				return true;
			}
		}
		return false;
	}
	
	
}
