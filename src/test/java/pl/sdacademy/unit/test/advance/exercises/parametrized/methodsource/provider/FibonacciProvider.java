package pl.sdacademy.unit.test.advance.exercises.parametrized.methodsource.provider;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class FibonacciProvider {

    public static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(0, 0, null),
                Arguments.of(1, 1, "text1"),
                Arguments.of(8, 21, "text2")
//                Arguments.of(new Customer("Paweł", "Dudko")),
//                Arguments.of(new Customer("Ala", "Nowak")),
//                Arguments.of(null)
        );
    }
}
