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
		int op1=14;
		int op2;
		int resultado;
		//Preincrementa op1 y multiplicalo por 12
		++op1;
		op1=op1*12;
		//El valor de op2 es la suma op1 predecrementado con CONST
		op2=op1-CONST;
		//Halla el resto de dividir op2 entre op1 y guardalo en resultado
		resultado=op2%op1;
		//Muestra por pantalla los valores de op1, op2 y resultado
		System.out.println("El resultado es " + resultado);
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
		int edad=20;
		int numeroPartes=2;
		boolean deportivo = false;
		boolean rebaja = (edad>=40 && edad<=60&&numeroPartes<=3)||(deportivo!=true && numeroPartes<=1 && edad>=20);
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
		int segundos, horas, minutos, resto;
		int totalSegundos=56000;
		segundos=totalSegundos;
		// Realizacion de calculos

		horas=segundos/3600;
		resto=segundos%3600;
		minutos=resto/60;
		resto=segundos%60;
		segundos=resto;

		System.out.println(horas+"h "+minutos+"m "+segundos+"s ");
		// Fin modificacion
	}
}
