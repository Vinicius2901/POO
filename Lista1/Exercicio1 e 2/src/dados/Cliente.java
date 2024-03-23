package dados;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		String cliente = "";
		cliente += "\nNome: " + nome;
		cliente += "\nCPF: " + cpf;
		cliente += "\nIdade: " + idade + "anos";
		cliente += "\nEndereco: " + endereco;
		return cliente;
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

	
}
