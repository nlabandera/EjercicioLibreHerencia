package clases;

import java.util.ArrayList;

public class Vehiculos {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public void añadirVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	
	public Vehiculo getVehiculo(int posicion) {
		return vehiculos.get(posicion);
	}

	public void listarCoches() {

		int listaCoches = 1;
		for (int i = 0; i < vehiculos.size(); i++) {

			if (vehiculos.get(i).getClass().getSimpleName().equalsIgnoreCase("coche")) {
				System.out.println((listaCoches) + ") ");
				System.out.println(vehiculos.get(i).toString() + "\n");
				listaCoches++;

			}
		}

	}

	public void listarMotos() {

		int listaMotos = 1;
		for (int i = 0; i < vehiculos.size(); i++) {

			if (vehiculos.get(i).getClass().getSimpleName().equalsIgnoreCase("moto")) {
				System.out.println((listaMotos) + ") ");
				System.out.println(vehiculos.get(i).toString() + "\n");
				listaMotos++;

			}
		}

	}

	public void listarVehiculos() {

		for (int i = 0; i < vehiculos.size(); i++) {
			System.out.println((i + 1) + ") " + vehiculos.get(i).getClass().getSimpleName().toUpperCase());
			System.out.println(vehiculos.get(i).toString() + "\n");
		}

	}
	
	public boolean existeVehiculo(String matricula) {
		boolean existeVehiculo = true;
		for(int i = 0; i<vehiculos.size(); i++) {
			if(matricula.matches(vehiculos.get(i).getMatricula())) {
				return true;
			}
		}
		return false;
	}
	
	
	public void modificarVehiculo(Vehiculo vehiculo, int posicion) {
		vehiculos.add(posicion, vehiculo);
	}
	
	
	public int sacaPosicion(String matricula) {
		for (int i = 0; i < vehiculos.size(); i++) {
			if (matricula.matches(vehiculos.get(i).getMatricula()))
				return i;
		}
		return -1;
	}
	
	public void  borrarVehiculo(int i){
		vehiculos.remove(i);
	}
	
	
	



}
