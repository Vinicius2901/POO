package dados;

public enum Combustivel {
	GASOLINA("gasolina"), ALCOOL("alcool"), DIESEL("diesel"), GAS("gas"); //Lista de possiveis tipos.
	
	private String tipo;
	
	private Combustivel( String tipo ) { //Construtor chamado na primeira linha do enum.
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
}
