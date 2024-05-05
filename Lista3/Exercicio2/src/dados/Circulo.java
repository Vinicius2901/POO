package dados;

public class Circulo extends FormaGeometrica {
	
	public Circulo() {
		this.medida1 = 0;
		this.medida2 = 0;
	}

	public void setRaio( int r ) {
		this.medida1 = r;
	}
	@Override
	public int calculaArea() {
		return (int)(Math.PI*medida1*medida1);
	}

	@Override
	public int calculaPerimetro() {
		return (int)(2*Math.PI*medida1);
	}
	
	public String toString() {
		return "Circulo de raio " + medida1 + ":\tArea: " + calculaArea() + "\tPerimetro: " + calculaPerimetro();
	}

}
