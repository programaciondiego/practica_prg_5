package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "StringBuffer"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030202 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<StringBuffer>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<StringBuffer>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide:
    * Anexar a la cadena cada una de las variables definidas en el codigo, mostrando por pantalla el resultado de cada operacion.
    * Explicar en el fichero LEEME.txt la diferencia entre lenght() y capacity().
    */
       public void ejercicio01() {
         cabecera("01","");
         StringBuffer cadena=new StringBuffer("Viaje al Parnaso");
         System.out.println(cadena.length());
         System.out.println(cadena.capacity());
         boolean logica=true;
         String otraCadena="Cervantes";
         int año=1616;
      
      // Inicio modificacion
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<StringBuffer>> - Ejercicio2.
    *
    * </br>
    *
    * Se pide:
    * Insertar en la posicion 9 del StringBuffer un String con valor mitico.
    *	Establecer en la posicion 9 del StringBuffer una letra M.
    */
       public void ejercicio02() {
         cabecera("02", "");
         StringBuffer cadena=new StringBuffer("Viaje al Parnaso");
      // Modificaciones
      
         System.out.println(cadena.toString());
      
      }
   
   /**
    * Cadenas de caracteres - Clase <<StringBuffer>> - Ejercicio3.
    *
    * </br>
    *
    * Se pide:
    * Reemplaza el texto Parnaso por Castalia.
    *	Borra la letra l.
    */
       public void ejercicio03() {
         cabecera("03", "");
      
         StringBuffer cadena=new StringBuffer("Viaje al Parnaso");
      // Modificaciones
      
         System.out.println(cadena.toString());
      }
   
   /**
    * Cadenas de caracteres - Clase <<StringBuffer>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide invertir el texto almacenado en cadena.
    */
       public void ejercicio04() {
         cabecera("04", "");
      
         StringBuffer cadena=new StringBuffer("Viaje al Parnaso");
      // Modificaciones
      
         System.out.println(cadena.toString());  
      }
   
   /**
    * Cadenas de caracteres - Clase <<StringBuffer>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide realizar las tareas necesarias para que cadena almacene el valor "viaje desde Arcadia al Parnaso"
	 * Mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
      
     	StringBuffer cadena=new StringBuffer("Viaje al Parnaso");
		String otraCadena=new String("Viaje desde Arcadia");
		//modificaciones
      }
   
   }
