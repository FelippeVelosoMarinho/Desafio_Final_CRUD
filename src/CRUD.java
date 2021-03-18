package Desafio_Final;

import java.sql.*;

public class CRUD {
    Cadastro list = new Cadastro();
    public void insert(){
        try{
            Connection conn = ConnectionFactory.createConnectionToMySQL();
            //The mysql insert statement
            String query = "INSERT INTO final_table (nome, login, senha, date_create)"
                    + "values(?, ?, ?, ?)";
            // A SQL insert preparestatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, list.getNome());
            preparedStmt.setString(2, list.getEmail());
            preparedStmt.setString(3, list.getSenha());
            preparedStmt.setDate(4, (Date) list.getStartDate());

            preparedStmt.execute();
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public void update(){
        try{
            Connection conn = ConnectionFactory.createConnectionToMySQL();
            String query = "UPDATE final_table SET nome = ?, login = ?, senha = ?, date_create = ? WHERE id ="+ list.getId();
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, list.getNome());
            preparedStmt.setString(2, list.getEmail());
            preparedStmt.setString(3, list.getSenha());
            preparedStmt.setDate(4, (Date) list.getStartDate());
            // A SQL insert preparestatement update DemoTable set FirstName=? where Id=?
            preparedStmt.executeUpdate();

            conn.close();
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public void delete(){
        try{
            Connection conn = ConnectionFactory.createConnectionToMySQL();

            String query = "DELETE FROM final_table WHERE id = ?";
            // A SQL insert preparestatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, list.getId());

            preparedStmt.execute();
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public void select(){
        try{
            Connection conn = ConnectionFactory.createConnectionToMySQL();
            System.out.println(list.getStartDate());
            Statement statement = conn.createStatement();
            statement.executeQuery("SELECT * FROM final_table");

            ResultSet set = statement.getResultSet();
            System.out.println("Id - Nome - Email - Senha - Data");
            while (set.next()) {
                String id = set.getString("id");
                String nome = set.getString("nome");
                String login = set.getString("login");
                String senha = set.getString("senha");
                String data = set.getString("date_create");
                System.out.println(id+": - "+nome+" - "+login+" - "+senha+" - "+data);
            }
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public void selectOne(){
        try{
            Connection conn = ConnectionFactory.createConnectionToMySQL();

            String query = "SELECT * FROM final_table WHERE id = ?";
            // A SQL insert preparestatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, list.getId());
            preparedStmt.execute();
            ResultSet set = preparedStmt.getResultSet();

            System.out.println("Id - Nome - Email - Senha - Data");
            while (set.next()) {
                String id = set.getString("id");
                String nome = set.getString("nome");
                String login = set.getString("login");
                String senha = set.getString("senha");
                String data = set.getString("date_create");
                System.out.println(id+": - "+nome+" - "+login+" - "+senha+" - "+data);
            }
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}