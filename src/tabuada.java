import java.util.Scanner;

public class tabuada {
    public static void Tabua(){
        int number;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para saber sua tabuada:  ");
        number = in.nextInt();

        for(int i =0; i <= 10; i++){
            if(number < 0){
                System.out.println("ERRO\nTabuada invalida");
            }else{
                int resultado = number * i;
                System.out.println(number +"x" +i+" = " +resultado);
            }
        }

    }
}
