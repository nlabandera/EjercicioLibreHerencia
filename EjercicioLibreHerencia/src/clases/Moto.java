package clases;
import java.util.*;

import java.util.Calendar;

public class Moto extends Vehiculo{
	
	private int cilindrada=0;
	private TipoMoto tipo;
	
	public Moto() {
		super();
	}

	public Moto (String propietario, String matricula, double kilometros, int fecha_matr, String marca, int cilindrada, TipoMoto tipo) {
		super(propietario, matricula, kilometros, fecha_matr, marca);
		this.cilindrada=cilindrada;
		this.tipo=TipoMoto.SCOOTER;
	}
	
	public int getCilindrada() {
		return cilindrada;
		
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada=cilindrada;
	}
	public TipoMoto getTipo() {
		return tipo;
	}
	public void setTipo(TipoMoto tipo) {
		this.tipo=tipo;
	}
	
	@Override
	public String toString() {
		String mensaje = "Propietario: "+propietario
				+"\nMatricula: "+matricula
				+"\nKilometros: "+kilometros
				+"\nAño de matriculacion: "+fecha_matr
				+"\nMarca: "+marca
				+"\nCilindrada: "+cilindrada+"cc"
				+"\nTipo: "+tipo;
		return mensaje;
	}
}
