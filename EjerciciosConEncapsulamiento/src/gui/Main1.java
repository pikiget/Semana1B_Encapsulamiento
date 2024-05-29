package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Celular;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main1 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;
	private JButton btnProcesar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main1() {
		setTitle("Problema 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(153, 21, 89, 23);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 64, 414, 186);
		contentPane.add(textArea);
		


	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Celular c = new Celular(12345678, "Juan Pérez", 100, 2);
		
		c.setSegundos(200);
		c.setPrecio(2*0.05);
		
		textArea.setText("Nombre: " + c.getNombre()+"\n");
		textArea.append("Numero: " + c.getNumero()+"\n");
		textArea.append("Precio: " + c.getPrecio()+"\n");
		textArea.append("Segundos: " + c.getSegundos()+"\n");
		textArea.append("Costo consumo: " + c.costoConsumo()+"\n");
		textArea.append("Impuesto IGV: " + c.impuestoIGV()+"\n");
		textArea.append("Total pagar: " + c.totalPagar()+"\n");
	
	}
}
