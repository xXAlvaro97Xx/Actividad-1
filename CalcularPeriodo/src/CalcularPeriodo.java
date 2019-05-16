import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);	 
		// Mostramos cuánto tiempo ha pasado
		System.out.println(calcularPeriodo("El descubrimiento de América", fecha));
		
		LocalDate fecha2 = LocalDate.of(1872, Month.SEPTEMBER, 6);	
		System.out.println(calcularPeriodo("ALGO", fecha2));
		
		LocalDate fecha3 = LocalDate.of(2012, Month.JANUARY, 1);	 
		System.out.println(calcularPeriodo("FIN DEL MUNDO", fecha3));
		
		//Creamos la fecha de salida de Minecraft
		LocalDate fechaM = LocalDate.of(2009, Month.MAY, 17);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("La salida de Minecraft", fechaM);
	}
	
	public static String calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurrió hace %d años, %d meses y %d días.", anyos, meses, dias);
        return texto;
    }

}

