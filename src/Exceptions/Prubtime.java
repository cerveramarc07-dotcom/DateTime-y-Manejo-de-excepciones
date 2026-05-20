package Exceptions;

import java.time.*;
import java.time.format.DateTimeFormatter;


/* Ejercicio 1: Formateo de Fecha y Hora (Java Date and Time)
   Enunciado: Escribe un programa que obtenga la fecha y hora actual del sistema. Luego, utiliza un formateador para 
   mostrar esa fecha en la consola con el formato exacto: dd-MM-yyyy HH:mm:ss (por ejemplo: 23-05-2026 15:30:00).
*/

public class Prubtime {
	public static void main(String[] args) {
		
		LocalDate fechaActual = LocalDate.now();
		
		System.out.println(fechaActual);
		
		LocalTime horaActual = LocalTime.now();
		
		System.out.println(horaActual);
		
		LocalDateTime horafechaActual = LocalDateTime.now();
		
		System.out.println(horafechaActual);
		
		DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd/MM/YYYY, HH:mm:ss");
		
		String datatimeformateado = horafechaActual.format(formateo);
		
		System.out.println(datatimeformateado);

	}
}