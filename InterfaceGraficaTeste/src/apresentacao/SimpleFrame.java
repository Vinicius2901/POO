package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 800;
	private static final int DEFAULT_HEIGHT = 600;
	public SimpleFrame() {
		setSize( DEFAULT_WIDTH, DEFAULT_HEIGHT ); // Definindo tamanho padrão de inicialização
		setLocation( 250,300 ); // Definindo onde inicia o programa
		
		JPanel painel1 = new JPanel(); // Cria um painel
		JPanel painel2 = new JPanel();
		JPanel painel3 = new JPanel();
		painel1.add( new JLabel("          "));
		painel2.add( new JLabel("          "));
		painel1.setBackground(new Color(104,106,0)); // Seta a cor do painel com base no RGB
		painel2.setBackground(new Color(51,255,51));
		painel3.setBackground(new Color(51,51,255));
		//setContentPane(painel1); // Coloca o painel no frame (Substitui)
		add(painel1, BorderLayout.NORTH); // Adiciona o painel1 na borda de cima
		add(painel2, BorderLayout.SOUTH); // Adiciona o painel2 na borda debaixo
		add(painel3, BorderLayout.CENTER); // Adiciona o painel3 no centro
	}
}
