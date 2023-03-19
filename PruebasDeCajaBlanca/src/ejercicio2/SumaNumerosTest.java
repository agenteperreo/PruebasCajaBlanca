package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumaNumerosTest {

	@ParameterizedTest
	@MethodSource("pruebaSumaNumeros")
	void testSumaNumeros(int num, int expected) {
		SumaNumeros sumNum = new SumaNumeros();
		
		int res = sumNum.sumaNumeros(num);
		
		assertEquals(res, expected);
	}
	
	private static Stream<Arguments> pruebaSumaNumeros() {
		return Stream.of(
						Arguments.of(1, 0),
						Arguments.of(2, 2),
						Arguments.of(9, 20),
						Arguments.of(6, 8));
	}

}
