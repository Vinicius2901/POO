package apresentacao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import dados.Fatoriais;
import dados.Fibonacci;
import dados.Gerador;
import dados.Primos;


public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane = new JPanel();
	
	private JPanel painelEntrada = new JPanel();
	private JLabel infoCaixaTexto = new JLabel("Digite um valor:");
	private JTextField caixaTexto = new JTextField();
	private JButton botaoAdicionar = new JButton("Adicionar");
	private JButton botaoLimpar = new JButton("Limpar");
	
	private JScrollPane painelScrollTabelaResultados = new JScrollPane();
	private JTable tabelaResultados;
	private TabelaResultados resultados = new TabelaResultados();
	
	private JScrollPane painelScrollTabelaValores = new JScrollPane();
	private JTable tabelaValores;
	private TabelaValores valores = new TabelaValores();
	
	private JPanel panelGeradores = new JPanel();
	private final JTextField textoGerar = new JTextField();
	private final JButton fibonacci = new JButton("Fibonacci");
	private final JButton primos = new JButton("Primos");
	private final JButton fatorial = new JButton("Fatorial");
	private Gerador gerador;
	
	
	public Calculadora() {
		setTitle( "Calculadora Estatistica" );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds( 100, 100, 900, 300 );
		setContentPane(contentPane);
		contentPane.setLayout(null);
		painelEntrada.setBounds(15, 80, 280, 173);
		painelEntrada.setLayout(null);
		contentPane.add(painelEntrada);
		
		infoCaixaTexto.setBounds(30, 30, 200, 15);
		painelEntrada.add(infoCaixaTexto);
		caixaTexto.setBounds(30, 50, 200, 20);
		painelEntrada.add(caixaTexto);
		botaoAdicionar.setBounds(77, 94, 117, 25);
		painelEntrada.add(botaoAdicionar);
		botaoLimpar.setBounds(77, 136, 117, 25);
		painelEntrada.add(botaoLimpar);
		
		painelScrollTabelaResultados.setBounds(10, 10, 880, 50);
		contentPane.add(painelScrollTabelaResultados);
		tabelaResultados = new JTable(resultados);
		painelScrollTabelaResultados.setViewportView(tabelaResultados);
		
		painelScrollTabelaValores.setBounds(307, 80, 173, 173);
		contentPane.add(painelScrollTabelaValores);
		tabelaValores = new JTable(valores);
		painelScrollTabelaValores.setViewportView(tabelaValores);
		
		
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				valores.adicionaValor(Integer.parseInt(caixaTexto.getText()));
				resultados.atualizar();
				caixaTexto.setText("");
			}
		});
		botaoLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				valores.limparValores();
				resultados.atualizar();
			}
		});
		
		panelGeradores.setBounds(520, 80, 173, 172);
		panelGeradores.setLayout(null);
		contentPane.add(panelGeradores);
		
		JLabel gerarValores = new JLabel("Gerar valores");
		gerarValores.setBounds(10, 5, 200, 15);
		panelGeradores.add(gerarValores);
		
		textoGerar.setBounds(10, 30, 200, 20);
		panelGeradores.add(textoGerar);
		
		fibonacci.setBounds(45, 60, 100, 20);
		panelGeradores.add(fibonacci);
		fibonacci.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent arg0 ) {
				gerador = new Fibonacci();
				int gerou = Integer.parseInt(textoGerar.getText());
				gerador.gerar(gerou);
				for( Integer i : gerador.getSequencia() ) {
					valores.adicionaValor(i);
				}
				resultados.atualizar();
				textoGerar.setText("");
			}
		});
		
		primos.setBounds(45, 90, 100, 20);
		panelGeradores.add(primos);
		primos.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent arg0 ) {
				gerador = new Primos();
				int gerou = Integer.parseInt(textoGerar.getText());
				gerador.gerar(gerou);
				for( Integer i : gerador.getSequencia() ) {
					valores.adicionaValor(i);
				}
				resultados.atualizar();
				textoGerar.setText("");
			}
		});
		
		fatorial.setBounds(45, 120, 100, 20);
		panelGeradores.add(fatorial);
		fatorial.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent arg0 ) {
				gerador = new Fatoriais();
				int gerou = Integer.parseInt(textoGerar.getText());
				gerador.gerar(gerou);
				for( Integer i : gerador.getSequencia() ) {
					valores.adicionaValor(i);
				}
				resultados.atualizar();
				textoGerar.setText("");
			}
		});
		
		
		
		
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
