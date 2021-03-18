import java.sql.*;
import java.util.Calendar;
import java.util.Scanner;

public class JavaMysqlPreparedStatementInsertExample {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);

        String nome;
        String sobrenome;

        System.out.println("Digite um nome aí: ");
        nome = in.nextLine();

        System.out.println("Digite o sobrenome nome: ");
        sobrenome = in.nextLine();
        try{
            // A MySQL database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/nome_da_Base_dados";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "H53f15l55");

            //A SQL date object so we can use it in our INSERT statement
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

            //The mysql insert statement
            String query = "INSERT INTO users (first_name, last_name, date_created, is_admin, num_points)"
                    + "values(?, ?, ?, ?, ?)";

            // A SQL insert preparestatement
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, nome);
            preparedStmt.setString(2, sobrenome);
            preparedStmt.setDate(3, startDate);
            preparedStmt.setBoolean(4, false);
            preparedStmt.setInt(5, 5000);

            Statement statement = conn.createStatement();
            statement.executeQuery("SELECT * FROM users");//Dúvida 1: pq q o select tá aparencendo atrasado?

            // execute the preparedstatement
            preparedStmt.execute();

            ResultSet set = statement.getResultSet();

            while (set.next()) {
                System.out.printf("%d: %15s - %10s\n", //Dúvida 2: como eu faço pra exibir data e os outros treco
                        set.getInt("id"),
                        set.getString("first_name"),
                        set.getString("last_name"));
            }

            conn.close();


        }catch (Exception e){
            System.out.println("Got an exception!");
            System.out.println(e.getMessage());
        }
    }
}
