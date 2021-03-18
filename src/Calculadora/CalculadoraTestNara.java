import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTestNara {

    CalculadoraNara calc = new CalculadoraNara(10,2);
    CalculadoraNara calc2 = new CalculadoraNara(1,0);

    @Test
    public void testAdicao() {
        Assertions.assertEquals(12, 0, calc.getSoma());
    }

    @Test
    public void testSubtracao() {
        Assertions.assertEquals(10, 0, calc.getSubtracao());
    }

    @Test
    public void testMultiplicacao() {
        Assertions.assertEquals(21, 0, calc.getMultiplicacao());
    }

    @Test
    public void testDivisao() {
        Assertions.assertEquals(5, 0, calc.getDivisao());
    }

    @Test
    public void testAdicao2() {
        Assertions.assertEquals(8, 0, calc2.getSoma());
    }

    @Test
    public void testDivisao2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc2.getDivisao());

    }



}
