/*Main 6*/
package clases;

public class Paciente {
	private String nombre, apellido;
	private int edad;
	private double talla, peso;
	
	public Paciente(String nombre, String apellido, int edad, double talla, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.talla = talla;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTalla() {
		return talla;
	}
	public void setTalla(double talla) {
		this.talla = talla;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String validarEdad() {
		if (edad>=18) 
			return "mayor de edad";
		
		
		else 
			return "menor de edad";
		
	}
	
	
	
}
