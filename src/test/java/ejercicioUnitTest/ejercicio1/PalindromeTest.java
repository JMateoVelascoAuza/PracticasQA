package ejercicioUnitTest.ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @ParameterizedTest(name = "Test: la palabra ''{0}'' es un palíndromo: {1}")
    @CsvSource({
            "jose, false",
            "hola, false",
            "oro, true",
            "'', true",
            "AnitaLavaLaTina, true",
    })

    public void testIsPalindrome(String word, boolean expectedResult) {
        Palindrome palindrome = new Palindrome();
        Assertions.assertEquals(expectedResult, palindrome.isPalindrome(word), "ERROR! La palabra ingresada no es palindrome");
    }
}
