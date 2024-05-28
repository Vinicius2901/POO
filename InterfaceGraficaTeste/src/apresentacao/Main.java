package apresentacao;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Definir o que fazer ao clicar no "X"
		//frame.setResizable(false); // Não pode redimensionar
		frame.setVisible(true); // Visibilidade do programa
	}
}
