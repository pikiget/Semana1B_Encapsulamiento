/*Problema 3*/
package clases;

public class Edificio {
	private int codigo;
	private int numDepartamento;
	private int cantPisos;
	private double preDepartamento;
	
	public Edificio(int cod, int numDep, int cantPis, double preDepa) {
		codigo = cod;
		numDepartamento = numDep;
		cantPisos = cantPis;
		preDepartamento = preDepa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumDepartamento() {
		return numDepartamento;
	}

	public void setNumDepartamento(int numDepartamento) {
		this.numDepartamento = numDepartamento;
	}

	public int getCantPisos() {
		return cantPisos;
	}

	public void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}

	public double getPreDepartamento() {
		return preDepartamento;
	}

	public void setPreDepartamento(double preDepartamento) {
		this.preDepartamento = preDepartamento;
	}
	
	public double precioEdifico() {
		return numDepartamento * preDepartamento;
	}
}
