package pl.sdacademy.unit.test.advance.exercises.parametrized.valuesource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    /*
        true:
        null
        ""
        " "
        "  "

        false:
        "sda"
        " sda"
        " sda "
     */

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  "})
    void shouldReturnTrueIfStringIsBlank(String argument){
        //when
        boolean result = StringUtil.isBlank(argument);
        //then
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"sda", "    sda", "   sda    "})
    void shouldReturnFalseIfStringIsNotBlank(String input) {
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueIfStringIsNull() {
        //when
        boolean result = StringUtil.isBlank(null);
        //then
        assertTrue(result);
    }
}