package clases;

import java.util.Scanner;

/**
 * 
 * @author Samuel, Raúl, Gonzalo, Robert
 * @version 1.0
 *
 */

public class Lista {
	private Alumnos [] lista;
	private int nAlumnos;
	
	/**
	 * @param Es la lista de nombre, edad, nmodulos y notas de los alumnos
	 * @param Es la cantidad de alumnos del centro
	 */
	
	//Constructor vacío de la lista, que inicializa el array.
	public Lista( ) {
		nAlumnos = 0;
		lista = new Alumnos[nAlumnos];
		// TODO Auto-generated constructor stub
	}
	
	//Método para añadir un nuevo alumno que hace uso del método buscar para verificar si ya existe.
	public void nuevoAlumno(Alumnos alumno) {
		int existe = buscarAlumno(alumno.getNombre());
		if ( existe >= 0 ) {
			System.out.println("ERROR al a�adir "+ alumno.getNombre() + " porque ya existe");
		}else {
			Alumnos [] soporte = new Alumnos[nAlumnos+1];
			for (int i = 0; i < lista.length; i++) {
				soporte[i] = lista[i];
			}
			soporte[nAlumnos]=alumno;
			nAlumnos ++;
			lista=soporte;
		}
		
	}
	
	//Método buscar alumno para ver si existe y devolver su posición
	public int buscarAlumno(String nombre) {
		boolean encontrado = false;
		int posicion = -1;
		
		try {
			for(int i = 0; i < lista.length && encontrado == false; i++) {
				if( nombre.equals(lista[i].getNombre()) ) {
					encontrado = true;
					posicion = i;
				}
			}
		}catch (Exception e) {
			posicion = -1;
		}
		return posicion;
	}

	//Método para cambiar las notas de los alumnos.
	public void cambiaNotas(int posicion) {
		Alumnos alumno = lista[posicion];
		Scanner my = new Scanner(System.in);
		Scanner ms = new Scanner(System.in);
		
		int nModulos = alumno.getnModulos();
		
		if (nModulos == 1) {
			System.out.println("Introduce la nota de tu m�dulo");
			int nota = my.nextInt();
			alumno.setNotas(new Notas(nota));
		}else if (nModulos == 2) {
			System.out.println("Introduce sus 2 notas");
			int nota = ms.nextInt();
			int nota2 = ms.nextInt();
			
			alumno.setNotas(new Notas(nota,nota2));
		}else {
			System.out.println("Introduce sus 3 notas");
			int nota = ms.nextInt();
			int nota2 = ms.nextInt();
			int nota3 = ms.nextInt();
			alumno.setNotas(new Notas(nota,nota2,nota3));
		}		
		ms.close();
		my.close();
	}
	
	
	//Método para devolver el tama�o de la lista de alumnos.
	public int tamano() {
		int tamano = lista.length;
		return tamano;
	}
	
	//Método para listar todos los alumnos
	public void listado() {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
	
	//Método para ordenar la lista, no terminado
	public void listadoOrdenado() {
		Alumnos [] aux = new Alumnos[lista.length];
		aux = lista;
		for (int i = 0; i < aux.length; i++) {
			System.out.println(aux[i]);
		}
	}
	
	
	

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
