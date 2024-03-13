package dados;

public class Cliente {
	private String cpf;
	private String nome;
	private String endereco;
	private int telefone;
	private Reserva[] reservas = new Reserva[10];
	private int qtdReservas = 0;
	

	
	public Reserva[] getReservas() {
		return reservas;
	}
	public void setReservas(Reserva reservas) {
		this.reservas[qtdReservas] = reservas;
		qtdReservas++;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
