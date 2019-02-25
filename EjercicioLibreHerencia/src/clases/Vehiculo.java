package clases;

import java.util.*;

public class Vehiculo {
	
	protected String propietario="";
	protected String matricula="";
	protected double kilometros=0;
	protected int fecha_matr=0;
	//protected Calendar fecha_matr = new GregorianCalendar(0, 0, 0);
	protected String marca="";

	
	public Vehiculo() {}
	
	public Vehiculo(String propietario, String matricula, double kilometros, int fecha_matr, String marca) {
		this.propietario=propietario;
		this.matricula=matricula;
		this.kilometros=kilometros;
		this.fecha_matr=fecha_matr;
		this.marca=marca;
	}
	
	public String getPropietario() {
		return propietario;
	}
	
	public void setPropietario(String propietario) {
		this.propietario=propietario;
	}
	
	public String getMatricula() {
		return matricula;
		
	}
	public void setMatricula(String matricula) {
		this.matricula=matricula;
		
	}
	public double getKilometros() {
		return kilometros;
		
	}
	public void setKilometros(double kilometros) {
		this.kilometros=kilometros;
		
	}
	public int getFechaMatr() {
		return fecha_matr;
		
	}
	public void setFechaMatr(int fecha_matr) {
		this.fecha_matr=fecha_matr;
	}
	
	public String getMarca() {
		return marca;
		
	}
	public void setMarca(String marca) {
		this.marca=marca;
		
	}
	
	
	
		
	public String toString() {
		String mensaje="Propietario: "+propietario
				+"\nMatricula: "+matricula
				+"\nKilometros: "+kilometros
				+"\nAño de matriculacion: "+fecha_matr
				+"\nMarca: "+marca;
		return mensaje;
	}
	
	

}
