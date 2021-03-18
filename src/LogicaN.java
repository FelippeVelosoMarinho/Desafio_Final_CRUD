import java.util.Scanner;

public class LogicaN {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner in= new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num2 = in.nextInt();

        System.out.println("Digite a quantidade de vezes que você deseja que o número digitado anteriormente seja somado: ");
        num1 = in.nextInt();
        /*String repete = new String(new char[num1]).replace("\0", num2 + "+");
        System.out.println(repete);*/
        System.out.print(num2);
        for(int i =1; i < num1; i++){
            System.out.print( " + "+ num2);
        }
        System.out.println(" = " + (num2 * num1));
    }
}
