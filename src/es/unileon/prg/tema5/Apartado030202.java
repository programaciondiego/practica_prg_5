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

         cadena = cadena.append(logica);
         System.out.println(cadena);

         cadena = cadena.append(otraCadena);
         System.out.println(cadena);

         cadena = cadena.append(año);
         System.out.println(cadena);

         System.out.println("length acutal: "   + cadena.length());
         System.out.println("capacity actual: " + cadena.capacity());

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
         cabecera("02", "Insertar valores en el StringBuffer");
         StringBuffer cadena=new StringBuffer("Viaje al Parnaso");
      // Modificaciones
      
         String otraCadena = "mitico ";

         cadena = cadena.insert(9,otraCadena);

         System.out.println(cadena.toString());

         cadena = cadena.replace(9, 10, "M");

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
         cabecera("03", "Reemplazar y borrar en el StringBuffer");
         StringBuffer cadena=new StringBuffer("Viaje al Parnaso");
      // Modificaciones
        
         cadena = cadena.replace(cadena.indexOf("Parnaso"), cadena.length(), "Castalia");

         System.out.println(cadena.toString());

         cadena = cadena.replace(cadena.lastIndexOf("l"), cadena.lastIndexOf("l")+1 , "" );

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
         cabecera("04", "Invertir el texto almacenado");
      
         StringBuffer cadena=new StringBuffer("Viaje al Parnaso");

      // Modificaciones
      
         cadena = cadena.reverse();

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
         cabecera("05","Almacenar 'viaje desde Arcadia al Parnaso'");
      
     	 StringBuffer cadena=new StringBuffer("Viaje al Parnaso");
	   	 String otraCadena=new String("Viaje desde Arcadia");

		//Modificaciones

       StringBuffer cadenaFinalBuffer=new StringBuffer();
       String cadenaFinal = otraCadena.toLowerCase().substring(otraCadena.indexOf("V"), otraCadena.indexOf("e")+1);

       cadenaFinalBuffer = cadenaFinalBuffer.append(cadenaFinal);
       cadenaFinalBuffer = cadenaFinalBuffer.append(otraCadena.replace("Viaje", "") + cadena.replace(cadena.indexOf("V"), otraCadena.indexOf("e")+1, ""));

       System.out.println(cadenaFinalBuffer);

      }
   
   }
