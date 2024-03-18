package dados;

public class Cliente {
	private String cpf;
	private String nome;
	private String endereco;
	private int telefone;
	private Reserva[] reservas = new Reserva[10];
	private int qtdReservas = 0;
	

	
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
	public Reserva getReservas( int index ) {
		return reservas[index];
	}	
	public int getQtdReservas() {
		return qtdReservas;
	}
	public void reservarIda( Reserva reserva ) {
		this.reservas[qtdReservas] = reserva;
		qtdReservas++;
	}
	
	public void reservarVolta( Reserva ida, Reserva volta ) {
		ida.setIdaEvolta(true);
		ida.setVolta(volta);
		this.reservas[qtdReservas] = ida;
		qtdReservas ++;
	}
	
	public boolean equals( Object o ) {
		if( o instanceof Cliente ) {
			Cliente c = (Cliente) o;
			if( c.getCpf().equals(this.getCpf())) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
        String cliente = "";
        cliente += "CPF: " + this.cpf + "\n";
        cliente += "Nome: " + this.nome + "\n";
        cliente += "Endereco: " + this.endereco + "\n";
        cliente += "Telefone: " + this.telefone + "\n";
        return cliente;
    }
	
	
}
