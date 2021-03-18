public class Letras {
    public static void main(String[] args){
        String letras = "abcadefghijklmcopqrsdeftuvz";

        //Testa indexOf PARA LOCALIZAR UM CARACTERE EM UM STRING

        System.out.printf("Último 'c' está localizado no index %d\n",letras.indexOf('c'));
        System.out.printf("Último 'a' está localizado no index %d\n",letras.indexOf('a',1));

        //-1 Não Existe
        System.out.printf("'$' está localizado no index %d\n\n", letras.indexOf('$'));

        //Testa lastIndexOf para Localizar um caractereem uma string
        System.out.printf("'c' está localizado no index %d\n\n", letras.lastIndexOf('c'));
        System.out.printf("Último 'a' está localizado no index %d\n",letras.lastIndexOf('a',5));
        System.out.printf("Último '$' está localizado no index %d\n",letras.lastIndexOf('$'));

        //Testa lastIndexOf para Localizar um caractereem uma string
        System.out.printf("\"def\" está localizado no index %d\n",letras.lastIndexOf("def"));

        //2 argumento string e outro o ponto inicial que começará a pesquisa
        System.out.printf("\"def\" está localizado no index %d\n",letras.indexOf("def",7));
        System.out.printf("\"hello\" está localizado no index %d\n",letras.indexOf("hello"));
    }
}
