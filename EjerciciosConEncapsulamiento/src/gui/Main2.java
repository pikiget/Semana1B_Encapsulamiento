package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Computadora;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main2 extends JFrame implements ActionListener{

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
					Main2 frame = new Main2();
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
	public Main2() {
		setTitle("Problema 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 65, 414, 185);
		contentPane.add(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(168, 31, 89, 23);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Computadora c = new Computadora(1234,"Samsung","Verde", 50);

		textArea.setText("Codigo: " + c.getCodigo() + "\n");
		textArea.append("Marca: " + c.getMarca() + "\n");
		textArea.append("Color: " + c.getColor() + "\n");
		textArea.append("Precio $: " + c.getPrecio() + "\n");
		textArea.append("Precio en S/.: " + c.compuSoles() + "\n");
		textArea.append("Precio en EU.: " + c.compuEuros() + "\n");
	}

}

