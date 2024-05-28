package apresentacao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame {
	
	public TelaPrincipal() {
		
		setBounds( 200, 200, 200, 200 );
		setResizable(false);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout( 4, 1 ));
		
		JTextField texto = new JTextField("   ");
		panel1.add(texto,0);
		
		JButton botao = new JButton("Vai!");
		panel1.add(botao, 1);
		
		JLabel resultado = new JLabel("Nada ainda");
		panel1.add(resultado, 2);
		
		botao.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				resultado.setText(texto.getText());
			}
			
		});
		
		add(panel1);
		
	}
	
}
