import java.util.Calendar;
import java.util.Scanner;

public class DesafioFinal {
    Scanner in= new Scanner(System.in);

    private String username = "root";
    private String email = "";
    private String senha = "";

    public void login(){
        System.out.println("Digite seu email: ");
        email = in.nextLine();


        System.out.println("Digite sua senha: ");
        senha = in.nextLine();

        try{
            //conn = ConnectionFactory.createConnectionToMySQL();

            //A SQL date object so we can use it in our INSERT statement
            Calendar calendar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

            //The mysql insert statement
            String query = "INSERT INTO users (email, senha)"
                    + "values(?, ?)";

            // A SQL insert preparestatement
            /*PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, email);
            preparedStmt.setString(2, senha);

            Statement statement = conn.createStatement();
            statement.executeQuery("SELECT * FROM users");//Dúvida 1: pq q o select tá aparencendo atrasado?

            // execute the preparedstatement
            preparedStmt.execute();

            ResultSet set = statement.getResultSet();

            while (set.next()) {
                System.out.printf("%d: %15s - %10s\n", //Dúvida 2: como eu faço pra exibir data e os outros treco
                        set.getInt("id"),
                        set.getString("username"),
                        set.getString("email"),
                        set.getString("senha"));
            }

            System.out.println("Seu cadastro foi feito!");

            /*if (email.equals(databaseEmail) && senha.equals(databaseSenha)) {
                System.out.println("Successful Login!\n----");
            } else {
                System.out.println("Incorrect Password\n----");
            }

            conn.close();*/


        }catch (Exception e){
            System.out.println("Got an exception!");
            System.out.println(e.getMessage());
        }
    }

}
