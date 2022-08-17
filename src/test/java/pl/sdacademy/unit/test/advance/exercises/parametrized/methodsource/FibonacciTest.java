package pl.sdacademy.unit.test.advance.exercises.parametrized.methodsource;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import pl.sdacademy.unit.test.advance.exercises.parametrized.methodsource.provider.FibonacciProvider;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @ParameterizedTest
    //@MethodSource("provideData") //gdy metoda jest w tej samej klasie
    //@MethodSource("pełnaScieżka + . + nazwaKlasy + # + nazwaMetody
    @MethodSource("pl.sdacademy.unit.test.advance.exercises.parametrized.methodsource.provider.FibonacciProvider#provideData")
    void shouldReturnCorrectValue(int input, int expectedResult, String text) {
        //when
        int result = Fibonacci.getValueFromIndex(input);
        //then
        assertEquals(expectedResult, result);
    }

//    private static Stream<Arguments> provideData() {
//        return Stream.of(
//                Arguments.of(0, 0, null),
//                Arguments.of(1, 1, "text1"),
//                Arguments.of(8, 21, "text2")
////                Arguments.of(new Customer("Paweł", "Dudko")),
////                Arguments.of(new Customer("Ala", "Nowak")),
////                Arguments.of(null)
//        );
//    }

}