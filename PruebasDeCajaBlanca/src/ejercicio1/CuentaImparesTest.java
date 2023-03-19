package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Clase en la que definiremos los test de junit para la clase CuentaImpares 
 * Los valores para la variable num seran: 0, 2, 5, 9 
 * Y los respectivos expected serán: 0, 1, 3, 5
 * 
 * @author isaac
 *
 */
class CuentaImparesTest {

	@ParameterizedTest
	@MethodSource("sumaImpares")
	void testCuentaImpares(int num, int expected) {
		CuentaImpares imp = new CuentaImpares();

		int res = imp.cuentaImpares(num);

		assertEquals(expected, res);
	}

	private static Stream<Arguments> sumaImpares() {
		return Stream.of(
						Arguments.of(2, 1), 
						Arguments.of(5, 3), 
						Arguments.of(0, 0), 
						Arguments.of(9, 5)
						);
	}
}
