/*Main 8*/
package clases;

public class Asesor {
	private int codigo;
	private String nombre;
	private int horas;
	private double tarifa;
	
	public Asesor(int codigo, String nombre, int horas, double tarifa) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
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

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	
	public double sueldoBruto() {
		return horas * tarifa;
	}
	public double descuento() {
		return sueldoBruto() * 0.15;
	}
	public double sueldoNeto() {
		return sueldoBruto() - descuento();
	}
}

