import java.util.Scanner;

public class TestaCitacao {
    public static void main(String[] args){
        int valor;

        Scanner in = new Scanner(System.in);

        Citacao citacao = new Citacao();
        citacao.CitacaoName();
        System.out.println("\n---------------------------------\nDeseja consultar outro nome?\n1 - Sim\n2 - Não");
        valor = in.nextInt();

        while (valor == 1){//laço de repetição
            citacao.CitacaoName();
            System.out.println("---------------------------------\nDeseja consultar outro nome?\n1 - Sim\n2 - Não");
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
