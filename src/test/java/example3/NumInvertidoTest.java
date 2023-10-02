package example3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumInvertidoTest {
    @ParameterizedTest
    @CsvSource({
            // Casos límite y valores normales
            "-1,Valor Incorrecto",
            "0,0",
            "1,1",
            "100,001",
            "123,321",
            "8,8",
            "80,08",

            // Casos extremos
            "-2147483648,Valor Incorrecto", // Valor mínimo para un entero en Java
            "2147483647,7463847412"  // Valor máximo para un entero en Java
    })
    public void verifyInvertir(int inputValue, String expectedResult) {
        NumInvertido numInv = new NumInvertido();
        String actualResult = numInv.invertir(inputValue);
        Assertions.assertEquals(expectedResult, actualResult, "ERROR! El número invertido es incorrecto");
    }
}
