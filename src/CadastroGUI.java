package Desafio_Final;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CadastroGUI {
    Scanner in= new Scanner(System.in);
    private String id;
    private String nome;
    private String senha;
    private String email;
    private Date startDate;

    public String getId() {
        System.out.println("Digite o id desejado: ");
        id = in.nextLine();
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        System.out.println("Digite um nome aí: ");
        nome = in.nextLine();
        return nome;
    }
    public void setNome(String nome) {
        this.nome= nome;
    }
    public String getSenha() {
        System.out.println("Digite a sua senha: ");
        senha = in.nextLine();
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        System.out.println("Digite o seu e-mail: ");
        email=in.nextLine();
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Date getStartDate() {
        //A SQL date object so we can use it in our INSERT statement
        Calendar c = Calendar.getInstance();

        java.sql.Date startDate = new java.sql.Date(c.getTime().getTime());
        String data = new SimpleDateFormat("dd/MM/yyyy").format(startDate);
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}