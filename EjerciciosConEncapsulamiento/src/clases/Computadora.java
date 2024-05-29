/*Problema 2*/
package clases;

public class Computadora {
	private int codigo;
	private String marca, color;
	private double precio;
	
	public Computadora(int cod, String mca, String clr, double pre) {
		codigo = cod;
		marca = mca;
		color = clr;
		precio = pre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double compuSoles() {
		return precio * 3.35;
	}
	
	public double compuEuros() {
		return precio * 1.20;
	}
}
