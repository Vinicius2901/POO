package apresentacao;

import javax.swing.table.AbstractTableModel;

import negocio.CalculadoraEstatistica;

public class TabelaValores extends AbstractTableModel {
	
	private String[] colunas = {"Valores"};
	private CalculadoraEstatistica calculadora = CalculadoraEstatistica.getInstance();
	
	public int getRowCount() {
		return calculadora.getValores().size();
	}

	public int getColumnCount() {
		return 1;
	}
	
	public String getColumnName(int column) {
		return colunas[column];
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return calculadora.getValores().get(rowIndex);
	}
	public void adicionaValor( int valor ) {
		calculadora.adicionarValor(valor);
		fireTableStructureChanged();
	}
	
	public void limparValores() {
		calculadora.limparValores();
		fireTableStructureChanged();
	}
	

}
