package dados;

public class Losango extends FormaGeometrica {
	
	public Losango() {
		this.medida1 = 0;
		this.medida2 = 0;
	}

	public void setD( int dmaior ) {
		this.medida1 = dmaior;
	}
	public void setd( int dmenor ) {
		this.medida2 = dmenor;
	}
	
	@Override
	public int calculaArea() {
		return (medida1 * medida2) / 2;
	}

	@Override
	public int calculaPerimetro() {
		return (int)(4*(Math.sqrt((medida1*medida1)/4 + (medida2*medida2)/4)));
	}
	
	public String toString() {
		return "Losango de diagonais " + medida1 + " por " + medida2 + ":\tArea:" + calculaArea() + "\tPerimetro: " + calculaPerimetro();
	}

}
