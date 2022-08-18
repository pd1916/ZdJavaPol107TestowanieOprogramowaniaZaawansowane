package pl.sdacademy.unit.test.advance.exercises.parametrized.csvsource;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "kajak, true",
            "sda, false",
            "radar, true",
            "kobyla ma maly bok, true"})
    void shouldVerifyIfInputIsPalindrome(String input, boolean expectedResult) {
        //when
        boolean result = PalindromeChecker.isPalindrome(input);
        //then
        assertEquals(expectedResult, result);
    }

    @ParameterizedTest
    @CsvFileSource(
            resources = "/palindrome.csv"
            //lineSeparator = "|",
            //numLinesToSkip = 2
    )
    void shouldVerifyIfInputIsPalindrome_CsvFileSource(String input, boolean expectedResult) {
        //when
        boolean result = PalindromeChecker.isPalindrome(input);
        //then
        assertEquals(expectedResult, result);
    }

}