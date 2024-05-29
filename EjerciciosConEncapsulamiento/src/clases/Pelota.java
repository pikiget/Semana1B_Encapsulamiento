/*Main9*/
package clases;

public class Pelota {
	private String marca;
	private double peso;
	private double presion;
	private double diametro;
	private double precio;

	public Pelota(String marca, double peso, double presion, double diametro, double precio) {
		this.marca = marca;
		this.peso = peso;
		this.presion = presion;
		this.diametro = diametro;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPresion() {
		return presion;
	}

	public void setPresion(double presion) {
		this.presion = presion;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public double calcularRadio() {
		return diametro/2;
	}
	public double calcularVolumen() {
		return 4*3.1416 * calcularRadio() * calcularRadio() * calcularRadio() / 3;
	}
	public double calcularDescuento() {
		return precio * 0.1;
	}
	public double calcularImpotePagar() {
		return precio - calcularDescuento();
	}
}
