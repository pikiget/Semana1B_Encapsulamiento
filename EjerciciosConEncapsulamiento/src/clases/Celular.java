/*Main 1 Problema1*/
package clases;

public class Celular {
	private int numero;
	private String nombre;
	private int segundos;
	private double precio;
	
	public Celular(int num, String nom, int seg, double pre) {
		numero = num;
		nombre = nom;
		segundos = seg;
		precio = pre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int num) {
		numero = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int seg) {
		segundos = seg;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double pre) {
		precio = pre;
	}
	
	
	public double costoConsumo() {
		return segundos * precio;
	}
	
	public double impuestoIGV() {
		return 0.18 * costoConsumo();
	}
	
	public double totalPagar() {
		return costoConsumo() + impuestoIGV();
	}
}
