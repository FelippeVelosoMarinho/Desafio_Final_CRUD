import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class BomDTN {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Data/Hora: "+data);

        Calendar c = Calendar.getInstance();
        String dataFormat = new SimpleDateFormat("dd/MM/yyyy").format(data);
        int hora = c.get(Calendar.HOUR_OF_DAY);
        String periodo = "";


        System.out.println("\n==============================");

        if(hora > 6 && hora < 12){
            periodo=" da manha";
            System.out.println("Bom dia");
        }else if(hora > 12 && hora < 18){
            periodo=" da tarde";
            System.out.println("Boa tarde");
        }else {
            periodo=" da noite";
            System.out.println("Boa noite");
        }
        System.out.println("Agora são "+hora+" horas"+periodo+" do dia "+dataFormat);
    }
}
