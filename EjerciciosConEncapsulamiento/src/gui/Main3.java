package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Edificio;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main3 extends JFrame implements ActionListener{

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
					Main3 frame = new Main3();
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
	public Main3() {
		setTitle("Problema 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 66, 414, 184);
		contentPane.add(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(170, 24, 89, 23);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
	}
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Edificio ed = new Edificio(123, 5, 3, 120);
		
		textArea.setText("Codigo: " + ed.getCodigo() + "\n");
		textArea.append("N° Departamento: " + ed.getNumDepartamento() + "\n");
		textArea.append("N° Pisos: " + ed.getCantPisos() + "\n");
		textArea.append("Precio departamento: " + ed.getPreDepartamento() + "\n");
		textArea.append("Precio edificio: " + ed.precioEdifico() + "\n");
	}
}
