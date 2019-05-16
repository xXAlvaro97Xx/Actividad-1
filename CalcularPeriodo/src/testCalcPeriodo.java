import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class testCalcPeriodo {

	@Test
	void testcalcularPeriodo() {
		CalcularPeriodo c = new CalcularPeriodo();
		LocalDate date = LocalDate.of(1997, 12, 14);
		assertEquals(c.calcularPeriodo("Nacimiento", date), "Nacimiento ocurrió hace 21 años, 5 meses y 2 días.");
		
	}

}
