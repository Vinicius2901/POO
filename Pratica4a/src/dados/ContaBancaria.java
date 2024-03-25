package dados;

public class ContaBancaria {
	private String cpf;
	private float saldo;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float sacar( float valor ) {
		return saldo - valor;
	}
	
	public String gerarExtrato() {
		String extrato = "";
		extrato += "\nCPF: " + cpf;
		extrato += "\nSaldo: " + saldo;
		return extrato;
	}
}
