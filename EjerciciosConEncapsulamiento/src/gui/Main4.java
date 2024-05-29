package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Obrero;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main4 extends JFrame implements ActionListener{

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
					Main4 frame = new Main4();
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
	public Main4() {
		setTitle("Problema 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 76, 414, 174);
		contentPane.add(textArea);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(170, 25, 89, 23);
		btnProcesar.addActionListener(this);
		contentPane.add(btnProcesar);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Obrero o = new Obrero(123,"Roy",5,50);

		
		textArea.setText("Codigo: " + o.getCodigo() + "\n");
		textArea.append("Nombre: " + o.getNombre() + "\n");
		textArea.append("Horas: " + o.getHorasTrab() + "\n");
		textArea.append("Tarifa: " + o.getTarifa() + "\n");
		textArea.append("Nombre: " + o.getNombre() + "\n\n");
		textArea.append("Sueldo Bruto: " + o.calcularSueldoBruto() + "\n");
		textArea.append("Descuento AFP: " + o.calcularDescuentoAFP() + "\n");
		textArea.append("Descuento EPS: " + o.calcularDescuentoEPS() + "\n");
		textArea.append("Sueldo Neto: " + o.calcularSueldoNeto());
	}

}
