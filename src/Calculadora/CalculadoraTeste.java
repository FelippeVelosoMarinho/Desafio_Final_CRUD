import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    Calculadora calculadora = new Calculadora(3,3);

    @Test
    public void testSetSoma(){
        Assertions.assertEquals(6, calculadora.getSoma(),0);
    }
    @Test
    public void testSetSubtracao(){
        Assertions.assertEquals(0,calculadora.getSubtracao(),0);
    }
    @Test
    public void testSetMultiplicacao(){
        Assertions.assertEquals(9,calculadora.getMultiplicacao(),0);
    }
    @Test
    public void testSetDivisao(){
        Assertions.assertEquals(1,calculadora.getDivisao(),0);
    }
}
