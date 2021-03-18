import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Felippe Veloso Marinho", "098.234.543-90", 1050.00);

        int valor;
        int valor2;
        System.out.println("Bem vindo ao Banco de dados 8000\nDeseja consultar seus dados?\n1 - Sim\n2 - Não");
        Scanner in = new Scanner(System.in);
        valor = in.nextInt();

        switch (valor) {//for(int i =0; i < 3; i++){}
            case 1:
                System.out.println(gerente.autentica(123));
                    System.out.println("Deseja tentar novamente?\n1 - Sim\n2 - Não");
                    valor2 = in.nextInt();
                    if(valor2 == 1){
                        System.out.println(gerente.autentica(123));
                    }
                    else if(valor2 == 2){
                        System.out.println("Ok, obrigado por utilizar!!");
                    }
                    else if(valor2 != 1 & valor2 != 2){
                        System.out.println("Opção desconhecida");
                }
                break;
            case 2:
                System.out.println("Ok, obrigado por utilizar!!");
                break;
            default:
                System.out.println("Operação desconhecida");
        }
    }
}
