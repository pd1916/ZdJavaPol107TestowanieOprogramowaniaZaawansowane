package pl.sdacademy.unit.test.advance.exercises.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @MethodSource("provideDataForMultiply")
    void shouldMultiplyTwoValues(int firstDigit, int secondDigit, int expectedResult) {
        //when
        int result = Calculator.multiply(firstDigit, secondDigit);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldThrowExceptionWhenSecondDigitIsEqulaToZero() {
       //when & then
       //assertJ
       assertThatThrownBy(() -> Calculator.divide(5, 0))
               .isInstanceOf(IllegalArgumentException.class)
               .hasMessage("Nie dziel przez zero!");

       //Junit5
//        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5, 0));
    }

    private static Stream<Arguments> provideDataForMultiply() {
        return Stream.of(
                Arguments.of(2, 3, 6),
                Arguments.of(5, 4, 20),
                Arguments.of(1, 7, 7)
        );
    }
}