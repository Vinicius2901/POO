package dados;

public class Animais {
	private String nome;
	private Dono dono = new Dono();
	private String especie;
	private String descricao;
	
	public Animais() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Animais [nome=" + nome + ", dono=" + dono + ", especie=" + especie + ", descricao=" + descricao + "]";
	}
	
	
}
