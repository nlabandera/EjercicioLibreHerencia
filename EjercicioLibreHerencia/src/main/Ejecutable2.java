package main;

import java.util.*;
import clases.*;

public class Ejecutable2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehiculos a = new Vehiculos();

		Vehiculo c1 = new Coche("Oihane", "9993DYH", 210521, 2005, "Opel", "Astra", 5, "Azul");
		a.a�adirVehiculo(c1);
		
		Vehiculo c2 = new Coche("David", "0963JFG", 210521, 2005, "Ford", "Fiesta", 3, "Blanco");
		a.a�adirVehiculo(c2);

	
		Vehiculo m1 = new Moto("Nerea", "4185HNS", 15023, 2013, "Kymco", 125, TipoMoto.SCOOTER);
		a.a�adirVehiculo(m1);

		Vehiculo m2 = new Moto("Iku", "1992KPT", 5012, 2018, "Kymco", 500, TipoMoto.DEPORTIVA);
		a.a�adirVehiculo(m2);

		Vehiculo c3 = new Coche("Nerea", "0954CHZ", 100321, 2003, "Peugeot", "206", 3, "Gris");
		a.a�adirVehiculo(c3);


		boolean salir = false;

		int opcion;

		while (!salir) {
			System.out.println(
					"Qu� quieres hacer?" 	+ "\n1. A�adir un vehiculo." 
											+ "\n2. Mostrar los veh�culos existentes."
											+ "\n3. Borrar un veh�culo." 
											+ "\n4. Buscar un veh�culo." 
											+ "\n5. Modificar un vehiculo"
											+ "\n6. Salir.");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				//nuevoVehiculo(vehiculos);
			System.out.println("�Qu� tipo de veh�culo quieres?"
					+ "\n [1] coche"
					+ "\n [2] moto");
			int opcionVehiculo = sc.nextInt();
			switch(opcionVehiculo) {
			case 1:
				
				Coche coche = new Coche();
				System.out.println("Propietario:");
				coche.setPropietario(sc.nextLine());
				
				boolean existe = true;
				while(existe) {
					System.out.println("Matricula:");
					String matricula = sc.next();
					sc.nextLine();
					if(a.matriculaExiste(matricula)) {
						System.out.println("Esa matricula ya existe.");
					}else {
						coche.setMatricula(matricula);
						existe = false;
					}
				}
				System.out.println("Kilometros:");
				coche.setKilometros(sc.nextDouble());
				System.out.println("Fecha matricula:");
				coche.setFechaMatr(sc.nextInt());
				System.out.println("Marca:");
				coche.setMarca(sc.nextLine());
				System.out.println("Modelo:");
				coche.setModelo(sc.nextLine());
				System.out.println("puertas:");
				coche.setnPuertas(sc.nextInt());
				System.out.println("Color:");
				coche.setColor(sc.nextLine());
				
				
				
				a.a�adirVehiculo(coche);


				break;
			}
				
				break;

			case 2:
				//mostrarVehiculos(vehiculos);
				
				System.out.println("Seleccione tipo de veh�culo: " + "\n1. Coche." + "\n2. Moto."+"\n3. Todos los veh�culos");
				int mostrarTipo = sc.nextInt();
				sc.nextLine();
				switch(mostrarTipo) {
				
				case 1:
					System.out.println("LISTA DE COCHES GUARDADOS: ");
					a.listarCoches();
					break;
					
				case 2:
					System.out.println("LISTA DE MOTOS GUARDADOS: ");
					a.listarMotos();
					break;
				
				case 3:
					System.out.println("LISTA DE TODOS LOS VEHICULOS GUARDADOS: ");
					a.listarVehiculos();
					break;
				}
				
				break;
			case 5:
				System.out.println("Seleccione la posicion del arraylist");
				int posicion = sc.nextInt();
				if(a.getVehiculo(posicion).getClass().getSimpleName().equalsIgnoreCase("coche")) {
					Coche cocheModificar = new Coche();
					System.out.println("Propietario:");
					cocheModificar.setPropietario(sc.nextLine());
					
					boolean existe = true;
					while(existe) {
						System.out.println("Matricula:");
						String matricula = sc.next();
						sc.nextLine();
						if(a.matriculaExiste(matricula)) {
							System.out.println("Esa matricula ya existe.");
						}else {
							cocheModificar.setMatricula(matricula);
							existe = false;
						}
					}
					System.out.println("Kilometros:");
					cocheModificar.setKilometros(sc.nextDouble());
					System.out.println("Fecha matricula:");
					cocheModificar.setFechaMatr(sc.nextInt());
					System.out.println("Marca:");
					cocheModificar.setMarca(sc.nextLine());
					System.out.println("Modelo:");
					cocheModificar.setModelo(sc.nextLine());
					System.out.println("puertas:");
					cocheModificar.setnPuertas(sc.nextInt());
					System.out.println("Color:");
					cocheModificar.setColor(sc.nextLine());
					a.modificarVehiculo(cocheModificar, posicion);
				}else {
					
				}
				
				break;
				
			case 6:
				System.out.println("Saliendo...");
				salir = true;
				break;

			default:
				System.out.println("Opci�n incorrecta. Elija otra");
			}

		}


	}

}
