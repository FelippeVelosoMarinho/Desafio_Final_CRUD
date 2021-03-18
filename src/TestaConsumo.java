import java.util.Scanner;

public class TestaConsumo {
    public static void main(String[] args){
        int valor;

        Scanner in = new Scanner(System.in);

        ConsumoMedio consumo = new ConsumoMedio();//Classe instanciada
        consumo.Continhas();// método instanciado

        System.out.println("\nDeseja calcular novamente?\n1 - Sim\n2 - Não");
        valor = in.nextInt();

        while (valor == 1){//laço de repetição
            consumo.Continhas();
            System.out.println("\nDeseja calcular novamente?\n1 - Sim\n2 - Não");
            valor = in.nextInt();

            if(valor == 2){
                System.out.println("Ok, obrigado por consultar.");
            }
            else if(valor != 1 && valor != 2){
                System.out.println("Operação desconhecida.");
            }
        }
    }
}
