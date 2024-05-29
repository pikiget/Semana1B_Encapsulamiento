package clases;

public class Video {
	private int codigo;
	private String nombre;
	private double duracion;
	private double precio;
	private double tipoCambio;
	
	
	public Video(int codigo, String nombre, double duracion, double precio, double tipoCambio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.duracion = duracion;
		this.precio = precio;
		this.tipoCambio = tipoCambio;
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}


	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	
	
	public double calcularPrecioDolares() {
		return precio * tipoCambio;
	}
	
	
}
