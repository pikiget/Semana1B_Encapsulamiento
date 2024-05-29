package gui;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import clases.Paciente;


public class Main6 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
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
					Main6 frame = new Main6();
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
	public Main6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 59, 414, 191);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(157, 23, 89, 23);
		contentPane.add(btnProcesar);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Paciente p = new Paciente("Paul", "Ochoa", 18, 1.69,81);
		
		textArea.setText("Nombre: " + p.getNombre() + "\n");
		textArea.append("Apellido: " + p.getApellido() + "\n");
		textArea.append("Edad: " + p.getEdad() + "\n");
		textArea.append("Talla: " + p.getTalla() + "\n");
		textArea.append("Peso: " + p.getPeso() + "\n\n");
		textArea.append("Validar Edad: " + p.validarEdad() + "\n");
	}
}
