package dados;

public class Bicicleta extends Veiculo {
	
	private int numMarchas;

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	
	public String info() {
		return "\nBicicleta\n" + "Cor: " + this.getCor() + "\n" + "Numero de marchas: \n"
				+ this.numMarchas + "\n" ;
	}
}
