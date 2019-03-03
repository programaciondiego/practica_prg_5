package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener el numero de caracteres de la cadena.
    * Calcular la posicion intermedia de la cadena.
    * Extraer el caracter que ocupa dicha posicion.
    * Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","Mostrar el caracter en la posicion intermedia");
         String cadena = "En un lugar de la Mancha";
        // Inicio modificacion

         char car; 
         int longitud = cadena.length(), mitad = cadena.length()/2, unicode = cadena.charAt(cadena.length()/2);

         car = cadena.charAt(mitad);

         System.out.println("El caracter en la posicion intermedia es '"+car+"' y su codigo es "+unicode);

    
         //Ejercicio simplificado usando lo visto en el ejercicio 09 sobre el valueOf

         System.out.println("El caracter en la posicion intermedia es '"+cadena.charAt(cadena.length()/2)+"' y su codigo es "+ Integer.valueOf(cadena.charAt(cadena.length()/2)));


        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    * Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    * Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "Compara dos cadenas de caracteres");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion

         String cadenaLower = cadena.toLowerCase();
         String otraCadenaLower = otraCadena.toLowerCase();

         System.out.println("La comparacion no ignorando es: "                    + cadena.compareTo(otraCadena));
         System.out.println("La comparacion ignorando las mayusculas es:"         + cadena.compareToIgnoreCase(otraCadena));
         System.out.println("La comparacion de las dos cadenas en minusculas es " + cadenaLower.compareTo(otraCadenaLower));

      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Concatenar las dos cadenas formando una tercera usando el operador +
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "Concatenar cadenas");
      
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Persiles y Segismunda";
      // Inicio modificacion

         String cadenaFinalSum;
         String cadenaFinalConcat;

         cadenaFinalSum= cadena+" "+otraCadena;
         cadenaFinalConcat= cadena.concat(" " + otraCadena);

         System.out.println("Cadena con + : "     +cadenaFinalSum);
         System.out.println("Cadena con .concat: "+cadenaFinalConcat);

        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "Comprobacion final y principio de cadenas");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion

        Boolean comprobacionFinal = cadena.endsWith("Parnaso");
        Boolean comprobacionInicio = cadena.startsWith("Viaje");

        System.out.println("La compobacion del final es: "     + comprobacionFinal);
        System.out.println("La compobacion del principio es: " + comprobacionInicio);

        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","Busqueda de caracteres");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion

         System.out.println("La letra p esta en la posicion "                             + cadena.indexOf('p'));
         System.out.println("La cadena Par esta en la posicion "                          + cadena.indexOf("Par"));
         System.out.println("La ultima ocurrencia de la letra P es "                      + cadena.lastIndexOf('P'));
         System.out.println("La letra a empezando a buscar por la 3º posicion esta en la "+ cadena.toLowerCase().indexOf('a',3)+" ª posicion"); 

      // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "Remplazar ocurrencias");
      
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion

         System.out.println(cadena.replace('a','*'));
         System.out.println(cadena.replace("Parnaso","Olimpo"));

      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "Obtencion de subcadenas");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion

         int mitad    = cadena.length()/2;
         int primeraJ = cadena.indexOf('j');
         int ultimaS  = cadena.lastIndexOf('s');

         System.out.println(cadena.substring(mitad));
         System.out.println(cadena.substring(primeraJ, ultimaS));

      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "Quitar espacios sobrantes");
         String cadena = " La Galatea   ";
      // Inicio modificacion

         int primerEspacio = cadena.indexOf(' ');
         int ultimoEspacio = cadena.lastIndexOf(' ');

         System.out.println(cadena.substring(primerEspacio+1, ultimoEspacio-2));

      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "Convertir variables a string");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion
        
        String stringNumero       =  String.valueOf(numero);
        String stringExpresion    =  String.valueOf(expresion);
        String stringEnteroGrande =  String.valueOf(enteroGrande);

        System.out.println("Numero = "      +stringNumero);
        System.out.println("Expresion = "   +stringExpresion);
        System.out.println("EnteroGrande = "+stringEnteroGrande);

      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide compara las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "Comparar lexicograficamente");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion

         System.out.println("El resultado de comparar " + cadena + " con " + otraCadena + " es: " + cadena.compareTo(otraCadena));

      // Fin modificacion
      }
   }
