import java.util.Scanner;

public class Gerente extends Funcionario{

    private int senha;

    Scanner in= new Scanner(System.in);

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public boolean autentica(int senhaD){
        System.out.println("Digite a senha: ");
        senha = in.nextInt();

        if (senhaD == senha){
            System.out.println("Seus dados serão exibidos logo abaixo...");
            System.out.println("Nome: "+ this.getNome());
            System.out.println("CPF: "+ this.getCpf());
            System.out.println("Salário: R$ "+this.getSalario());
            return true;
        }else{
            System.out.println("A senha está incorreta!!");
            return false;
        }
    }
}
