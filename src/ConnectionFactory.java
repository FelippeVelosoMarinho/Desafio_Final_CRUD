package Desafio_Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class ConnectionFactory {
    private static String myDriver;//"com.mysql.cj.jdbc.Driver"
    private static String user;//"root"
    private static String password;//"H53f15l55"
    private static String myUrl; //"jdbc:mysql://localhost:3306/nome_da_Base_dados"

    public void dados(){
        Scanner in= new Scanner(System.in);
        System.out.println("Digite o driver que deseja para a conexão: exp:'com.mysql.cj.jdbc.Driver'");
        myDriver = in.nextLine();
        System.out.println("Digite o nome do usuário: exp:'root'");
        user = in.nextLine();
        System.out.println("Digite a senha do servidor: ");
        password = in.nextLine();
        System.out.println("Digite a URL do servidor: exp:'jdbc:mysql://localhost:3306/nome_da_Base_dados'");
        myUrl = in.nextLine();
    }

    public static Connection createConnectionToMySQL() throws Exception{
        Class.forName(myDriver);
        Connection connection = DriverManager.getConnection(myUrl, user, password);
        return connection;
    }
    public static void main(String[]args) throws Exception {

        ConnectionFactory cf = new ConnectionFactory();
        cf.dados();
        try (Connection conn = createConnectionToMySQL()) {

            if (conn != null) {
                System.out.println("Conexão realizada com sucesso");
                conn.close();
            }
        }catch (Exception e){
            System.out.println("Got an exception!");
            System.out.println(e.getMessage());
        }
    }
}