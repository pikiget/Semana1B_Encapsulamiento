package clases;

public class Obrero {
	private int codigo;
	private String nombre;
	private int horasTrab;
	private double tarifa;
	
	
	public Obrero(int codigo, String nombre, int horasTrab, double tarifa) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrab = horasTrab;
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


	public int getHorasTrab() {
		return horasTrab;
	}
	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}


	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	
	
	public double calcularSueldoBruto() {
		return horasTrab * tarifa;
	}
	public double calcularDescuentoAFP() {
		return calcularSueldoBruto() * 0.1;
	}
	public double calcularDescuentoEPS() {
		return calcularSueldoBruto() * 0.05;
	}
	public double calcularSueldoNeto() {
		return calcularSueldoBruto() - calcularDescuentoAFP() - calcularDescuentoEPS();
	}

}
