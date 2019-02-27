package main;

import java.util.*;

import clases.*;

public class ejecutable {

	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	// public static ArrayList<Coche> coches = new ArrayList<Coche>();

	public static void main(String[] args) {

		Vehiculo c1 = new Coche("Oihane", "9993DYH", 210521, 2005, "Opel", "Astra", 5, "Azul");
		vehiculos.add((Coche)c1);
		Vehiculo c2 = new Coche("David", "0963JFG", 210521, 2005, "Ford", "Fiesta", 3, "Blanco");
		vehiculos.add((Coche)c2);
		Vehiculo m1 = new Moto("Nerea", "4185HNS", 15023, 2013, "Kymco", 125, TipoMoto.SCOOTER);
		vehiculos.add((Moto)m1);
		Vehiculo m2 = new Moto("Iku", "1992KPT", 5012, 2018, "Kymco", 500, TipoMoto.DEPORTIVA);
		vehiculos.add((Moto)m2);
		Vehiculo c3 = new Coche("Nerea", "0954CHZ", 100321, 2003, "Peugeot", "206", 3, "Gris");
		vehiculos.add((Coche)c3);

		boolean salir = false;

		int opcion;

		while (!salir) {
			System.out.println(
					"Qué quieres hacer?" 	+ "\n1. Añadir un vehiculo." 
											+ "\n2. Mostrar los vehículos existentes."
											+ "\n3. Borrar un vehículo." 
											+ "\n4. Buscar un vehículo." 
											+ "\n5. Salir.");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				nuevoVehiculo(vehiculos);
				break;

			case 2:
				mostrarVehiculos(vehiculos);
				break;

			case 3:
				borrarVehiculo(vehiculos);
				break;

			case 4:
				buscarVehiculo(vehiculos);
				break;

			case 5:
				System.out.println("Saliendo...");
				salir = true;
				break;

			default:
				System.out.println("Opción incorrecta. Elija otra");
			}

		}

	}

	// Fin del main

	// Metodos
	
	//AÑADIR VEHÍCULO

	public static void nuevoVehiculo(ArrayList<Vehiculo> vehiculos) {

		boolean noExiste = true; // Supongo que no existe el vehículo. Luego compruebo.

		Vehiculo v = new Coche();
		Vehiculo v2 = new Moto();
		
		String propietario="";
		String matricula;
		double kilometros = 0;
		int fecha_matr = 0;
		String marca = "";
		TipoMoto tipoMoto = null;

		System.out.println("Seleccione tipo de vehículo: " + "\n1. Coche." + "\n2. Moto. ");
		int tipoVehiculo = sc.nextInt();
		sc.nextLine();
		
		switch (tipoVehiculo) {
		
		case 1:	//Añadir coche

			System.out.println(("¿Quién es el propietario?: "));
			propietario = sc.nextLine();
			

			System.out.println("Matricula: ");
			matricula = sc.next();


			if (existeVehiculo(matricula) == false) {
				System.out.println("Error. El vehículo ya existe.");
			}

			else {

				Coche c = (Coche) v;

				c.setPropietario(propietario);
				c.setMatricula(matricula);

				System.out.println("Fecha de matriculacion: ");
				fecha_matr = sc.nextInt();
				c.setFechaMatr(fecha_matr);

				System.out.println("Kilometros del vehículo: ");
				kilometros = sc.nextDouble();
				c.setKilometros(kilometros);
				sc.nextLine();

				System.out.println("Marca: ");
				marca = sc.nextLine();
				c.setMarca(marca);

				System.out.println("Modelo: ");
				String modelo = sc.nextLine();
				c.setModelo(modelo);

				System.out.println("Número de puertas: ");
				int npuertas = sc.nextInt();
				c.setnPuertas(npuertas);

				System.out.println("Color: ");
				String color = sc.nextLine();
				//sc.next();
				c.setColor(color);

				vehiculos.add(c);
			}

			break;

		case 2: 	//Añadir MOTO

			System.out.println(("¿Quién es el propietario?: "));
			propietario = sc.nextLine();

			System.out.println("Matricula: ");
			matricula = sc.next();

			if (existeVehiculo(matricula) == false) {
				System.out.println("Error. El vehículo ya existe.");
			}
			
			else {
				
				
				Moto m = (Moto) v2;
				
				m.setPropietario(propietario);
				m.setMatricula(matricula);

				System.out.println("Fecha de matriculación: ");
				fecha_matr = sc.nextInt();
				m.setFechaMatr(fecha_matr);

				System.out.println("Kilometros del vehículo: ");
				kilometros = sc.nextDouble();
				m.setKilometros(kilometros);
				sc.nextLine();

				System.out.println("Marca: ");
				marca = sc.nextLine();
				m.setMarca(marca);

				System.out.println("Cilindrada: ");
				int cilindrada = sc.nextInt();
				m.setCilindrada(cilindrada);

				System.out.println("Tipo: " + "\n1. SCOOTER" + "\n2. CROSS" + "\n3. DEPORTIVA");
				int selec = sc.nextInt();
				switch (selec) {
				case 1:
					tipoMoto = TipoMoto.SCOOTER;
					break;
				case 2:
					tipoMoto = TipoMoto.CROSS;
					break;
				case 3:
					tipoMoto = TipoMoto.DEPORTIVA;
					break;
				}
				m.setTipo(tipoMoto);
				vehiculos.add(m);
			}
			

			break;

		}

	}

	public static boolean existeVehiculo(String matricula) {
		boolean noExiste = true;

		for (int i = 0; i < vehiculos.size(); i++) {
			if (matricula.matches(vehiculos.get(i).getMatricula())) {
				noExiste = false;
				break;
			}
		}
		return noExiste;
	}

	public static void mostrarVehiculos(ArrayList<Vehiculo> vehiculos) {
		
		System.out.println("Seleccione tipo de vehículo: " + "\n1. Coche." + "\n2. Moto."+"\n3. Todos los vehículos");
		int mostrarTipo = sc.nextInt();
		sc.nextLine();
		
		switch(mostrarTipo) {
		
		case 1:
			System.out.println("LISTA DE COCHES GUARDADOS: ");
			int listaCoches = 1;
			for(int i=0; i<vehiculos.size();i++) {
				
				if(vehiculos.get(i).getClass().getSimpleName().equalsIgnoreCase("coche")) {
					System.out.println((listaCoches)+") ");
					System.out.println(vehiculos.get(i).toString()+ "\n");
					listaCoches++;
					
				}
			}

			
			break;
		
		case 2:
			System.out.println("LISTA DE MOTOS GUARDADAS: ");
			int listaMotos=1;
			
			for (int i = 0; i < vehiculos.size(); i++) {
				
				if(vehiculos.get(i).getClass().getSimpleName().equalsIgnoreCase("moto")) {
					System.out.println((listaMotos)+") ");	
					System.out.println(vehiculos.get(i).toString() + "\n");
					listaMotos++;
				}
				

			}
			break;
			
		
		case 3:			
			System.out.println("LISTA DE VEHICULOS GUARDADOS: \n");
			for (int i = 0; i < vehiculos.size(); i++) {
				System.out.println((i + 1)+") "+vehiculos.get(i).getClass().getSimpleName().toUpperCase());
				System.out.println(vehiculos.get(i).toString() + "\n");
			}
			break;
		}
}

	public static int sacaPosicion(String matricula) {
		for (int i = 0; i < vehiculos.size(); i++) {
			if (matricula.matches(vehiculos.get(i).getMatricula()))
				return i;
		}
		return -1;
	}

	public static void borrarVehiculo(ArrayList<Vehiculo> vehiculos) {
		System.out.println("Introduzca la matricula del vehículo que quiere eliminar");
		String matricula = sc.nextLine();

		System.out.println(vehiculos.get(sacaPosicion(matricula)).getMatricula() + "eliminado");
		vehiculos.remove(sacaPosicion(matricula));
	}
	
	public static void buscarVehiculo(ArrayList<Vehiculo> vehiculos) {
		boolean noExiste = false;
		
		System.out.println("Introduce la matricula del vehiculo a eliminar: ");
		String matricula = sc.nextLine();
		
		if(existeVehiculo(matricula)==false) {
			System.out.println("El vehículo existe en la posicion: ");
			System.out.println(sacaPosicion(matricula));
		}
		else {
			System.out.println("El vehículo no existe.");
			noExiste = true;
		}
			
	}

}
