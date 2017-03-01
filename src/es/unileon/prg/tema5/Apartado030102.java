package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a operadores.
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030102 extends Apartado {

	protected String obtenerPractica(){
		return "P-VAR";
	}

	protected String obtenerBloque() {
		return "Operadores";
	}

	/**
	 * Operadores - Ejercicio1.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo para realizar las operaciones solicitadas
	 */
	public void ejercicio01() {
		cabecera("01","Utilizacion de operadores aritmeticos");

		// Inicio modificacion
		final int CONST=128;
		int op1;
		int op2;
		int resultado;
		//Preincrementa op1 y multiplicalo por 12
		//El valor de op2 es la suma op1 predecrementado con CONST
		//Halla el resto de dividir op2 entre op1 y guardalo en resultado
		//Muestra por pantalla los valores de op1, op2 y resultado
      // Fin modificacion
	}

	/**
	 * Operadores - Ejercicio2.
	 *
	 * </br>
	 *
	 * Se pide completar el codigo para calcular el valor de rebaja
	 */
	public void ejercicio02() {
		cabecera("02", "Utilizacion de operadores logicos");

		// Inicio modificacion
		int edad;
		int numeroPartes;
		boolean deportivo;
		boolean rebaja;
		// rebaja = expresion booleana
		System.out.println("Rebaja = " + rebaja);
		// Fin modificacion
	}

	/**
	 * Operadores - Ejercicio3.
	 *
	 * </br>
	 *
	 * Se pide calcular cuantas horas, minutos y segundos hay en 56000 segundos
	 */
	public void ejercicio03() {
		cabecera("03", "Calculos aritmeticos");

		// Inicio modificacion
		int segundos, horas, minutos;
		int totalSegundos=56000;
		// Realizacion de calculos
		System.out.println(horas+"h "+minutos+"m "+segundos+"s ");
		// Fin modificacion
	}
}
