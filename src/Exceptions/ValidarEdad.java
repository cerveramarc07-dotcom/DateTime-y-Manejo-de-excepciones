package Exceptions;
import java.time.*;
public class ValidarEdad {
	public static void main(String[] args) {
		/*  Ejercicio 3: Lanzando excepciones basadas en fechas (Combinado)
			Enunciado:
			Crea un programa que valide el año de nacimiento de un usuario. 
			Define una variable con un año de nacimiento (por ejemplo, 2030). 
			Utiliza LocalDate para obtener el año actual. 
			Si el año de nacimiento proporcionado es mayor al año actual, utiliza la palabra clave throw para lanzar una 
			ArithmeticException con el mensaje "Acceso denegado - El año de nacimiento no puede estar en el futuro".
		*/
		
		int anyoUsuario = 2007;
		
		int anyoActual = LocalDate.now().getYear();
		
		if(anyoUsuario > anyoActual) {
			throw new ArithmeticException("Acceso Denegado");
		}else {
			int edad = anyoActual -  anyoUsuario;
			System.out.println("El usuario tiene " + edad + " años");
		}
		
		
	}
}
