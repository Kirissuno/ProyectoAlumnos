package main;

import java.util.Scanner;
import clases.Alumnos;
import clases.Lista;
import clases.Notas;

/**
 * 
 * @author Samuel, Raúl, Gonzalo, Robert
 * @version 1.0
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ms = new Scanner(System.in);
		Scanner my = new Scanner(System.in);
		Lista ls = new Lista();
		
		//Creación de los alumnos
		try {
			ls.nuevoAlumno(new Alumnos("Robert", 21, 1, new Notas(10)));
			ls.nuevoAlumno(new Alumnos("Pedraso", 18, 2, new Notas(10,7)));
			ls.nuevoAlumno(new Alumnos("Juanma", 22, 3, new Notas(9,9,2)));
		}catch (IllegalArgumentException errores) {
			System.out.println(errores);
		}
				
		//Men�
		System.out.print(ls.tamano()+" ");
		System.out.println("Alumnos");
		System.out.println("---------------");
		ls.listado();
		System.out.println("");
		System.out.println("¿Qué deseas hacer? \n1. Editar notas \n2. Hacer media de los alumnos y ver cuantos son. \n3. Ver lista alumnos ordenada \nPara salir introduce otro número." );
		int opcion = ms.nextInt();
		
		switch (opcion) {
		case 1:
			
			boolean salir = false;
			String nombre = "";
			do {
				System.out.println("Introduce el nombre del alumno al que deseas cambiar las notas.");
				nombre = my.nextLine();
	
				int posicion = ls.buscarAlumno(nombre);
				
				if (posicion >= 0) {
					System.out.println("Alumno "+nombre +" encontrado en la posición "+ posicion);
					ls.cambiaNotas(posicion);
					ls.listado();
					salir = true;
				}else if (nombre.equals("fin")) {
					System.out.println("Adios.");
				}else {
					System.out.println("Nombre no encontrado");
				}
			}while ( salir == false && !nombre.equals("fin"));
			break;
			
		case 2: 
			break;
		
		case 3:
			ls.listadoOrdenado();
			break;
			
		default:
			break;

		}
		
		
		my.close();
		ms.close();

	}

}
