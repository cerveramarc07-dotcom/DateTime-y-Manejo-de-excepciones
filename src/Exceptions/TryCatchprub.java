package Exceptions;

public class TryCatchprub {
	public static void main (String[] args) {
	
		/*Ejercicio 2: Evitando el colapso del programa (Java Errors / Try-Catch)
		Enunciado:
		Crea un arreglo (array) que contenga los nombres de tres ciudades. A continuación, intenta imprimir en consola el 
		elemento que estaría en la posición 5. Envuelve este código en un bloque try-catch 
		para capturar la excepción generada y muestra un mensaje 
		amigable al usuario en lugar del texto en rojo del sistema. 
		Añade un bloque finally que imprima "Proceso de búsqueda finalizado".
		*/
		
		String[] ciudades = {"Valencia", "Madrid", "Barcelona"};
		
		try {
		System.out.println(ciudades[5]);
		}catch(Exception Error){
			System.out.println("Solo hay 3 indices");
		}
		
		finally {
			System.out.println("Proceso de búsqueda finalizado");
		}
	}
}
