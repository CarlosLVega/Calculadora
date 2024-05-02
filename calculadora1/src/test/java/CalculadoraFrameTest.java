import com.mycompany.calculadora1.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraFrameTest {

    @Test
    public void testSuma() {
        int resultado = Calculadora.calcular(3, 4, "+");
        assertEquals(7, resultado);
    }

    @Test
    public void testResta() {
        int resultado = Calculadora.calcular(5, 2, "-");
        assertEquals(3, resultado);
    }

    @Test
    public void testMultiplicacion() {
        int resultado = Calculadora.calcular(3, 4, "*");
        assertEquals(12, resultado);
    }

    @Test
    public void testDivision() {
        int resultado = Calculadora.calcular(8, 2, "/");
        assertEquals(4, resultado);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        Calculadora.calcular(8, 0, "/");
    }

}
