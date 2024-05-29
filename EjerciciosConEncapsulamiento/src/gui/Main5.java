package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Video;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main5 extends JFrame implements ActionListener{

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
					Main5 frame = new Main5();
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
	public Main5() {
		setTitle("Ejercicio 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 75, 414, 175);
		contentPane.add(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(166, 31, 89, 23);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Video v = new Video(123,"Rocky",125,5,3.7);

		v.setPrecio(v.getPrecio() + 5.50);
		
		textArea.setText("Codigo: " + v.getCodigo() + "\n");
		textArea.append("Nombre: " + v.getNombre() + "\n");
		textArea.append("Duracion: " + v.getDuracion() + "\n");
		textArea.append("Precio: " + v.getPrecio() + "\n");
		textArea.append("Tipo Cambio: " + v.getTipoCambio() + "\n\n");
		textArea.append("Precio Dolares: " + v.calcularPrecioDolares() + "\n");
	}
}
