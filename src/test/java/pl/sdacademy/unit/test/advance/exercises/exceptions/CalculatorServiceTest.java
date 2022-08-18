package pl.sdacademy.unit.test.advance.exercises.exceptions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorServiceTest {

    /*
    1) null, null
    2) "123", null
    3) null, "123"
     */

    @ParameterizedTest
    @MethodSource("provideData")
    void shouldThrowExceptionWhenAnyOfArgumentsIsNull(String input1, String input2) {
        //when & then
        //Junit5
//        assertThrows(IllegalArgumentException.class,
//                () -> CalculatorService.add(input1, input2));

        //AssertJ
        assertThatThrownBy(() -> CalculatorService.add(input1, input2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Arguments 'a' and 'b' are required.");
    }

    static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(null, null),
                Arguments.of("123", null),
                Arguments.of(null, "123")
                //Arguments.of("456", "123")
        );
    }

}