package es.unileon.prg.tema5;

/**
 * Clase que representa un profesor.
 *
 * @author PRG
 * @version 1.0
 */
public class Profesor {
	/**
	 * Identificador del profesor
	 *
	 * @see String
	 */
	private String _niu;
	/**
	 * Nombre del profesor
	 *
	 * @see String
	 */
	private String _nombre;

	/**
	 * Constructor de la clase. Crea un profesor con la informacion recibida
	 *
	 * @param niu
	 *            Identificador del profesor
	 * @param nombre
	 *            Nombre del profesor
	 */
	public Profesor(String niu, String nombre) {
		_niu = niu;
		_nombre = nombre;
	}

	public String toString(){

		StringBuffer salida = new StringBuffer();

		salida = salida.append("Niu del profesor: "      + _niu);
		salida = salida.append("  Nombre del profesor: " + _nombre);

		return salida.toString();
	}
}

