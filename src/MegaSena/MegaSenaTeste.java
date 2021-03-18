import java.util.Scanner;

public class MegaSenaTeste {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        MegaSena MS = new MegaSena();
        int opcao;

        System.out.println("========== Os números digitados devem estar entre 1 e 60 ==========");

        System.out.println("Deseja realizar a aposta manual ou automática? \n1 - Manual\n2 - Automática");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                MS.recebeN();
                MS.comparaN();
                MS.premio();
                break;
            case 2:
                MS.automatico();
                MS.comparaN();
                MS.premio();
                break;
            default:
                System.out.println("Opção desconhecida");
        }
    }
}