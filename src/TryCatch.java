public class TryCatch {

    public static void main(String[]args){
        String frase = null;
        try{
            frase.toUpperCase();

        }catch(NullPointerException e){
            System.out.println("=============================================");
            System.out.println("\n"+"Erro: "+e+"\n");
        }finally {
            frase="blablabla";
            System.out.println("=============================================");
            System.out.println("Frase: "+frase.toUpperCase()+"\n");
        }
    }
}
