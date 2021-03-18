package Desafio_Final;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class InsterfaceGUI extends JFrame {
    CadastroGUI list = new CadastroGUI();
    private JTabbedPane tabbedPane1;
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton cadastrarButton;
    private JButton procurarButton;
    private JButton alterarButton;
    private JButton excluirButton;
    private JTextField textField8;
    private JTextField textField9;

    private String user, myDriver, password, myUrl;

    public InsterfaceGUI(){
        add(contentPane);
        setSize(400,320);
        setTitle("CRUD Operator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome, email, senha;
                nome = textField1.getText();
                email = textField2.getText();
                senha = textField8.getText();
                System.out.println(nome+" "+email+" "+senha);
                try{
                    Connection conn = ConnectionFactory.createConnectionToMySQL();
                    //The mysql insert statement
                    String query = "INSERT INTO final_table (nome, login, senha, date_create)"
                            + "values(?, ?, ?, ?)";
                    // A SQL insert preparestatement
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(1, nome);
                    preparedStmt.setString(2, email);
                    preparedStmt.setString(3, senha);
                    preparedStmt.setDate(4, (Date) list.getStartDate());

                    preparedStmt.execute();
                }catch(Exception a){
                    System.out.println("Erro: " + a.getMessage());
                }
            }
        });
        procurarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id;
                id = textField3.getText();
                try{
                    Connection conn = ConnectionFactory.createConnectionToMySQL();

                    String query = "SELECT * FROM final_table WHERE id = ?";
                    // A SQL insert preparestatement
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(1, id);
                    preparedStmt.execute();
                    ResultSet set = preparedStmt.getResultSet();

                    System.out.println("Id - Nome - Email - Senha - Data");
                    while (set.next()) {
                        String idExibir = set.getString("id");
                        String nome = set.getString("nome");
                        String login = set.getString("login");
                        String senha = set.getString("senha");
                        String data = set.getString("date_create");
                        System.out.println(idExibir+": - "+nome+" - "+login+" - "+senha+" - "+data);
                    }
                }catch(Exception a){
                    System.out.println("Erro: " + a.getMessage());
                }
            }
        });
        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id, nome, email, senha;
                id = textField4.getText();
                nome = textField6.getText();
                email = textField7.getText();
                senha = textField9.getText();

                try{
                    Connection conn = ConnectionFactory.createConnectionToMySQL();
                    String query = "UPDATE final_table SET nome = ?, login = ?, senha = ?, date_create = ? WHERE id ="+ id;
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(1, nome);
                    preparedStmt.setString(2, email);
                    preparedStmt.setString(3, senha);
                    preparedStmt.setDate(4, (Date) list.getStartDate());
                    // A SQL insert preparestatement update DemoTable set FirstName=? where Id=?
                    preparedStmt.executeUpdate();

                    conn.close();
                }catch(Exception a){
                    System.out.println("Erro: " + a.getMessage());
                }
            }
        });
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id;
                id = textField5.getText();
                try{
                    Connection conn = ConnectionFactory.createConnectionToMySQL();

                    String query = "DELETE FROM final_table WHERE id = ?";
                    // A SQL insert preparestatement
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(1, id);

                    preparedStmt.execute();
                }catch(Exception a){
                    System.out.println("Erro: " + a.getMessage());
                }
            }
        });
    }
}