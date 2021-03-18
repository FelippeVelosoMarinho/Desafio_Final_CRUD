import java.util.Scanner;

public class TesteTabuada {
    public static void main(String[] args){
        tabuada tf = new tabuada();
        tf.Tabua();

        Scanner in= new Scanner(System.in);
        int decisao;

        System.out.println("Deseja consultar outro número?\n1 - Sim\n2 - Não");
        decisao = in.nextInt();

        while (decisao == 1) {
            tf.Tabua();
            System.out.println("Deseja consultar outro número?\n1 - Sim\n2 - Não");
            decisao = in.nextInt();
            if(decisao == 2){
                System.out.println("Você escolheu sair");
            }
            else if(decisao != 1 && decisao != 2){
                System.out.println("Opção desconhecida");
            }
        }
    }
}
