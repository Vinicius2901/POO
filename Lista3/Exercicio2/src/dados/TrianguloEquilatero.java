package dados;

public class TrianguloEquilatero extends FormaGeometrica {
	
	public TrianguloEquilatero() {
		this.medida1 = 0;
		this.medida2 = 0;
	}
	
	public void setLado( int lado ) {
		this.medida1 = lado;
	}
	
	@Override
	public int calculaArea() {
		return (int)((Math.sqrt(3)/4)  * medida1 * medida1);
	}

	@Override
	public int calculaPerimetro() {
		return 3*medida1;
	}
	
	public String toString() {
		return "Triangulo com lado " + medida1 + ":\tArea: " + calculaArea() + "\tPerimetro: " + calculaPerimetro();
	}

}
