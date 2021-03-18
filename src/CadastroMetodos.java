package Desafio_Final;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CadastroMetodos {
    private String id;
    private String nome;
    private String senha;
    private String email;
    private Date startDate;

    public String getId() {
        id = "5";
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        this.nome = "Helio";
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        senha = "12345";
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        email = "helio@gmail.com";
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
