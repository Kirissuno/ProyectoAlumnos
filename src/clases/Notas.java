package clases;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Samuel, Raúl, Gonzalo, Robert
 * @version 1.0
 */

public class Notas {
	private List <Integer> notas = new ArrayList<Integer>();
	
	/**
	 * 
	 * @param Listado de notas del alumno
	 */

	public Notas(int n) {
		// TODO Auto-generated constructor stub
		if (n >= 0 && n<=10 ) {
			notas.add(n);
		}else {
			throw new IllegalArgumentException ("Las notas deben est�r comprendidas entre 0 y 10");
		}
	}
	
	public Notas(int n, int n2) {
		// TODO Auto-generated constructor stub
		if (n >= 0 && n<=10 && n2 >= 0 && n2<=10) {
			notas.add(n);
			notas.add(n2);
		}else {
			throw new IllegalArgumentException ("Las notas deben est�r comprendidas entre 0 y 10");
		}
	}
	
	public Notas(int n, int n2, int n3) {
		// TODO Auto-generated constructor stub
		if (n >= 0 && n <= 10 && n2 >= 0 && n2<=10 && n3 >= 0 && n3 <= 10) {
			notas.add(n);
			notas.add(n2);
			notas.add(n3);
		}else {
			throw new IllegalArgumentException ("Las notas deben est�r comprendidas entre 0 y 10");
		}
	}

	/**
	 * @return the notas
	 */
	public List<Integer> getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}
	
	
	@Override
	public String toString() {
		return notas.toString();
	}
	

}
