package dados;

public class Contato {
	private String nome;
	private long tel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	
	public String toString() {
		String contato = "";
		contato += nome + ": " + tel + "\n";
		return contato;
	}
	
	public boolean equals( Object o ) {
		if( o instanceof Contato ) {
			Contato c = (Contato) o;
			if( c.tel == this.tel ) {
				return true;
			}
		}
		return false;
	}
	
	
}
