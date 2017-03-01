package es.unileon.prg.tema5;

import java.math.BigDecimal;

/**
 * Clase con los ejercicios correspondientes a tipos de datos basicos.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030101 extends Apartado {

	protected String obtenerPractica() {
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Tipos de datos basicos";
	}

	/**
	 * Tipos de datos basicos - Ejercicio1.
	 *
	 * </br>
	 *
	 * Se pide modificar el codigo a fin de eliminar los errores de compilacion
	 * existentes. Los errores de compilacion tienen que ver con el manejo de
	 * tipos de datos basicos.
	 */
	public void ejercicio01() {
		cabecera("01", "Correccion de errores de compilacion");

		// Inicio modificacion
		Int entero = 6;
		long otroEntero = 1.000;
		long decimal = 7.0;
		double otroDecimal = 7,0;
		byte enteroDe8Bits = 10000;
		char caracter = a;
		char otroCaracter = "a";
		boolean booleano = "true";
		short enteroDe16Bits = 50000;

		byte static = 5;
		byte int = 3;
		double _otra-Variable = 2.0;
		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo a fin de determinar el tipo de dato mas
	 * adecuado para cada literal.
	 */
	public void ejercicio02() {
		cabecera("02", "Definicion de tipo de datos");

		// Inicio modificacion
		variable1 = 637;
		variable2 = 637L;
		variable3 = 6.37;
		variable4 = 6.37f;
		variable5 = 6.37d;
		variable6 = '6';
		variable7 = "6.37";
		variable8 = 'a';
		variable9 = "a";
		variable10 = true;
		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio3.
	 *
	 * </br>
	 *
	 * Se pide definir variables que permitan representar la informacion
	 * referida en los comentarios.
	 */
	public void ejercicio03() {
		cabecera("03", "Definicion de variables");

		// Inicio modificacion

		//Numero de asignaturas de un curso
		//Nota media de la asignatura
		//Edad de una persona
		//Salario mensual de un empleado
		//Nombre de una asignatura
		//Constante PI
		//Constante VERDADERO
		//Portal de la direccion de una vivienda
		//Piso de la direccion de una vivienda
		//Puerta la direccion de una vivienda

		// Fin modificacion
	}

	/**
	 * Tipos de datos basicos - Ejercicio4.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * <li> Explicar en el fichero LEEME.txt el porque de los resultados
	 * </ul>
	 */
	public void ejercicio04() {
		cabecera("04", "Formato decimales");

		// Inicio modificacion
		double valor1 = 2.8;
		double valor2 = 1.5;

		double resultado = valor1 - valor2;
		System.out.println(valor1+" - "+valor2+" = "+resultado);
		// Fin modificacion
	}


	/**
	 * Tipos de datos basicos - Ejercicio5.
	 *
	 * </br>
	 *
	 * Dado el siguiente fragmento de codigo se pide:
	 *
	 * <ul>
	 * <li> Compilar y ejecutar el metodo
	 * <li> Analizar los resultados obtenidos
	 * </ul>
	 */
	public void ejercicio05() {
		cabecera("05", "La clase <<BigDecimal>>");

		// Inicio modificacion
		BigDecimal valor1 = new BigDecimal("2.8");
		BigDecimal valor2 = new BigDecimal("1.5");

		System.out.println(valor1+" - "+valor2+" = "+valor1.subtract(valor2));
		// Fin modificacion
	}
}
