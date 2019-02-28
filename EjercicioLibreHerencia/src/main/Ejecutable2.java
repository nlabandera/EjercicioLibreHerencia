package main;

import java.util.*;
import clases.*;

public class Ejecutable2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vehiculos v = new Vehiculos();

		Vehiculo c1 = new Coche("Oihane", "9993DYH", 210521, 2005, "Opel", "Astra", 5, "Azul");
		v.añadirVehiculo(c1);
		
		Vehiculo c2 = new Coche("David", "0963JFG", 210521, 2005, "Ford", "Fiesta", 3, "Blanco");
		v.añadirVehiculo(c2);

		Vehiculo m1 = new Moto("Nerea", "4185HNS", 15023, 2013, "Kymco", 125, TipoMoto.SCOOTER);
		v.añadirVehiculo(m1);

		Vehiculo m2 = new Moto("Iku", "1992KPT", 5012, 2018, "Kymco", 500, TipoMoto.DEPORTIVA);
		v.añadirVehiculo(m2);

		Vehiculo c3 = new Coche("Nerea", "0954CHZ", 100321, 2003, "Peugeot", "206", 3, "Gris");
		v.añadirVehiculo(c3);

		String matricula="";
		boolean salir = false;

		int opcion;

		while (!salir) {
			System.out.println(
					"Qué quieres hacer?" 	+ "\n1. Añadir un vehiculo." 
											+ "\n2. Listar los vehículos existentes."
											+ "\n3. Borrar un vehículo." 
											+ "\n4. Buscar un vehículo." 
											+ "\n5. Modificar un vehiculo"
											+ "\n6. Salir.");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

//CREAION DE VEHICULOS			
			
			case 1:
			System.out.println("¿Qué tipo de vehículo quieres?"
					+ "\n [1] coche"
					+ "\n [2] moto");
			int opcionVehiculo = sc.nextInt();
			switch(opcionVehiculo) {
			case 1:
				
				Coche coche = new Coche();
				System.out.println("Propietario:");
				coche.setPropietario(sc.nextLine());
				sc.next();
				
				boolean existe = true;
				while(existe) {
					System.out.println("Matricula:");
					matricula = sc.next();
					sc.nextLine();
					if(v.existeVehiculo(matricula)) {
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
				coche.setMarca(sc.next());
				System.out.println("Modelo:");
				coche.setModelo(sc.next());
				System.out.println("Nº de puertas:");
				coche.setnPuertas(sc.nextInt());
				System.out.println("Color:");
				coche.setColor(sc.next());
				
				v.añadirVehiculo(coche);
				break;
				
				
			case 2:
				Moto moto = new Moto();
				System.out.println("Propietario:");
				moto.setPropietario(sc.next());
				
				boolean existeMoto = true;
				while(existeMoto) {
					System.out.println("Matricula:");
					matricula = sc.next();
					if(v.existeVehiculo(matricula)) {
						System.out.println("Esa matricula ya existe.");
					}else {
						moto.setMatricula(matricula);
						existeMoto = false;
					}
				}
				System.out.println("Kilometros:");
				moto.setKilometros(sc.nextDouble());
				System.out.println("Fecha matricula:");
				moto.setFechaMatr(sc.nextInt());
				System.out.println("Marca:");
				moto.setMarca(sc.next());
				System.out.println("Cilindrada:");
				moto.setCilindrada(sc.nextInt());
				System.out.println("Tipo de moto:" +"\t1. Scooter"+"\t1. Deportiva"+"\t1. Cross");
				int tipodeMoto=sc.nextInt();
				switch(tipodeMoto) {
				case 1:
					moto.setTipo(TipoMoto.SCOOTER);
					break;
				case 2: 
					moto.setTipo(TipoMoto.DEPORTIVA);
					break;
				case 3: 
					moto.setTipo(TipoMoto.CROSS);
					break;
				default:
					System.out.println("Ese tipo de moto no existe");
					
				}
				
				v.añadirVehiculo(moto);
			}
			
				
				
			break;
			
//LISTADO DE VEHICULOS

			case 2:
				
				
				System.out.println("Seleccione tipo de vehículo: " + "\n1. Coche." + "\n2. Moto."+"\n3. Todos los vehículos");
				int mostrarTipo = sc.nextInt();
				sc.nextLine();
				switch(mostrarTipo) {
				
				case 1:
					System.out.println("LISTA DE COCHES GUARDADOS: ");
					v.listarCoches();
					break;
					
				case 2:
					System.out.println("LISTA DE MOTOS GUARDADOS: ");
					v.listarMotos();
					break;
				
				case 3:
					System.out.println("LISTA DE TODOS LOS VEHICULOS GUARDADOS: ");
					v.listarVehiculos();
					
					break;
				}
				
				break;

//BORRAR VEHICULOS
				
			case 3:
				System.out.println("Introduzca la matricula del vehículo que quiere eliminar");
				matricula = sc.nextLine();
				
				
				System.out.println("Vehículo "+(v.sacaPosicion(matricula)+1) +" eliminando..." );
				v.borrarVehiculo(v.sacaPosicion(matricula));
				
				break;
				
//BUSCAR VEHÍCULO
			
			case 4:
				System.out.println("Introduzca la matricula del vehículo que quiere buscar:");
				matricula = sc.nextLine();
				
				//boolean existeVehiculo = true;
				if(v.existeVehiculo(matricula)) {
					System.out.println("El vehículo existe en la posicion "+(v.sacaPosicion(matricula)));
				}
				else {
					System.out.println("El vehículo con matrícula "+matricula+" no existe");
				}
				
				
				break;
				
				
				
//MODIFICAR UN VEHICULO EXISTENTE
				
			case 5:
				System.out.println("Seleccione la posicion del arraylist");
				int posicion = sc.nextInt();
				
				if(v.getVehiculo(posicion).getClass().getSimpleName().equalsIgnoreCase("coche")) {
					Coche cocheModificar = new Coche();
					System.out.println("Propietario:");
					cocheModificar.setPropietario(sc.nextLine());
					System.out.println("Matricula:");
					cocheModificar.setMatricula(sc.next());	
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
					
					v.modificarVehiculo(cocheModificar, posicion);
				}
				else if(v.getVehiculo(posicion).getClass().getSimpleName().equalsIgnoreCase("moto")) {
					Moto motoModificar = new Moto();
					System.out.println("Propietario:");
					motoModificar.setPropietario(sc.nextLine());
					System.out.println("Matricula:");
					motoModificar.setMatricula(sc.next());	
					System.out.println("Kilometros:");
					motoModificar.setKilometros(sc.nextDouble());
					System.out.println("Fecha matricula:");
					motoModificar.setFechaMatr(sc.nextInt());
					System.out.println("Marca:");
					motoModificar.setMarca(sc.nextLine());
					System.out.println("Cilindrada:");
					motoModificar.setCilindrada(sc.nextInt());
					System.out.println("Tipo de moto:" +"\t1. Scooter"+"\t1. Deportiva"+"\t1. Cross");
					int tipodeMoto=sc.nextInt();
					switch(tipodeMoto) {
					case 1:
						motoModificar.setTipo(TipoMoto.SCOOTER);
						break;
					case 2: 
						motoModificar.setTipo(TipoMoto.DEPORTIVA);
						break;
					case 3: 
						motoModificar.setTipo(TipoMoto.CROSS);
						break;
					default:
						System.out.println("Ese tipo de moto no existe");
						
					}
					
					
					v.modificarVehiculo(motoModificar, posicion);
					
				}
				
				break;
				
			case 6:
				System.out.println("Saliendo...");
				salir = true;
				break;

			default:
				System.out.println("Opción incorrecta. Elija otra");
			}

		}


	}

}
