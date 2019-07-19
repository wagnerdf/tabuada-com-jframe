package Tabuada;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ProgramaTabuada extends JFrame {   
	
	private JComboBox<String> comboTabuada;
	private JComboBox<String> comboOperador;
	private JButton botao;
	private JTextArea areaTexto1;
	int i;
	
	public ProgramaTabuada() {
	
		this.setTitle("Tabuada");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBounds(450, 250, 250, 300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		comboTabuada = new JComboBox<String>();
		
		comboTabuada.addItem("1");
		comboTabuada.addItem("2");
		comboTabuada.addItem("3");
		comboTabuada.addItem("4");
		comboTabuada.addItem("5");
		comboTabuada.addItem("6");
		comboTabuada.addItem("7");
		comboTabuada.addItem("8");
		comboTabuada.addItem("9");
		comboTabuada.addItem("10");
		
		comboOperador = new JComboBox<String>();
		
		comboOperador.addItem("+");
		comboOperador.addItem("-");
		comboOperador.addItem("/");
		comboOperador.addItem("*");
		
		AritimeticaTabuada tabuada = new AritimeticaTabuada();
		
// Criando botão clique		
		botao = new JButton("Clique");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String operador = String.valueOf(comboOperador.getSelectedItem());
				int op = Integer.parseInt((String) comboTabuada.getSelectedItem());
				
				
				if (operador == "+") {
					areaTexto1.setText("           TABUADA  -  ADIÇÂO\n  --------------------------------------------\n");
					areaTexto1.append(tabuada.soma(op));
				}
				if (operador == "-") {
					areaTexto1.setText("        TABUADA  -  SUBITRAÇÃO\n  --------------------------------------------\n");
					areaTexto1.append(tabuada.subtracao(op));
				}
				if (operador == "/") {
					areaTexto1.setText("           TABUADA  -  DIVISÃO\n  --------------------------------------------\n");
					areaTexto1.append(tabuada.divisao(op));
				}
				if (operador == "*") {
					areaTexto1.setText("   TABUADA  -  MULTIPLICAÇÃO\n  --------------------------------------------\n");
					areaTexto1.append(tabuada.multiplicacao(op));
				}
				
			}
		});
		
		
// Configura a areaTexto1 com 13 linhas e 15 colunas visíveis
		areaTexto1 = new JTextArea(13, 15);
		areaTexto1.setEditable(false);
		
		c.add(comboTabuada);
		c.add(comboOperador);
		c.add(botao);
		c.add(areaTexto1);
		
		this.setVisible(true);
				
	}
	
   public static void main(String[] args) {
	   
	   ProgramaTabuada t = new ProgramaTabuada();
 	
  }
}  

