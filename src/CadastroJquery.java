package Desafio_Final;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CadastroJquery {
    CRUDMetodos cm = new CRUDMetodos();
    CadastroMetodos list = new CadastroMetodos();
    @Test
    public void testInsert(){
        Assertions.assertEquals(cm.insert("Felippe", "felippe@gmail.com", "12345"),cm.insert("Felippe", "felippe@gmail.com", "12345"));
        Assertions.assertNotNull(list.getNome());
        Assertions.assertNotNull(list.getEmail());
        Assertions.assertNotNull(list.getSenha());
        Assertions.assertNotNull(list.getStartDate());
    }
    @Test
    public void testUpdate(){
        Assertions.assertEquals(cm.update("Felippe", "felippe@gmail.com", "12345"), cm.update("Pablo","pablo@gmail.com", "123"));
        Assertions.assertEquals("5",list.getId());
    }
    @Test
    public void testDelete(){
        Assertions.assertEquals(cm.delete("2"), cm.delete("6"));
        //Assertions.assertNotNull(list.getId());
    }
    @Test
    public void testSelect(){
        Assertions.assertEquals(cm.selectOne("5"), cm.selectOne("5"));
    }
}