package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * El metodo "toString()"
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030203 extends Apartado {

	protected String obtenerPractica(){
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Metodo <<toString()>>";
	}

	/**
	 * IMetodo <<toString()>> - Ejercicio1.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Eliminar los comentarios del metodo <<toString()>> de la clase
	 *      <<Persona>>
	 * <li> Compilar y ejecutar
	 * <li> Analizar los resultado obtenidos
	 * <li> Explicar en el fichero LEEME.txt el porque de los resultados
	 * </ul>
	 */
	public void ejercicio01() {
		cabecera("01","El metodo <<toString()>>");

		// Inicio modificacion
		Alumno alumno = new Alumno("1000011111","Pepe");
		alumno.asignarNota(6.0f);

		System.out.println(5);
		System.out.println(10.5);
		System.out.println("Cadena de caracteres");
		System.out.println(alumno);
        // Fin modificacion
	}

	/**
	 * Metodo <<toString()>> - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide modificar el fichero Profesor.java a fin de mostrar por pantalla
	 * la informacion que define al profesor.
	 */
	public void ejercicio02() {
		cabecera("02", "El metodo <<toString()>>");

		// Inicio modificacion
		Profesor profesor = new Profesor("4000011111","Juan");
		System.out.println(profesor);
		// Fin modificacion
	}
}
