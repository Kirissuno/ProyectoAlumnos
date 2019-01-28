package clases;

/**
 * 
 * @author Samuel, Raúl, Gonzalo, Robert
 * @version 1.0
 */

public class Alumnos {
	private String nombre;
	private int edad;
	private int nModulos;
	private Notas notas;
	
	/**
	 * 
	 * @param Nombre del alumno
	 * @param Edad del alumno
	 * @param N�mero de módulos del alumno
	 * @param Las notas de cada módulo del alumno
	 */
	
	//Constructor para comprobar la edad y nmodulos del alumno
	public Alumnos(String nombre, int edad, int nModulos, Notas notas) {

		this.nombre = nombre;
		if (edad > 0) {
			this.edad = edad;
		}else {
			throw new IllegalArgumentException ("Edad de "+nombre+" incorrecta");
		}
		if (nModulos > 0 && nModulos <= 3) {
			this.nModulos = nModulos;
		}else {
			throw new IllegalArgumentException ("N�mero de m�dulos m�ximos: 3");
		}
		
		this.notas = notas;

		
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}else {
			throw new IllegalArgumentException ("Edad de "+nombre+" incorrecta");
		}
		
	}
	
	/**
	 * @return the nModulos
	 */
	public int getnModulos() {
		return nModulos;
	}

	/**
	 * @param nModulos the nModulos to set
	 */
	public void setnModulos(int nModulos) {
		if (nModulos > 0 && nModulos <= 3) {
			this.nModulos = nModulos;
		}else {
			throw new IllegalArgumentException ("N�mero de m�dulos m�ximos: 3");
		}
	}

	/**
	 * @return the notas
	 */
	public Notas getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(Notas notas) {
		this.notas = notas;
	}
	
	
	
	@Override
	public String toString() {
		return nombre + " tiene " + edad + " a�os y est� matriculado en " + nModulos + " m�dulos, sus notas son: " + notas;
	}

}
