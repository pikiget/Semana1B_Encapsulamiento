/*Main 7*/
package clases;

public class Empleado {
	private int codigo;
	private String nombre;
	private int celular;
	private double sueldo;
	
	
	public Empleado(int codigo, String nombre, int celular, double sueldo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.celular = celular;
		this.sueldo = sueldo;
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


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public String validarSueldo() {
		if(sueldo>3500)
			return "mayor a 3500";
		else if (sueldo<3500)
			return "menor a 3500";
		else
			return "igual a 3500";
	}
}
