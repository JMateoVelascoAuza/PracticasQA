package ejercicioUnitTest.ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BancoTest {
    ASFI asfiMock = Mockito.mock(ASFI.class);
    @Test
    public void verifyMaximoPrestamo() {
        Mockito.when(asfiMock.getCategoria("454566")).thenReturn("A");
        Mockito.when(asfiMock.getCategoria("999999")).thenReturn("B");
        Mockito.when(asfiMock.getCategoria("77777")).thenReturn("C");

        Banco banco = new Banco();
        banco.setAsfi(asfiMock);

        int actual = banco.getMaximoPrestamo("454566");
        //int actual = banco.getMaximoPrestamo("999999");
        int expected = 200000;
        //int expected = 100000;
        Assertions.assertEquals(expected, actual, "ERROR! El Prestamo Es Incorrecto");
        Assertions.assertThrows(IllegalStateException.class, () -> banco.getMaximoPrestamo("77777"));

        // PASO 5  verificar que el mock y los métodos mockeados se usen
        Mockito.verify(asfiMock).getCategoria("454566");
        //Mockito.verify(asfiMock).getCategoria("999999");
        Mockito.verify(asfiMock).getCategoria("77777");
    }
}
