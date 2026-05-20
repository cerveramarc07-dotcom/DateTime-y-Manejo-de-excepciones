package Exceptions;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatTimeDate {
	public static void main(String[] args) {
	/* Ejercicio 1: Formateo de Fecha y Hora (Java Date and Time)
		Enunciado: Escribe un programa que obtenga la fecha y hora actual del sistema. Luego, utiliza un formateador para 
		mostrar esa fecha en la consola con el formato exacto: dd-MM-yyyy HH:mm:ss (por ejemplo: 23-05-2026 15:30:00).
	*/
		
		LocalDateTime HoraFecha = LocalDateTime.now();
		
		DateTimeFormatter formateoDT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String HoraFechaFormat = HoraFecha.format(formateoDT);
		
		System.out.println(HoraFechaFormat);
		
		
	}
}
