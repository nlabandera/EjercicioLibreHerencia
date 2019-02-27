package clases;

import java.util.Calendar;

public class Coche extends Vehiculo{
	
	private int npuertas=0;
	private String modelo="";
	private String color="";
	
	public Coche() {
		super();
	}
	
	public Coche (String propietario, String matricula, double kilometros, int fecha_matr, String marca, String modelo, int npuertas, String color) {
		super(propietario, matricula, kilometros, fecha_matr, marca);
		this.modelo=modelo;
		this.npuertas=npuertas;
		this.color=color;
	}

	public int getnPuertas() {
		return npuertas;
	}

	public void setnPuertas(int npuertas) {
		this.npuertas=npuertas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo=modelo;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	

	

	
	@Override
	public String toString() {
		String mensaje= super.toString()
				+"\nModelo: "+modelo
				+"\nNúmero de puertas: "+npuertas
				+"\nColor: "+color;
		return mensaje;
	}

}
