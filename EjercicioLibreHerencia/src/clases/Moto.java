package clases;


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
		return super.toString()
				+"\nCilindrada: "+cilindrada+"cc"
				+"\nTipo: "+tipo;
		//return mensaje;
	}
}
