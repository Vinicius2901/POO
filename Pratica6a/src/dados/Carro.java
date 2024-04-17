package dados;

public class Carro extends Veiculo {

	private int numPortas;
	private Combustivel combustivel;
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public Combustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	
	public String info() {
		return  "\nCarro\n" + "Cor : "+this.getCor() + "\n" + "Numero de portas: " +
			numPortas + "\n"
			+ "Tipo de combustivel: " + combustivel + "\n";
	}
}
