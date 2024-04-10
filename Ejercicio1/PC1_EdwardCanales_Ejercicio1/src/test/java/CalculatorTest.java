import org.example.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum_PositiveNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 + 5 deberia ser 15");
    }
    @Test
    public void testSum_NegativeNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        assertEquals(-15, resultado, "-10 + -5 deberia ser -15");
    }
    // Assert
    @Test
    public void testSum_PositiveAndNegativeNumbers_ShouldReturnCorrectSum() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = 5;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(-5, resultado, "-10 + 5 deberia ser -5");
    }

    @Test
    public void testRes_PositiveNumbers_ShouldReturnCorrectRes() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(5, resultado, "10 - 5 deberia ser 5");
    }
    @Test
    public void testRes_NegativeNumbers_ShouldReturnCorrectRes() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(-5, resultado, "-10 - -5 deberia ser -5");
    }
    @Test
    public void testRes_PositiveAndNegativeNumbers_ShouldReturnCorrectRes() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = -5;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(15, resultado, "10 - -5 deberia ser 15");
    }
    @Test
    public void testRes_NegativeAndPositiveNumbers_ShouldReturnCorrectRes() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = 5;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(-15, resultado, "-10 - 5 deberia ser -15");
    }

    @Test
    public void testMul_PositiveNumbers_ShouldReturnCorrectMul() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(50, resultado, "10 * 5 deberia ser 50");
    }
    @Test
    public void testMul_NegativeNumbers_ShouldReturnCorrectMul() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(50, resultado, "-10 * -5 deberia ser 50");
    }
    @Test
    public void testMul_PositiveAndNegativeNumbers_ShouldReturnCorrectMul() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = -5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(-50, resultado, "10 * -5 deberia ser -50");
    }
    @Test
    public void testMul_NegativeAndPositiveNumbers_ShouldReturnCorrectMul() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = 5;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(-50, resultado, "-10 * 5 deberia ser -50");
    }

    @Test
    public void testDiv_PositiveNumbers_ShouldReturnCorrectDiv() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = 5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(2, resultado, "10 / 5 deberia ser 2");
    }
    @Test
    public void testDiv_NegativeNumbers_ShouldReturnCorrectDiv() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = -5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(2, resultado, "-10 / -5 deberia ser 2");
    }
    @Test
    public void testDiv_PositiveAndNegativeNumbers_ShouldReturnCorrectDiv() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = -5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(-2, resultado, "10 / -5 deberia ser -2");
    }
    @Test
    public void testDiv_NegativeAndPositiveNumbers_ShouldReturnCorrectDiv() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = 5;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(-2, resultado, "-10 / 5 deberia ser -2");
    }
    @Test
    public void testDiv_PositiveAndZeroNumbers_ShouldReturnExceptionDiv() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = 10;
        int numeroB = 0;

        // Act
        double resultado = calculador.division(numeroA, numeroB);
        // Assert
        assertEquals("",resultado, "Division por cero");

    }
    @Test
    public void testDiv_NegativeAndZeroNumbers_ShouldReturnExceptionDiv() {
        // Arrange
        Calculator calculador = new Calculator();
        int numeroA = -10;
        int numeroB = 0;

        // Act
        double resultado = calculador.division(numeroA, numeroB);
        // Assert
        assertEquals("",resultado, "Division por cero");

    }
}
