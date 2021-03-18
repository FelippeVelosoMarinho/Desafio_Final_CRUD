import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ParticipanteTeste {
    Participante participante = new Participante();

    @Test
    public void testSetNome(){
        participante.setNome("Fe");//set = valor recebido
        Assertions.assertEquals("Felippe", participante.getNome());//get = pegar o valor atribuido no set
    }
    @Test
    public void testSetIdade(){
        participante.setIdade(18);
        Assertions.assertEquals(18,participante.getIdade());
    }
}