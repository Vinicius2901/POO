package dados;

public class Carro {
	private String placa;
	private String cor;
	private String modelo;
	private String marca;
	private boolean alugado = false;
	private int ano;
	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public Carro( String placa ) {
		this.placa = placa;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		String carro = "";
		carro += "\nPlaca: " + placa;
		carro += "\nMarca: " + marca;
		carro += "\nModelo: " + modelo;
		carro += "\nCor: " + cor;
		carro += "\nAno: " + ano;
		if( alugado == false ) {
			carro += "\nAlugado: Nao";
		}
		else {
			carro += "\nAlugado: Sim";
		}
		return carro;
	}
	
	
}
