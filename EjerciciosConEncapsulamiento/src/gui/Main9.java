/*Pelota*/
package gui;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Pelota; 

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Main9 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnProcesar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main9 frame = new Main9();
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
	public Main9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 414, 181);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(164, 24, 89, 23);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Pelota p = new Pelota("Nike",20.5,10,22,125);

		p.setPrecio(p.getPrecio() * 0.75);
		p.setDiametro(p.getDiametro() + 1);
		
		textArea.setText("Marca: " + p.getMarca() + "\n");
		textArea.append("Peso: " + p.getPeso() + "\n");
		textArea.append("Presion: " + p.getPresion() + "\n");
		textArea.append("Diametro: " + p.getDiametro() + "\n");
		textArea.append("Precio: " + p.getPrecio() + "\n\n");
		textArea.append("Radio: " + p.calcularRadio() + "\n");
		textArea.append("Volumen del balón: " + p.calcularVolumen() + "\n");
		textArea.append("Descuento: " + p.calcularDescuento() + "\n");
		textArea.append("Importe a pagar: " + p.calcularImpotePagar() + "\n");
	}
}
