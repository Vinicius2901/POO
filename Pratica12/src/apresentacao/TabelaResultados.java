package apresentacao;

import javax.swing.table.AbstractTableModel;

import negocio.CalculadoraEstatistica;

public class TabelaResultados extends AbstractTableModel {
	
	private String[] colunas = {"Sorteado", "Somatorio", "Media Aritmetica", "Media Geometrica", 
			"Variancia", "Desvio-Padrao", "Amplitude"};
	private CalculadoraEstatistica calculadora = CalculadoraEstatistica.getInstance();
	
	public String getColumnName( int column ) {
		return colunas[column];
	}
	public int getColumnCount() {
		return colunas.length;
	}

	public int getRowCount() {
		return 1;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		if( !calculadora.getValores().isEmpty() ) {
			switch( columnIndex ) {
			case 0:
				return calculadora.sortear();
			case 1:
				return calculadora.somatorio();
			case 2:
				return calculadora.mediaAritmetica();
			case 3:
				return calculadora.mediaGeometrica();
			case 4:
				return calculadora.variancia();
			case 5:
				return calculadora.desvioPadrao();
			case 6:
				return calculadora.amplitude();
			}
		}
		else {
			return "-";
		}
		return null;
	}
	
	public void atualizar() {
		fireTableStructureChanged();
	}

}
