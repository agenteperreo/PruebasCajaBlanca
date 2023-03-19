package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Clase en la que definiremos los test de junit para la clase SumaNumeros
 * Los valores para la variable num seran: 1, 2, 6, 9
 * Y los respectivos expected serán: 0, 2, 8, 20
 * 
 * @author isaac
 *
 */
class SumaNumerosTest {

	@ParameterizedTest
	@MethodSource("pruebaSumaNumeros")
	void testSumaNumeros(int num, int expected) {
		SumaNumeros sumNum = new SumaNumeros();
		
		int res = sumNum.sumaNumeros(num);
		
		assertEquals(expected, res);
	}
	
	private static Stream<Arguments> pruebaSumaNumeros() {
		return Stream.of(
						Arguments.of(1, 0),
						Arguments.of(2, 2),
						Arguments.of(9, 20),
						Arguments.of(6, 12));
	}

}
