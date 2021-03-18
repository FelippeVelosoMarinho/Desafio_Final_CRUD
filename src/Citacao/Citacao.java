import java.util.Scanner;

public class Citacao {
    public void CitacaoName(){
        Scanner in = new Scanner(System.in);
        String nome;
        String iniciais = "";

        System.out.println("Digite o nome completo: ");
        nome = in.nextLine();

        nome = nome.replace(" da " ," ");
        nome = nome.replace(" do " ," ");
        nome = nome.replace( " e " ," ");
        nome = nome.replace(" das " ," ");
        nome = nome.replace(" dos " ," ");

        int num1 = nome.indexOf(' ')+1;//8   A primeira letra do sobrenome após  primeiro espaço
        //int num3 = num1 + 1;//9    A primeira letra do sobrenome após  primeiro espaço

        int num2 = nome.lastIndexOf(' ')+1;//15  A primeira letra do sobrenome após o último espaço

        int inicio = 0;
        int fim = nome.indexOf(" " ,inicio);

        while(fim != -1){
            iniciais += nome.substring(inicio, inicio+1) + ". ";
            inicio =fim+1;
            fim = nome.indexOf(" ", inicio);
        }

        System.out.print(nome + " -> ");
        System.out.print(nome.substring(num2, nome.length()).toUpperCase().trim()+", ");
        System.out.println(iniciais.toUpperCase().trim());

        /*System.out.print(nome + " -> ");
        System.out.print(nome.substring(num2, nome.length()).toUpperCase()+", ");
        System.out.print(nome.substring(0, 1).toUpperCase()+". ");
        System.out.println(nome.substring(num1,num3).toUpperCase()+". ");*/

    }
}
