package main;
import java.util.*;

import clases.*;



public class ejecutable {
	
	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public static void main(String[] args) {
		
		Vehiculo c1=new Coche ("Oihane","4521DYH",210521, 2005, "Opel","Astra", 5, "Azul");
		vehiculos.add((Coche)c1);
		Vehiculo m2=new Moto ("Nerea", "4185HNS", 15023, 2013, "Kymco", 125, TipoMoto.SCOOTER);
		vehiculos.add((Vehiculo)m2);
		
		
		boolean salir = false;
		
		int opcion;
		
		while(!salir) {
			System.out.println("Qué quieres hacer?"
					+ "\n1. Añadir un vehiculo."
					+ "\n2. Mostrar los vehículos existentes."
					+ "\n3. Borrar un vehículo."
					+ "\n4. Buscar un vehículo."
					+ "\n5. Salir.");
			
			
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch(opcion) {
				case 1:
					nuevoVehiculo(vehiculos);
					break;
				
				case 2: 
					mostrarVehiculos(vehiculos);
					break;
				
				case 3: 
					//borrarVehiculo(vehiculos);
					break;
					
				case 4: 
					//buscarVehiculo(vehiculos);
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
	
	//Fin del main
	
	
	//Metodos
	
	public static void nuevoVehiculo(ArrayList<Vehiculo> vehiculos) {
		
		
		
		//String propietario;
		String matricula;
		double kilometros=0;
		int fecha_matr=0;
		String marca="";
		TipoMoto tipoMoto = null;
		
		System.out.println("Seleccione tipo de vehículo: "
				+"\n1. Coche."
				+"\n2. Moto. ");
		int tipoVehiculo=sc.nextInt();
		
		switch(tipoVehiculo) {
			case 1:
				Coche c = new Coche();
				System.out.println(("¿Quién es el propietario?: "));
				String propietario = sc.nextLine();
				sc.next();
				c.setPropietario(propietario);
				
				System.out.println("Introduce resto de datos: ");
				
				System.out.println("Matricula: ");
				matricula = sc.nextLine();
				sc.next();
				c.setMatricula(matricula);
				
				System.out.println("Fecha de matriculacion: ");
				fecha_matr = sc.nextInt();
				c.setFechaMatr(fecha_matr);
				
				System.out.println("Kilometros del vehículo: ");
				kilometros = sc.nextDouble();
				c.setKilometros(kilometros);
				
				System.out.println("Marca: ");
				marca = sc.nextLine();
				sc.next();
				c.setMarca(marca);
				
				System.out.println("Modelo: ");
				String modelo = sc.nextLine();
				//sc.next();
				c.setModelo(modelo);
				
				System.out.println("Número de puertas: ");
				int npuertas = sc.nextInt();
				c.setnPuertas(npuertas);
				
				System.out.println("Color: ");
				String color = sc.nextLine();
				sc.next();
				c.setColor(color);
				
				vehiculos.add((Vehiculo)c);
				
				
				break;
				
			
			case 2:
				Moto m = new Moto();
				System.out.println(("¿Quién es el propietario?: "));
				propietario = sc.nextLine();
				
				m.setPropietario(propietario);
				sc.next();
				
				
				System.out.println("Introduce resto de datos: ");
				System.out.println("Matricula: ");
				matricula = sc.nextLine();
				sc.nextLine();
				m.setMatricula(matricula);
				
				System.out.println("Fecha de matriculación: ");
				fecha_matr = sc.nextInt();
				sc.next();
				m.setFechaMatr(fecha_matr);
				
				System.out.println("Kilometros del vehículo: ");
				kilometros = sc.nextDouble();
				//sc.next();
				m.setKilometros(kilometros);
				
				System.out.println("Marca: ");
				marca = sc.nextLine();
				sc.next();
				m.setMarca(marca);
				
				System.out.println("Cilindrada: ");
				int cilindrada = sc.nextInt();
				//sc.next();
				m.setCilindrada(cilindrada);
				
				System.out.println("Tipo: "
						+"\n1. SCOOTER"+"\n2. CROSS"+"\n3. DEPORTIVA");
						int selec = sc.nextInt();
						switch(selec) {
						case 1: tipoMoto=TipoMoto.SCOOTER; break;
						case 2: tipoMoto=TipoMoto.CROSS; break;
						case 3: tipoMoto=TipoMoto.DEPORTIVA; break;
						}
						m.setTipo(tipoMoto);
				vehiculos.add(m);
						
				break;
		
		}
		
		

	}
	
	public static void mostrarVehiculos(ArrayList<Vehiculo> vehiculos) {
		System.out.println("LISTA DE VEHICULOS GUARDADOS: ");
		for(int i=0; i<vehiculos.size(); i++) {
			System.out.println("\nVehiculo "+(i+1)+"\n");
			System.out.println(vehiculos.get(i).toString()+"\n");
		}
	}
	
	public static void mostrarColor() {
		System.out.println(vehiculos.get(0));
	}

}
